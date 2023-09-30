package InsightGeeks;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        sc.close();

        if(isValidPassword(password)){
            System.out.println("Password is Valid...:)");
        }else{
            System.out.println("Password is Invalid...:(");
        }
        
        // System.out.println(password.matches(".*[0-9].*"));
    }

    static boolean isValidPassword(String password) {
        final String SPECIAL_CHAR = "!@#$%^&*()-+";
        boolean isValid = true;

        //Checking length of  password --------------------------[#1]
        if(password.length() < 8){
            System.out.println("The Password should contain minimum 8 characters!");
            isValid = false;
        }
        
        //checking special Char ----------------------[#2]
        boolean hasSpecialChar = false;
        for(char c : password.toCharArray()){
            if(SPECIAL_CHAR.contains(String.valueOf(c))){
                hasSpecialChar = true;
                break;
            }
        }
        if(!hasSpecialChar){
            System.out.println("The Password should contain atleast 1 special character!");
            isValid = false;
        }
        
        //checking numeral char -------------------------[#3]
        boolean hasNum = false;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasNum = true;
                break;
            }
        }
        if(!hasNum){
            System.out.println("The Password should contain atleast 1 Numeral Digit!");
            isValid = false;
            
        }
        
        //checking alphabet --------------------------[#4]
        boolean hasAlpha = false;
        for(char c : password.toCharArray()){
            if(Character.isAlphabetic(c)){
                hasAlpha = true;
                break;
            }
        }
        if(!hasAlpha){
            System.out.println("The Password should contain atleast 1 Alphabetic character!");
            isValid = false;
        }
        
        //checking upper case ----------------------------[#5]
        boolean hasUpperCase = false;
        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                hasUpperCase = true;
                break;
            }
        }
        if(!hasUpperCase){
            System.out.println("The Password should contain atleast 1 UpperCase character!");
            isValid = false;
        }

        return isValid ? true : false;
        
    }
}
