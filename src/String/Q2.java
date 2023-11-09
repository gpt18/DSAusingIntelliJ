import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(Solution.frequencySort("etrtyyyfujhfbaaade"));
    }
}

class Solution {
    public static String frequencySort(String s){
        StringBuilder ans = new StringBuilder("");
        char[] cc = s.toCharArray();
        Arrays.sort(cc);

        for(char c : cc) ans.append(c);
        

        

        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     if(map.containsKey(c)){
        //         map.put(c, map.getOrDefault(c, 0)+1);
        //     }else{
        //         map.put(c, 1);
        //     }
        // }

        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     for(int i=0; i<entry.getValue(); i++) ans.append(entry.getKey());
        // }

        // System.out.println(map.toString());

        return ans.toString();
    }
}