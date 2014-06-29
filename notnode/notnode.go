// Use Go as a Javascript VM for App Engine.
package notnode

import (
	"fmt"
	"github.com/robertkrimen/otto"
	"io/ioutil"
	"net/http"
)

func init() {
	http.HandleFunc("/", handleRequestFromJs("/"))
	http.HandleFunc("/easter", handleRequestFromJs("/easter"))
}

func handleRequestFromJs(path string) func(http.ResponseWriter, *http.Request){
	return func(w http.ResponseWriter, r *http.Request) {
		vm := otto.New()
		vm.Set("requestPath", path)
		vm.Set("printToWeb", func(call otto.FunctionCall) otto.Value {
			fmt.Fprint(w, call.Argument(0).String())
			return otto.Value{}
		})
		program, err := ioutil.ReadFile("main.js")
		if err != nil {
			panic(err)
		}
		vm.Run(string(program))
	}
}
