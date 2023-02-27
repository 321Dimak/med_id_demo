package databases.databaseparsing;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {

    private String jsonSource = "{ \"title\": \"Medicine is a drug\" }";

    @Test
    void parse() throws IOException {
        JsonNode node = Json.parse(jsonSource);
        assertEquals(node.get("title").asText(), "Medicine is a drug");
    }
}