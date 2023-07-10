package Generics;

public class DataProcessor<Tata> {

    void processData(Tata data1, Tata data2){
        if(data1 instanceof Number && data2 instanceof Number){
            double sum = (double) ((Number) data1).doubleValue() + (double) ((Number) data2).doubleValue();
            System.out.println("Sum: " + sum);
        } else if (data1 instanceof String && data2 instanceof String) {
            System.out.println("Merge: " + data1 + data2);
        } else {
            System.out.println("Not supported");
        }
    }

    public static void main(String[] args) {
        DataProcessor<String> processor1 = new DataProcessor<>();
        processor1.processData("20" , "30");
        DataProcessor<Double> processor2 = new DataProcessor<>();
        processor2.processData(20.5, 30.6);
        DataProcessor<Boolean> processor3 = new DataProcessor<>();
        processor3.processData(true, false);

    }
}


