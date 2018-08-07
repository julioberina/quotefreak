(defproject quotefreak "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :min-lein-version "2.6.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [coast "0.6.9"]]
  :repl-options {:init-ns quotefreak.core}
  :main quotefreak.core
  :plugins [[lein-environ "1.1.0"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :aliases {"db/migrate"   ["run" "-m" "coast.migrations/migrate"]
            "db/rollback"  ["run" "-m" "coast.migrations/rollback"]
            "db/migration" ["run" "-m" "coast.migrations/create"]
            "db/create"    ["run" "-m" "coast.db/create" "quotefreak"]
            "db/drop"      ["run" "-m" "coast.db/drop" "quotefreak"]

            "model/gen"      ["run" "-m" "coast.generators/model" "quotefreak"]
            "controller/gen" ["run" "-m" "coast.generators/controller" "quotefreak"]
            "view/gen"       ["run" "-m" "coast.generators/view" "quotefreak"]
            "mvc/gen"        ["run" "-m" "coast.generators/mvc" "quotefreak"]
            "sql/gen"        ["run" "-m" "coast.generators/sql" "quotefreak"]}
  :profiles {:uberjar {:aot :all
                       :uberjar-name "quotefreak.jar"}})
