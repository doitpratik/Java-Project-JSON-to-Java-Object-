// In this we are going to write JSON to Java Object
// Also Java Object into JSON

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil{
    private static ObjectMapper mapper;
    static{
        //single instantiation of the mapper class;
        mapper = new ObjectMapper();
    }
    //converting object into the string
    //by writing the class name
    public static String convertJavaToJson(Object object){
        String jsonResult ="";
        try {
            jsonResult = mapper.writeValueAsString(object);
        } catch (JsonGenerationException e){
           // e.printStackTrace();
            System.out.println("Exception Occured while converting java object into JSON");
        } catch (JsonMappingException e){
            //e.printStackTrace();
            System.out.println("Exception Occured while mapping java object into JSON");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Exception Occured while Input Output");
        }
        return jsonResult;
    }
    //while converting the JSON string into the Java Object
    //we don't know what kind of data we are receiving so
    // we can either use generic or object as return type
    // since down-casting is difficult/headache we will be using
    // Generics
    public static <T> T convertJsonToJava(String jsonString,Class<T> clas){
        T result = null;
        try {
            result = mapper.readValue(jsonString, clas);
        } catch (JsonParseException e){
            System.out.println("Exception Occured while parsing the string to converting the data from JSON to Object");
        } catch (JsonMappingException e){
            System.out.println("Exception Occured while mapping the JSON to Object");
        } catch (IOException e) {
            System.out.println("Exception Might be Occured at Input Output");
        }
        return result;
    }
}
