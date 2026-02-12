import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
       Wine izabella = new Wine("Izabella",
               "Massandra",
               "Russia",
               "semi-sweet",
               "21-04-1990");
        System.out.println(izabella);
        LocalDate currentDateTime = LocalDate.now();
        System.out.println("Выдержка вина: " + Period.between(izabella.getDateOfSpill(),currentDateTime).getYears() + " лет");
    }
}