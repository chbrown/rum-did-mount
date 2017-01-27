(ns rum-did-mount.core
  (:require [rum.core :as rum]))

(def root-node (js/document.getElementById "app"))

(rum/defcs time-label < { :did-mount (fn [state]
                                       (assoc state ::time (js/Date.))) }
  [state label]
  [:div label ": " (::time state)])

(rum/defc app []
  [:div
    [:h1 "rum-did-mount?"]
    (time-label "hello world, the time is")])

(rum/mount (app) root-node)
