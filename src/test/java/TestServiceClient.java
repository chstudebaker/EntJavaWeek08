import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.Planet;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://swapi.dev/api/planets/1");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Planet planet = null;
        planet = mapper.readValue(response, Planet.class);
        assertEquals("Tatooine", planet.getName());
        //String expectedResponse = "{\"name\":\"Tatooine\",\"rotation_period\":\"23\",\"orbital_period\":\"304\",\"diameter\":\"10465\",\"climate\":\"arid\",\"gravity\":\"1 standard\",\"terrain\":\"desert\",\"surface_water\":\"1\",\"population\":\"200000\",\"residents\":[\"https://swapi.dev/api/people/1/\",\"https://swapi.dev/api/people/2/\",\"https://swapi.dev/api/people/4/\",\"https://swapi.dev/api/people/6/\",\"https://swapi.dev/api/people/7/\",\"https://swapi.dev/api/people/8/\",\"https://swapi.dev/api/people/9/\",\"https://swapi.dev/api/people/11/\",\"https://swapi.dev/api/people/43/\",\"https://swapi.dev/api/people/62/\"],\"films\":[\"https://swapi.dev/api/films/1/\",\"https://swapi.dev/api/films/3/\",\"https://swapi.dev/api/films/4/\",\"https://swapi.dev/api/films/5/\",\"https://swapi.dev/api/films/6/\"],\"created\":\"2014-12-09T13:50:49.641000Z\",\"edited\":\"2014-12-20T20:58:18.411000Z\",\"url\":\"https://swapi.dev/api/planets/1/\"}";

        //assertEquals(expectedResponse, response);
        }
}
