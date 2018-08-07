(ns quotefreak.views.errors
  (:require [quotefreak.components :as c]
            [coast.core :as coast]))

(defn not-found []
  (coast/not-found "Not found"))
