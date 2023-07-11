package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileOut {

    static void mapCreate() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "asda");
        System.out.println(map.get(1));
    }

    static void fileCreate() throws IOException {
        File f = new File("abc.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());


    }
    static void fileStream(){
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\guddu\\OneDrive\\new.txt");
            String s = "welcome text";
            fout.write(s.getBytes());
            fout.close();
            System.out.println("success..");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws IOException {
      mapCreate();
    }
}
