package More;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ActorProps {

    public static void main(String[] args) throws InterruptedException {
        List<String> inputByLine = new ArrayList<String>();
        inputByLine.add("10");
        inputByLine.add("1 2 3 4");
        int n = Integer.parseInt(inputByLine.get(0));
        String[] ratingsStr = inputByLine.get(1).split(" ");
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = Integer.parseInt(ratingsStr[i]);
        }

        int[] props = new int[n];
        props[0] = 1; // First actor gets at least one prop

        // Traverse from left to right and assign props based on ratings
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                props[i] = props[i - 1] + 1;
            } else {
                props[i] = 1;
            }
        }

        // Traverse from right to left and update props if necessary
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && props[i] <= props[i + 1]) {
                props[i] = props[i + 1] + 1;
            }
        }

        int totalProps = 0;
        for (int prop : props) {
            totalProps += prop;
        }

        System.out.println(totalProps);
        try {
            // Get the object of DataInputStream
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                inputByLine.add(line);
            }


            isr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
