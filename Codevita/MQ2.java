import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] parts = input.split(" ");
        String dateStr = parts[0];
        String dayOfWeek = parts[1];
        int n = Integer.parseInt(parts[2]);
        
        int year = Integer.parseInt(dateStr.substring(0, 4));
        int month = Integer.parseInt(dateStr.substring(4, 6)) ;
        int day = Integer.parseInt(dateStr.substring(6));
        
        Calendar calendar = new GregorianCalendar(year, month, day);
        
        int daysToRain = -1;
        int nextPrime = 2;
        while (n > 0) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
            int currentMonth = calendar.get(Calendar.MONTH) ;
            
            if (isPrime(currentDay) && isPrime(currentMonth) && dayOfWeek.equals(getDayOfWeek(calendar.get(Calendar.DAY_OF_WEEK)))) {
                daysToRain = n;
                System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR)+" "+getDayOfWeek(calendar.get(Calendar.DAY_OF_WEEK)));
                break;
            }
            
            n--;
            if (isPrime(n)) {
                nextPrime = n;
            }
        }
        
        if (daysToRain != -1) {
            System.out.println("Yes " + daysToRain);
        } else if (nextPrime != 2) {
            System.out.println("No " + nextPrime);
        } else {
            System.out.println("No 01");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String getDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "Sun";
            case Calendar.MONDAY:
                return "Mon";
            case Calendar.TUESDAY:
                return "Tue";
            case Calendar.WEDNESDAY:
                return "Wed";
            case Calendar.THURSDAY:
                return "Thu";
            case Calendar.FRIDAY:
                return "Fri";
            case Calendar.SATURDAY:
                return "Sat";
            default:
                return "";
        }
    }
}
