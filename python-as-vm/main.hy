(import flask)
(setv app (flask.Flask __name__))

(with-decorator (app.route "/")
  (defn hy-world []
    "Hy, world!"))
