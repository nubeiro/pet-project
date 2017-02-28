(ns pet-project.core
  (:gen-class))

(defn titleize 
  [topic] 
  (str topic " for the Brave!"))

(defn doMaps
  []
  (do 
    (println (map titleize ["Hamsters" "Ragnarok"]))
    (println (map titleize '("Empathy" "Decorating")))
    (println (map titleize #{"Elbows" "Soap Carving"}))
    (println (map #(titleize (first %))
                  {:uncomfortable-thing "Winking"}))))

(defn doMultipleMaps
  []
  (do
    (map str 
         ["a" "b" "c" "d"] 
         ["A" "B" "C" "D"]
         '("X" "Y" "Z"))
)
)
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (doMultipleMaps)
)
