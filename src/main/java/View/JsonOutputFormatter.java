package View;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

import java.util.List;
import java.util.Map;

public class JsonOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(List<Map<String,String>> Data) throws IOException {

            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(System.out, Data);
    }
}
