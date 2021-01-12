package Controller;


import View.CSV;
import View.JsonOutputFormatter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class SimpleCsvConverter {

    JsonOutputFormatter jsonOutputFormatter = new JsonOutputFormatter();

    public void convert(String file, String outputFormat) throws IOException {

        if (outputFormat.equals("json")){
           jsonOutputFormatter.printToConsole(fetchData(file));
        }

    }

    private List<Map<String,String>> fetchData(String file){

        List<Map<String,String>> list = new ArrayList<>();
        try (InputStream in = new FileInputStream(file);) {
            CSV csv = new CSV(true, ',', in);
            List<String> fieldNames = null;
            if ( csv.hasNext() ) fieldNames = new ArrayList<>(csv.next());
            while (csv.hasNext()) {
                List<String> x = csv.next();
                Map<String,String> obj = new LinkedHashMap<>();
                for (int i = 0 ; i < fieldNames.size() ; i++) {
                    obj.put(fieldNames.get(i), x.get(i));
                }
                list.add(obj);
            }
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return list;
    }

    public void convert(String file){
        System.out.println("dotarlo");
    }



}



