(ns repro.core
  (:require [clojure.set]
            [clojure.string]))

(defn test-fn-a []
  (prn "test fn a"))

(defn test-fn-b []
  (test-fn-a))

(defn init []
  'foo 'bar
  (prn "here"))


(comment

  (test-fn-b)

  )
