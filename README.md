This is a text based notebook that automatically recomputes the thing at file and prints forms prefixed with >.

## E.g.

if you run:

./tiny my_notebook.clj

then you put this in `my_notebook.clj`

``` clojure

(def a -10)

> a

(defn square [x] (* x x))

> (square a)

```

tiny.clj should (pretty?) print something like

``` text

a
;;=> -10

(square a)
;;=> 100

```
