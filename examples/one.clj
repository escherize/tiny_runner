(def width 20)

(def height 30)

> (* width height)

> (+ (* 2 width) (* 2 height))

> "Hello"


> [:div "Hello"]

(defn heading [color title]
  [:div {:style {:color color}}
   (str/capitalize title)])

> (heading "red" "hello")

> 123
