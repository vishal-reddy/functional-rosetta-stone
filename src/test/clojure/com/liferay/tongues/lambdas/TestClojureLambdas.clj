(ns com.liferay.tongues.lambdas.TestClojureLambdas
    (:use clojure.test
          com.liferay.tongues.lambdas.ClojureLambdas))

(deftest testAddThis
   (testing "addThis function works")
      (is
        (=
          (+ 1 1)
          (com.liferay.tongues.lambas.ClojureLambdas/addThis 1 1))))