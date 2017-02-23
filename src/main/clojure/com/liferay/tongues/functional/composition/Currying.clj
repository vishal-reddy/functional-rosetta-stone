(ns com.liferay.tongues.functional.composition.Currying)
;; The advantage of currying is to make it easier to create anonymous functions

(defn sum
  [a b]
  (+ a b))

(def sumFive (partial sum 5))

(def sumTen (partial sum 10))