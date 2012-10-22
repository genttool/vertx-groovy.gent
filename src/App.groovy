println "Browse http://localhost:8080 ..."

vertx.createHttpServer().requestHandler { req ->
    def file = req.uri == "/" ? "index.html" : req.uri
    req.response.sendFile "web/$file"
}.listen(8080)
