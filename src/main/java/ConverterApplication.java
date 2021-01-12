import java.io.FileNotFoundException;

public class ConverterApplication {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            throw new FileNotFoundException("No file found");
        }

        SimpleCsvConverter simpleCvsConverter = new SimpleCsvConverter();
        String inputType = args[1];
        String outputType = args[0];

        if (outputType.equals("xml")){
            simpleCvsConverter.convert(inputType, "xml");
        }else if(outputType.equals("json")){
            System.out.println("dotarlo do json");
        }else if(outputType.equals("")){
            System.out.println("dotarlo do pustego");
        }

    }


}
