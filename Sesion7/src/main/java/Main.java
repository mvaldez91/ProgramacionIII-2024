import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Serializer serializer = new Serializer();
       String json = "{\"Key\": {\"inner_key\": \"inner_Value\"}}";
       try{
           HashMap<String, HashMap<String, String>> result = serializer.Deserialize(json);
           System.out.println(result);
           String jsonResult = serializer.Serialize(result);
           System.out.println(jsonResult);
       }
       catch(JsonProcessingException ex){
           System.out.println(ex.getMessage());
       }

       FileOperator operator = new FileOperator();
       String path ="C:\\Users\\Marco\\Documents\\UMG\\Programacion III\\2024\\TestsMaven\\src\\main\\java\\demo.txt";
       operator.WriteToFile(path, "Hello world");


       System.out.println(operator.ReadEntireFile(path));
    }
}