(ns com.liferay.tongues.functional.composition.currying-tests
  (:use clojure.test)
  (:use com.liferay.tongues.functional.composition.Currying))

(deftest testPartialFunctionSumFive
  (testing "sum five applies to every item in a collection")
  (is
    (=
      [5 6 7 8 9 10]
      (map sumFive [0 1 2 3 4 5]))))

(deftest testPartialAnonymousFunctionSumTen
  (testing "sum partial anonymous function ten applies to every item in a collection")
  (is
    (=
      [10 11 12 13 14 15]
      (map (partial sum 10) [0 1 2 3 4 5]))))

(deftest testNonPartialAnonymousFunctionSumTen
  (testing "sum non partial anonymous function ten applies to every item in a collection")
  (is
    (=
      [10 11 12 13 14 15]
      (map (fn [x] (+ x 10)) [0 1 2 3 4 5]))))

(run-tests)