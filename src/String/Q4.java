public class Q4 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.largestOddNumber("7542351161125456"));
    }
}

class Solution {
    public String largestOddNumber(String num) {
        long largest = -1;
        long n;
        for (int i = 0; i < num.length(); i++) {

            n = Long.parseLong(Character.toString(num.charAt(i)));
            if (n % 2 != 0)
                largest = Math.max(largest, n);

            for (int j = i; j < num.length(); j++) {
                n = Integer.parseInt(num.substring(i, j + 1));
                if (n % 2 != 0)
                    largest = Math.max(largest, n);
            }

        }

        return (largest == -1) ? "" : Long.toString(largest);
    }
}

class Solution2 {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        
        return "";
    }
}