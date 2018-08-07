(ns quotefreak.controllers.errors-controller
  (:require [quotefreak.views.errors :as views.errors]))

(defn not-found [request]
  (views.errors/not-found))
