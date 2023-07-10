package FileInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    static void copy(String source, String destination) {
        File f1 = new File(source);

        try{
            FileInputStream fin = new FileInputStream(f1);
            FileOutputStream fout = new FileOutputStream(destination + f1.getName());
            fin.close();
            fout.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Image Copied!");
    }

    public static void main(String[] args) {
        String s = "C:\\Users\\guddu\\Downloads\\myFlutterProject-1\\new.txt";
        String d = "C:\\Users\\guddu\\Downloads\\";

        try{
            copy(s,d);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
