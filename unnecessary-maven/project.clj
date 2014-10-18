(defproject unnecessary-maven "2.0.0"
  :description "Use non-Maven JVM build tools on App Engine."
  :dependencies [^{:voom {:repo "https://github.com/weavejester/compojure"
                          :branch "master"}}
                 [compojure "1.2.0-20131030_015250-ge8b2abf"]
                 [org.clojure/clojure "1.6.0"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler unnecessary-maven.handler/app})
