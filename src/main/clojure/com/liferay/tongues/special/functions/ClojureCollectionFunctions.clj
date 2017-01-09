(ns com.liferay.tongues.special.functions.ClojureCollectionFunctions)

(def some-whole-numbers [0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20])

(def doubled-whole-numbers-using-for
  (for [x some-whole-numbers]
    (* x 2)))

(def doubled-whole-numbers-using-map
  (map #(* % 2) some-whole-numbers))

(def filtered-even-whole-numbers-with-for
  (for [x some-whole-numbers
      :when (even? x)]
    x))

(def filtered-even-whole-numbers-with-filter
  (filter even? some-whole-numbers))