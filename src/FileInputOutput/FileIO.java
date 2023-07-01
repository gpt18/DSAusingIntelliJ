package FileInputOutput;
import java.io.*;
import java.util.Scanner;


public class FileIO {



    public static void main(String[] args) throws IOException {
        FileIO file = new FileIO();
        file.create("input.txt");
        file.create("output.txt");

        file.read();


    }

    static int sum(int a, int b){
        return a+b;
    }


    public void create (String fileName)  {
        File file = new File(fileName);
        if(file.exists()) {
            System.out.println(fileName + ", File Exists");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("");
            System.out.println(fileName + " : File Created.");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static boolean append = false;

    public void write(String data) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", append))) {
            if(!append){
                writer.write(data);
                append = true;
            }else{
                writer.newLine();
                writer.write(data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public void read() {
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){

            while((line = reader.readLine()) != null){
                String[] data = line.split(" ");
                for(int i = 0; i<data.length-1; i++){
                    int a = Integer.parseInt(data[i]);
                    int b = Integer.parseInt(data[i+1]);
                    int result = sum(a,b);
                    write(String.valueOf(result));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
