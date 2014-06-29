(defproject unnecessary-maven "0.1.0"
  :description "Use non-Maven JVM build tools on App Engine."
  :dependencies [^{:voom {:repo "https://github.com/weavejester/compojure"
                          :branch "master"}}
                 [compojure "1.2.0-20131030_015250-ge8b2abf"]
                 [org.clojure/clojure "1.6.0"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler java-build-tools.handler/app})
