import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int maxWeight = sc.nextInt();
        sc.close();

        
        String[] data = input.split(" ");
        int[] godownWeights = new int[data.length];

        for(int i = 0; i < data.length; i++){
            godownWeights[i] = Integer.parseInt(data[i]);
        }

        Arrays.sort(godownWeights);

        int vehicle = 0;

        int i = 0, j = godownWeights.length - 1;
        while (i <= j) {
            if(godownWeights[i] + godownWeights[j] <= maxWeight) {
                i++;
            }
            j--;
            vehicle++;
        }

        
        System.out.println(vehicle);
    }

}