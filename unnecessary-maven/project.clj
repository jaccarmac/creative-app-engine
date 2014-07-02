(defproject unnecessary-maven "1.0.3"
  :description "Use non-Maven JVM build tools on App Engine."
  :dependencies [^{:voom {:repo "https://github.com/weavejester/compojure"}}
                 [compojure "1.1.8-20140510_232900-g1597cc8"]
                 [org.clojure/clojure "1.6.0"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler unnecessary-maven.handler/app})
