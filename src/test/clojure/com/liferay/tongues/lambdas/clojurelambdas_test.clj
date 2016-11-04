(ns com.liferay.tongues.lambdas.clojurelambdas_test
    (:use clojure.test)
    (:use com.liferay.tongues.lambdas.ClojureLambdas))

(deftest testAddThis
   (testing "addThis function works")
      (is
        (=
          (+ 1 1)
          (addThis 1 1))))

(run-tests)