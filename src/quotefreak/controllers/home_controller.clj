(ns quotefreak.controllers.home-controller
  (:require [quotefreak.views.home :as views.home]))

(defn index [request]
  (views.home/index))
