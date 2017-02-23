(ns com.liferay.tongues.functional.composition.higherorderfunctions-tests
  (:use clojure.test)
  (:use com.liferay.tongues.functional.composition.HigherOrderFunctions))

(deftest testValidateIsEven
  (testing "higher order function validate that takes is-even a param and validates inputs")
  (is
    (=
      true
      (validate is-even 2))))

(deftest testValidateIsOdd
  (testing "higher order function validate that takes is-odd a param and validates inputs")
  (is
    (=
      true
      (validate is-odd 1))))

(deftest testValidateIsEvenAnonymousFunction
  (testing "higher order function validate that takes is-even anonymous function a param and validates inputs")
  (is
    (=
      true
      (validate (fn [x] (= (mod x 2) 0)) 2))))

(deftest testValidateIsOddAnonymousFunction
  (testing "higher order function validate that takes is-even anonymous function a param and validates inputs")
  (is
    (=
      true
      (validate (fn [x] (not (= (mod x 2) 0))) 1))))