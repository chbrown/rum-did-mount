(defproject rum-did-mount "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [rum "0.10.8"]]
  :plugins [[lein-cljsbuild "1.1.4" :exclusions [[org.clojure/clojure]]]]
  :source-paths ["src"]
  :cljsbuild {:builds
              [{:source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/rum_did_mount.js"
                           :main rum-did-mount.core
                           :optimizations :simple}}]})
