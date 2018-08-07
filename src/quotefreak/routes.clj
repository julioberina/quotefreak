(ns quotefreak.routes
  (:require [coast.core :as coast]
            [quotefreak.controllers.home-controller :as home]
            [quotefreak.controllers.errors-controller :as errors]))

(def routes
  (-> (coast/get "/" home/index)
      (coast/route-not-found errors/not-found)))
