package HttpHandlers;

import Exceptions.BidNotFound;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;

public class SpecifiedUserShowHandler implements HttpHandler {
    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println("SpecifiedUser");
    }
}
