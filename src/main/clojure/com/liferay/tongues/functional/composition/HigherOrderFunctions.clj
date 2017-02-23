(ns com.liferay.tongues.functional.composition.HigherOrderFunctions)

(defn validate
  ;A higher-order function is:
  ; - a function that takes one or more functions as arguments
  ;or
  ; - a function that returns a function
  ; https://clojurebridge.github.io/community-docs/docs/clojure/higher-order-function/

  [predicate value]
  (true?
    (predicate value)))

(defn is-even
  [x]
  (= (mod x 2) 0))

(defn is-odd
  [x]
  (not (= (mod x 2) 0)))