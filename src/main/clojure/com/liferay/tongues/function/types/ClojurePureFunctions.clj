(ns com.liferay.tongues.function.types.ClojurePureFunctions)

(def a 1)
(def b 2)

(defn addThisAndDoMore
  "This function modifies variables outside of it's scope making it impure"
  [x y]
  (def a 3)
  (println "a was mutated to "  a " outside the function scope")
  (+ x y))

(defn addThisAndDoNothingElse
  "Inputs and outputs are clear in this function no side effects are visible"
  [x y]
  (+ x y))

