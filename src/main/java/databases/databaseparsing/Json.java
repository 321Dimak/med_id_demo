package databases.databaseparsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Json {

    private static final ObjectMapper objectMapper = getDefaultObjectMapper();

    private static ObjectMapper getDefaultObjectMapper() {

        return new ObjectMapper();
    }

    public static JsonNode parse(String src) throws IOException {
        return objectMapper.readTree(src);
    }
}
