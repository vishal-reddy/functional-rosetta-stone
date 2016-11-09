(ns com.liferay.tongues.function.types.clojurelambdas_test
    (:use clojure.test)
    (:use com.liferay.tongues.function.types.ClojureLambdas))

(deftest testAddThis
   (testing "addThis function works")
      (is
        (=
          (+ 1 1)
          (addThis 1 1))))

(run-tests)