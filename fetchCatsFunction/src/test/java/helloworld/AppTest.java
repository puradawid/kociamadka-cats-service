package helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.junit.Ignore;
import org.junit.Test;
import pl.kociamadka.App;
import pl.kociamadka.Cat;
import pl.kociamadka.Cats;
import pl.kociamadka.GatewayResponse;

import java.util.Arrays;
import java.util.Collections;

@Ignore
public class AppTest {
  @Test
  public void successfulResponse() {
    App app = new App();
    APIGatewayProxyResponseEvent result = (APIGatewayProxyResponseEvent) app.handleRequest(new APIGatewayProxyRequestEvent().withBody("Hello")
            .withHeaders(Collections.emptyMap()), null);
    assertEquals(result.getStatusCode().intValue(), 200);
    assertEquals(result.getHeaders().get("Content-Type"), "application/json");
    String content = result.getBody();
    assertNotNull(content);
  }

  @Test
  public void catToString() {
    Cat cat = new Cat("Burek", "https://google.com/img.jpeg");

    String result = cat.toString();

    assertEquals("{\"name\": \"Burek\", \"imageUrl\":\"https://google.com/img.jpeg\"}", result);
  }

  @Test
  public void catsToString() {
    Cats cats = new Cats(Arrays.asList(
            new Cat("Burek", "https://google.com/img.jpeg"),
            new Cat("Burek", "https://google.com/img.jpeg"),
            new Cat("Burek", "https://google.com/img.jpeg"),
            new Cat("Burek", "https://google.com/img.jpeg")
            ));

    String result = cats.toString();

    //assertEquals("{}", result);
  }
}
