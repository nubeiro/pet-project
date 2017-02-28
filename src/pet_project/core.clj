(ns pet-project.core
  (:gen-class))

(defn titleize 
  [topic] 
  (str topic " for the Brave!"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (map titleize ["Hamsters" "Ragnarok"])))
