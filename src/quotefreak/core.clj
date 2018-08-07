(ns quotefreak.core
  (:require [coast.core :as coast]
            [quotefreak.routes :as routes]
            [quotefreak.components :as c])
  (:gen-class))

(def app
  (-> routes/routes
      (coast/wrap-coast-defaults {:layout c/layout
                                  :error-page c/error-page})))

(defn coast []
  (coast/start-server app))

(defn -main [& [port]]
  (coast/start-server app {:port port}))
