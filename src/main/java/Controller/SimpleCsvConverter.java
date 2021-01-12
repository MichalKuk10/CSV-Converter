package Controller;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;


public class SimpleCsvConverter {

    public void convert(String file, String outputFormat) throws FileNotFoundException {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));



            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                for (String value : values){
                    System.out.println(value);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void convert(String file){
        System.out.println("dotarlo");
    }



}



