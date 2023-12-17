import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
        }

        for(int i = 0; i < n; i++){
            String[] data = input[i].split(" ");
            if(data.length < 2) {
                System.out.println("Invalid");
                break;
            }

            String number = data[0];
            String name = data[1];
            String password = generatePassword(number, name);
            System.out.println(password);
        }
        sc.close();

    }

    private static String generatePassword(String number, String name) {

        double num;

        try {
            num = Double.parseDouble(number);
        } catch (NumberFormatException error) {
            return "Invalid";
        }

        String scientificNotation = String.format("%.7E", num);
        String[] parts = scientificNotation.split("E");
        String mantissa = parts[0];
        String exponent = parts[1];

        int d = reducingNumber(mantissa.substring(0, 1));
        int m = reducingNumber(mantissa.substring(mantissa.indexOf('.') + 1));
        int e = reducingNumber(exponent);

        String S1 = getS1(d, m, e);
        String S2 = getS2(name, e);

        return S1 + "@" + S2;
    }

    private static String getS1(int d, int m, int e) {
        String[] digitNames = { "zer", "one", "two", "thr", "fou", "fiv", "six", "sev", "eig", "nin" };

        String s1 = digitNames[Math.abs(d)], s2 = digitNames[Math.abs(m)], s3 = digitNames[Math.abs(e)];

        if (e < 0) s3 = "-" + s3;
        else if (e > 0) s3 = "+" + s3;

        return (s1 + "." + s2 + "e" + s3);
    }

    private static String getS2(String name, int e) {
        String S2 = "";
        e = e < 0 ? -e : e;
        e = e % 10;
        if (e % 2 == 1) {
            for (int i = 0; i < name.length(); i++) {
                if (i % 2 == 0) {
                    S2 += name.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < name.length(); i++) {
                if (i % 2 != 0) {
                    S2 += name.charAt(i);
                }
            }
        }

        return S2;
    }

    private static int reducingNumber(String value) {
        long num = Long.parseLong(value);

        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return (int) num;
    }

}