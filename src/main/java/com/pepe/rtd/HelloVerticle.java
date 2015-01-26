/**
 * 
 */
package com.pepe.rtd;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;
/**
 * @author swdmac
 *
 */
public class HelloVerticle extends Verticle {

    /* (non-Javadoc)
     * @see org.vertx.java.platform.Verticle#start()
     */
    @Override
    public void start() {
        
        final HttpServer server = vertx.createHttpServer();

        server.requestHandler(new Handler<HttpServerRequest>() {
          public void handle(final HttpServerRequest req) {
            req.response().putHeader("Content-Type", "text/plain");
            req.response().end("hello, world");
          }
        });

        server.listen(8080);
        }

    
    
}
