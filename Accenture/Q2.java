import java.util.Scanner;

public class Q2 {
    static StringBuilder newString = new StringBuilder("");
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println();
        System.out.print("Sentence Case: ");
        System.out.println(sentenceCase(str));
        System.out.print("Lower Case: ");
        System.out.println(lowerCase(str));
        System.out.print("Upper Case: ");
        System.out.println(upperCase(str));
        System.out.print("Camel Case: ");
        System.out.println(camelCase(str));
        System.out.print("Toggle Case: ");
        System.out.println(toggleCase(str));
        System.out.println(Integer.MAX_VALUE);

    }

        static String sentenceCase(String str){
            int len = str.length();
            newString.setLength(0);

            char c;
            for(int i=0; i<len; i++){
                c = str.charAt(i);
                if(i == 0) {
                    if(!Character.isUpperCase(c)) newString.append(Character.toUpperCase(c));
                    else newString.append(c);
                }
                else newString.append(Character.toLowerCase(c));
            }

            str = String.valueOf(newString);

            return str;
        }

        static String lowerCase(String str){
            int len = str.length();
            newString.setLength(0);

            char c;
            for(int i=0; i<len; i++){
                c = str.charAt(i);
                if(Character.isUpperCase(c)) newString.append(Character.toLowerCase(c));
                else newString.append(c);
            }

            str = String.valueOf(newString);

            return str;
        }

        static String upperCase(String str){
            int len = str.length();
            newString.setLength(0);

            char c;
            for(int i=0; i<len; i++){
                c = str.charAt(i);
                if(Character.isLowerCase(c)) newString.append(Character.toUpperCase(c));
                else newString.append(c);
            }

            str = String.valueOf(newString);
            
            return str;
        }

        static String camelCase(String str){
            newString.setLength(0);

            String[] arr = str.split(" ");

            char c;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length(); j++){
                    c = arr[i].charAt(j);
                    if(j == 0) {
                        if(Character.isLowerCase(c)) newString.append(Character.toUpperCase(c));
                        else newString.append(c);
                    }else newString.append(Character.toLowerCase(c));
                }
                newString.append(" ");
            }

            str = String.valueOf(newString);
            
            return str;
        }

        static String toggleCase(String str){
            newString.setLength(0);

            String[] arr = str.split(" ");

            char c;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length(); j++){
                    c = arr[i].charAt(j);
                    if(j == 0) {
                        if(Character.isUpperCase(c)) newString.append(Character.toLowerCase(c));
                        else newString.append(c);
                    }else newString.append(Character.toUpperCase(c));
                }
                newString.append(" ");
            }

            str = String.valueOf(newString);
            
            return str;
        }
}

abstract class ChangeCase {
         
}
