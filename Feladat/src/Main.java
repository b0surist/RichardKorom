import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int lastSecond = 0;
        
        while(true){

            LocalTime time = LocalTime.now();
            if(lastSecond != time.getSecond()){
                System.out.println("time = " + time);
                lastSecond = time.getSecond();
            }
        }

        /*
        LocalDate date = LocalDate.now();
        date = date.plusWeeks(2);
        System.out.println("date = " + date);


        LocalTime time = LocalTime.now();
        time = time.plusHours(5);
        System.out.println("time = " + time.getHour());

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        String sz1 = "alma";
        String sz2 = "alma";
        if(sz1.equals(sz2)){
            System.out.println("Egyenlőek");
        }
        */

    }
}