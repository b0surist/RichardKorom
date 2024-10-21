import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void Beolvas(){
        try {
            File textFile = new File("autok.csv");
            Scanner scanner = new Scanner(textFile);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] sorok = data.split(";");
                Auto auto = new Auto(Integer.parseInt(sorok[0]), sorok[1], sorok[2], Integer.parseInt(sorok[3]), sorok[4],
                        Integer.parseInt(sorok[5]), Integer.parseInt(sorok[6]));

            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Beolvas();
        int szamolas = 0;
        for()
    }
}