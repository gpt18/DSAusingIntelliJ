package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(16);
        list.add(19);
        list.add(17);
        list.add(11);
        list.add(10);

        for (Integer integer : list) {
            System.out.println(integer);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }

//        Iterator<Integer> it = list.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//            try{
//                Thread.sleep(400);
//            }catch (Exception e){
//                System.out.println("Exception: " + e);
//            }
//        }
    }
}
