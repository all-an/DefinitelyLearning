public class Challenge3 {

    public static double salaryCalculator(double hoursPerWeek,
                                          double amountPerHour,
                                          int vacationDDays){
        if (hoursPerWeek < 0){
            return -1;
        }

        if (amountPerHour < 0){
            return -1;
        }

        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unpaidTime;
    }

    public static void main(String[] args){
        double salary = salaryCalculator(40,15, 8);
        System.out.println(salary);
    }
}
