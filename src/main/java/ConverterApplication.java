import java.io.FileNotFoundException;

public class ConverterApplication {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            throw new FileNotFoundException("No file found");
        }

        SimpleCsvConverter simpleCvsConverter = new SimpleCsvConverter();
        String inputType = args[1];
        String outputType = args[0];

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
