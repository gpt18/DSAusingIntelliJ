package Generics;

public class GenericBoundedClass {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        Box<String> stingBox = new Box<String>();

        intBox.setContain(10);
        stingBox.setContain("Hello");

        Box<Integer> anotherBox = new Box<Integer>();
        anotherBox.setContain(30);

        int result = intBox.compare(anotherBox);
        System.out.println("Compare result: " + result );
    }
}

class Box <T extends Comparable<T>>{

    private T contain;

    public void setContain(T item){
        this.contain = item;
    }

    public T getContain(){
        return this.contain;
    }

    public int compare(Box<T> anotherBox){
        return contain.compareTo((anotherBox.getContain()));
    }

}
