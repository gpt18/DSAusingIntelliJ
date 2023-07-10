package Generics;

public class GenericMethod {

    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 30, 40, 50};
        Character[] charArr = {11, 20, 30, 40, 50};
        System.out.println("Integer");
        printArray(intArr);
        System.out.println("Char");
        printArray(charArr);
    }

    public static <E> void printArray (E[] elements) {
        int i;
        System.out.print("[ ");
        for(i = 0; i<elements.length-1; ++i){
            System.out.print(elements[i] + ", ");
        }
        System.out.print(elements[i]);
        System.out.print(" ]");
        System.out.println();
    }
}
