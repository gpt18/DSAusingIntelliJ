
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();


        String subStringRes = subString(str);

        System.out.println(subStringRes);
    }

    private static String subString(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder("");

        for(char c : str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0)+1);
                sb.append(c);
            }else{
                break;
            }
        }

        // Set<Character> keys = map.keySet();

        // for(Character key : keys){
        //     System.out.println("Key: "+ key + ", Value: "+ map.get(key));
        // }

        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        // }

   

        return sb.toString();
        

    }
}
