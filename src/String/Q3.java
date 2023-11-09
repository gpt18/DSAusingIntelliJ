import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseWords("the sky is blue"));
    }
}

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        boolean wordFlag = false;

        while(i<s.length()){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                wordFlag = true;
            }
            while(wordFlag && i < s.length()){
                if(s.charAt(i) == ' ') {
                     sb.append(" ");
                     wordFlag = false;
                     break;
                 }
                 sb.append(s.charAt(i));
                 i++;
            }

            i++;
        }

        String[] arr = sb.toString().split(" ");

        sb.setLength(0);

        for(int j = arr.length-1; j >= 0; j--){
            sb.append(arr[j]);
            if(j>=1) sb.append(" ");
        }

        

        return sb.toString();
    }
}