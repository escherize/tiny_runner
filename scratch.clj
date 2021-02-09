(require '[clojure.pprint :as pprint])

(defn square [x] (* x x))

(defn cube [x] (* x (square x)))

(def input [1721 979 366 299 675 1456])

;; > (clojure.pprint/pprint 
;;    (for [r (range 10)] 
;;      (range (rand-int (* 10 r)))))

;;--;;

> (def a 1)
