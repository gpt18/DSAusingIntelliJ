public class Q1 {
    public static void main(String[] args) {
        // abbaca
        String s = "azxxzy";
        String res = Q1.removeDuplicates(s);
        System.out.println(res);
        
    }
    
    private static String removeDuplicates(String s){
        StringBuilder sb = new StringBuilder(s);

        int i=0;
        while(i<sb.length()-1){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.delete(i, i+2);
                i=0;
            }else{
                i++;
            }
        }

        return sb.toString();
    }
}
