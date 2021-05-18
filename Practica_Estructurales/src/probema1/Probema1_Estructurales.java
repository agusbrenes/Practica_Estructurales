package probema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Probema1_Estructurales {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");
        
        File xmlFile = new File("data.xml");
        Scanner myScanner = new Scanner(xmlFile);
    }
}
