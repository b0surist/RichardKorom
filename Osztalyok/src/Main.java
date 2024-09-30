public class Main {
    public static void main(String[] args) {
        Auto a = new Auto(500, 320, "piros", 4, 5);
        System.out.println("a = " + a);
        Motor m = new Motor(500, 320, "piros", true);
        System.out.println("m = " + m);
    }
}