(import sys)
(import os.path)
(sys.path.append (os.path.join (os.path.dirname __file__)
                               "venv/lib/python2.7/site-packages"))

(import flask)
(setv app (flask.Flask __name__))

(with-decorator (app.route "/")
  (defn hy-world []
    "Hy, world!"))
