(defproject unnecessary-maven "2.1.0"
  :description "Use non-Maven JVM build tools on App Engine."
  :dependencies [^{:voom {:repo "https://github.com/weavejester/compojure"
                          :branch "master"}}
                 [compojure "1.2.0-20141020_220747-gc82239c"]
                 [org.clojure/clojure "1.7.0-alpha2"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler unnecessary-maven.handler/app})
