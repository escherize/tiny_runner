(require '[clojure.pprint :as pprint])

(defn square [x] (* x x))

(defn cube [x] (* x (square x)))

(def input [1721 979 366 299 675 1456])

(pprint/pprint
 (for [r (range 10)]
   (range (rand-int (* 2 r)))))


(def a 1)

(square a)

;; fib sequence:

(defn fib [n]
  (map first
       (take n
             (iterate (fn [[a b]] [(+ a b) b]) [0 1]))))

> (fib 20)

> (map
   (comp read-string #(apply str %) reverse str)
   (fib 20))

;;--;;

(println "below fold, doesn't get executed.")
