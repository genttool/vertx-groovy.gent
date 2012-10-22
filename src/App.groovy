vertx.createHttpServer().requestHandler { req ->
    def file = req.uri == "/" ? "index.html" : req.uri
    req.response.sendFile "web/$file"
}.listen(8080)
