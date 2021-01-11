

public class ConverterApplication {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No input file defined");
        }else if (args[0].equals("xml")){
            System.out.println("dotarlo");
        }else if(args[0].equals("json")){
            System.out.println("dotarlo do json");
        }else if(args[0].equals("")){
            System.out.println("dotarlo do pustego");
        }

    }


}
