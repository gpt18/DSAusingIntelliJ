
public class Test1 {
    public static void main(String[] args) {
        

        // System.out.println(binaryStringS());


        // System.out.println(stringpalindrome());


        // System.out.println(differenceofSum(3, 10));

    }

    static int differenceofSum(int m, int n){
        int ds = 0;
        int nds = 0; 
        for(int i =1; i<=n; i++){
            if(i%m == 0) ds += i;
            else nds += i;
        }

        return (Math.max(ds, nds) - Math.min(ds, nds));
    }


    static String stringpalindrome(){
        String str = "iilolii";
        int len = str.length();

        for(int i=0; i<len/2; i++ ){
            if(str.charAt(i) != str.charAt(len - i -1))
            return "No";
        }

        return "Yes";
    }


    static char binaryStringS(){
        // String str = "0C1A1B1C1C1B0A0";
        String str = "1C0C1C1A0B1";

        int l = str.length();
        int ans = str.charAt(0) - '0';
        

        // if(l<=0) return -1;

        for(int i=1; i<l-1; i++){
            if(str.charAt(i) == 'A'){
                ans = ans & str.charAt(i+1);
                // System.out.println(i+"A"+ans);
            }else if(str.charAt(i) == 'B'){
                ans = ans | str.charAt(i+1);
                // System.out.println(i+"B"+ans);
            }else if(str.charAt(i) == 'C'){
                ans = ans ^ str.charAt(i+1);
                // System.out.println(i+"C"+ans);
            }
        }

        return (char)ans;
    }
}
