package pl.kociamadka;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private CatsRepository repository = new DynamoDBCatsRepository();

    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {
        LOGGER.debug("Starting this function");
        Map<String, String> headers = new HashMap<>();
        Cats cats = repository.getAllCats();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        return new APIGatewayProxyResponseEvent().withHeaders(headers).withStatusCode(200).withBody(cats.toString());
    }
}
