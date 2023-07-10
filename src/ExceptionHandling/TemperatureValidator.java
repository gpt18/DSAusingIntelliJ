package ExceptionHandling;

import java.util.Scanner;

public class TemperatureValidator{

    public static void validate (int temperature) throws TempException {

        if(temperature < 20){
            throw new TempException("Temperature is below normal.");
        } else if (temperature > 40) {
            throw new TempException("Temperature is above normal.");
        }else {
            throw new TempException("Temperature is normal.");
        }

    }

    public static void main(String[] args) throws TempException {

        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            try  {
                System.out.println("Enter Temperature in celsius: ");
                int t = sc.nextInt();
                validate(t);
            } catch (TempException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            System.out.println("Do you want to Re-enter temperature ? (press 1 and [ENTER]): ");
            choice = sc.nextInt();
        }while(choice == 1);


        sc.close();
    }
}

class TempException extends Exception {
    String errorMessage;

    TempException(String errorMessage){
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}

//public class TemperatureValidator {
//    public static void validateTemperature(double temperature) throws Exception {
//        if (temperature < 20) {
//            throw new Exception("Temperature Below Normal");
//        } else if (temperature > 40) {
//            throw new Exception("Temperature is High");
//        } else {
//            throw new Exception("Normal Temperature");
//        }
//    }
//
//    public static void main(String[] args) {
//        double temperature = 25.5; // Replace with the desired temperature
//
//        try {
//            validateTemperature(temperature);
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
//    }
//}

