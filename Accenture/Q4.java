import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Q4{
    public static void main(String[] args) {
        String str = "abbc";
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        char maxChar = '\0';
        int maxCount = 0;

        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     if(entry.getValue() > maxCount){
        //         maxChar = entry.getKey();
        //         maxCount = entry.getValue();
        //     }
        // }

        // System.out.println("'"+maxChar + "' has Maximum Frequency i.e, "+ maxCount);

        Set<Character> keys = map.keySet();
        for(char key : keys){
            if(map.get(key) > maxCount){
                maxChar = key;
                maxCount = map.get(key);
            }
        }

        System.out.println("'"+maxChar + "' has Maximum Frequency i.e, "+ maxCount);


    }
}