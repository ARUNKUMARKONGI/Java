import java.time.LocalDate;
import java.time.Period;

public class DateTime {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalDate joiningDate = LocalDate.of(2021, 12, 1);
        Period d = Period.between(joiningDate, LocalDate.now());
        int days = d.getDays();
        int months = d.getMonths();
        int years = d.getYears();
        System.out.println("Experience : " + years + " years " + months + " months " + days + " days.");
    }

}