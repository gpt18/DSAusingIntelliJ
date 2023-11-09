import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MCOQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] inputArray = input.split(" ");
        String d = inputArray[0];
        String w = inputArray[1];
        int n = Integer.parseInt(inputArray[2]);

        String result = rainyDay(d, w, n);
        System.out.println(result);

        
        Collections.reverse();
        Arrays.swap
    }

    public static String rainyDay(String Date, String Ddd, int n){

        int yyyy = Integer.parseInt(Date.substring(0,4));
        int mm = Integer.parseInt(Date.substring(4,6));
        int dd = Integer.parseInt(Date.substring(6,8));

        System.out.println(yyyy+"..."+mm+"..."+dd+"..."+Ddd);

        boolean flag = true;

        int r = 0;

        Calendar calendar = new GregorianCalendar(yyyy, mm, dd);

        int p = leastPrime(n);
        System.out.println("least prime: "+p);
     
        while(flag){
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            // System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

            int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
            int currentMonth = calendar.get(Calendar.MONTH);

            if (isPrime(currentDay) && isPrime(currentMonth) && Ddd.equals(getDayOfWeek(calendar.get(Calendar.DAY_OF_WEEK)))) {
                r++;
                flag=false;
                break;
            }
            
        }

        if(r<=n) return ("Yes "+r);
        else if(p>n) return ("No "+p);
        else return ("No 0");
    
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

    private static int leastPrime(int n){
        if(n<2) return 2;
        n += 1;
        while (!isPrime(n)) {
            n += 1;
        }

        return n;
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

