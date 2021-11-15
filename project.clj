(defproject kanade "ALPHA"
  :description "Anime opening/ending downloader"
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot kanade.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
