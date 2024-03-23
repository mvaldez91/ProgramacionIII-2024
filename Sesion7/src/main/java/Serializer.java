import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;


public class Serializer {

    public String Serialize(HashMap<String, HashMap<String, String>> map)
            throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(map);
    }

    public HashMap<String, HashMap<String, String>> Deserialize(String json)
            throws JsonProcessingException
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, HashMap.class);
    }
}
