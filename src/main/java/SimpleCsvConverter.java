import java.io.*;
import java.util.Scanner;

public class SimpleCsvConverter {

    public void convert(String file, String outputFormat) throws FileNotFoundException {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null){
                System.out.println(line );
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Scanner sc = new Scanner(new File(file));
//
//        sc.useDelimiter(",");
//        while (sc.hasNext()){
//            System.out.print(sc.next());
//        }
//        sc.close();

    }



}



