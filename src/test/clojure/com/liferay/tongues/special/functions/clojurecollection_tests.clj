(ns com.liferay.tongues.special.functions.clojurecollection_tests
  (:use clojure.test)
  (:use com.liferay.tongues.special.functions.ClojureCollectionFunctions))

(deftest numbers-are-doubled-with-for
  (testing "numbers are not doubled with for")
  (is
    (=
      [0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40]
      doubled-whole-numbers-using-for)))

(deftest numbers-are-doubled-with-map
  (testing "numbers are not doubled with map")
  (is
    (=
      [0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40]
      doubled-whole-numbers-using-map)))

(deftest even-numbers-are-filtered-for
  (testing "even numbers are not filtered with for")
  (is
    (=
      [0 2 4 6 8 10 12 14 16 18 20]
      filtered-even-whole-numbers-with-for)))

(deftest even-numbers-are-filtered-filter
  (testing "even numbers are not filtered with map")
  (is
    (=
      [0 2 4 6 8 10 12 14 16 18 20]
      filtered-even-whole-numbers-with-filter)))

(run-tests)