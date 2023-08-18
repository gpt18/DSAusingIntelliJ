package FileHandling;

import java.io.*;
import java.util.Scanner;

public class StreamOpr {
    public static void main(String[] args) throws IOException {
//        reading("abc.txt");
//        writing("abc.txt");

        ConsoleFile console = new ConsoleFile("abc.txt");
        console.reading();
        console.writing();
    }

    //writing data to file
    static void writing(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("This the new line");
        bw.newLine();
        bw.close();
        fw.close();
        System.out.println("write successfully");

    }

    //reading data from file
    static void reading(String fileName) throws IOException {
        FileReader fis = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fis);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
        fis.close();
        System.out.println("Read successfully");


    }
}

class ConsoleFile{
    String file;
    ConsoleFile(String file){
        this.file = file;
    }
    void reading() throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Enter data: ");
        String line;

        //Single line input
//        line = sc.nextLine();
//        bw.write(line);
//        bw.newLine();

        //multi line input
        while(true){
            line = sc.nextLine();
            bw.write(line);
            bw.newLine();
            if(line.equals("")){
                break;
            }
        }

        System.out.println("write successfully");
        bw.close();
        fw.close();
        sc.close();

    }

    void writing() throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br  = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
        fr.close();
    }
    

}
