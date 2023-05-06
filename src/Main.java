import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static ArrayList<String> A = new ArrayList<>();

    public Main(){

    }
    public static void main(String[] args) {
        int num = 0;
        int eights = 0;
        int sumOfDigits = 0;
        if (args.length < 1) {
            System.out.println("Please provide the required arguments");
            System.exit(0);
        } else {
            String param = args[0];
            File f  = new File(param);
            try {
                Scanner s = new Scanner(f);
                while(s.hasNext()){
                    A.add(s.next());
                }
                s.close();

                for(String i : A){
                    if(i.equals("8")){
                        eights += 1;
                    }
                    if (i.matches("\\d")){
                        sumOfDigits += Integer.parseInt(i);
                    }
                }
                System.out.println("Count of '8': " + eights);
                System.out.println("Sum of digits: " + sumOfDigits);





            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }


    }



    public static void printName(){
        String name = """
                            MM      MM  RRRRRRR        *****       $$$$     &&        @@    @@
                            MMMM  MMMM  RR   RR        **   **   $$    $$   &&        @@    @@
                            MM  MM  MM  RRRRRRR        *****     $$$$$$$$   &&        @@    @@
                            MM      MM  RR RR          **   **   $$    $$   &&        @@    @@
                            MM      MM  RR   RR   ##   ******    $$    $$   &&&&&&&   @@@@@@@@  
                 """;

        System.out.println(name);

    }
}