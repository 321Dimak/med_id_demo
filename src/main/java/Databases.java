import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

class Databases {

    ObjectMapper mapper = new ObjectMapper();

    private String jsonString;
    List<Medicine> lvMedicineDatabase = mapper.readValue(jsonString, new TypeReference<List<Medicine>>(){});

    Databases(String jsonString) throws JsonProcessingException {
        this.jsonString = jsonString;
    }
}
