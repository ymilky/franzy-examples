(defproject ymilky/franzy-examples "0.0.2-SNAPSHOT"
  :description "Examples for Franzy"
  :url "https://github.com/ymilky/franzy-examples"
  :author "ymilky"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"snapshots" {:url           "https://clojars.org/repo"
                              :username      :env
                              :password      :env
                              :sign-releases false}
                 "releases"  {:url           "https://clojars.org/repo"
                              :username      :env
                              :password      :env
                              :sign-releases false}}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [com.taoensso/timbre "4.3.1"]
                 [ymilky/travel-zoo "0.0.2"]
                 [jarohen/nomad "0.7.2"]
                 [ymilky/franzy "0.0.2-SNAPSHOT"]
                 [ymilky/franzy-admin "0.0.2-SNAPSHOT"]
                 [ymilky/franzy-nippy "0.0.1"]
                 [ymilky/franzy-fressian "0.0.1"]
                 [ymilky/franzy-json "0.0.1"]
                 [ymilky/franzy-embedded "0.0.2-SNAPSHOT"]
                 [org.slf4j/slf4j-api "1.7.19"]
                 [org.slf4j/slf4j-nop "1.7.19"]
                 [log4j/log4j "1.2.17"]]
  :plugins [[lein-codox "0.9.4"]]
  :codox {:metadata    {:doc/format :markdown}
          :doc-paths   ["README.md"]
          :output-path "doc/api"}
  :profiles {:dev              {:dependencies [[midje "1.7.0"]]
                                :plugins      [[lein-midje "3.2"]
                                               [lein-set-version "0.4.1"]
                                               [lein-update-dependency "0.1.2"]
                                               [lein-pprint "1.1.1"]]}
             :reflection-check {:global-vars
                                {*warn-on-reflection* true
                                 *assert*             false
                                 *unchecked-math*     :warn-on-boxed}}})
