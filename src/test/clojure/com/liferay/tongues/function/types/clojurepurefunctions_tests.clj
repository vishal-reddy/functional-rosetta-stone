(ns com.liferay.tongues.function.types.clojurepurefunctions_tests
    (:use clojure.test)
    (:use com.liferay.tongues.function.types.ClojurePureFunctions))

(deftest testAddThisAndDoMore
         (testing "addThis function works")
         (is
           (=
             (+ 1 1)
             (addThisAndDoMore 1 1))))

(deftest testSideIsAffectedVarA
         (testing "global variable a mutated")
         (is (= a 3)))

(deftest testAddThisAndDoNothing
         (testing "addThisAndDoNothing works")
         (is
           (=
             (+ 1 1)
             (addThisAndDoNothingElse 1 1))))

(deftest testSideIsAffectedVarB
         (testing "global variable a mutated")
         (is (= b 2)))

(run-tests)