(ns filterizer-arena-importer.arena)

(def api-key
  (aget js/process.env "ARENA_FILTERIZER_KEY"))

(def api-base-url
  "https://api.are.na/v2")

(def channel-url
  (str api-base-url "/channels/" "art-exhibitions-for-filterizer/" "contents"))

(comment
  (println channel-url))
  