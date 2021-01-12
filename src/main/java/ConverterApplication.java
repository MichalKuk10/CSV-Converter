import Controller.SimpleCsvConverter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConverterApplication {
    public static void main(String[] args) throws IOException {
//        if (args.length == 0) {
//            throw new FileNotFoundException("No file found");
//        }

        SimpleCsvConverter simpleCvsConverter = new SimpleCsvConverter();
        String inputType = "/Users/michal/Desktop/Codecool/Projects/CSV-Converter/src/main/resources/annual.csv";
        String outputType = "json";

        switch (outputType){
            case "xml" :
                simpleCvsConverter.convert(inputType, "xml");
                break;
            case "json" :
                simpleCvsConverter.convert(inputType, "json");
                break;
            case " " :
                simpleCvsConverter.convert(inputType);
        }
    }

}
