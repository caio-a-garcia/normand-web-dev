(defproject normand-web-dev "0.1.0-SNAPSHOT"
  :description "Implementation of Eric Normand's guide"
  :url "http://caio-a-garcia.github.io"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure     "1.10.3"]
                 [ring/ring-core          "1.9.1"]
                 [ring/ring-jetty-adapter "1.9.1"]
                 [compojure               "1.6.2"]]
  :repl-options {:init-ns normand-web-dev.core})
