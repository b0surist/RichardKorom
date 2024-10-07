import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int fibo(int n) {
        ArrayList<Integer> szamok = new ArrayList<>();
        szamok.add(0);
        szamok.add(1);
        for(int i = 2;i <= n; i++) {
            szamok.add(szamok.get(i - 1) + szamok.get(i - 2));
        }
        return  szamok.get(n);
    }

    public static boolean armstrong(){


        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot: ");
        
        /*
        System.out.println(fibo(10));
        System.out.println(fibo(42));

        prím nyeremény játék
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a csoki gyartasi sorszamat: ");
        int sorszam = scanner.nextInt();
        boolean p = true;

        for(int i = 2; i < sorszam; i++){
            if(sorszam % i == 0){
                p = false;
                break;
            }
        }
        if(p){
            System.out.println("Gratulálok nyert!");
        }
        else{
            System.out.println("Nem nyert!");
        }*/


    }
}