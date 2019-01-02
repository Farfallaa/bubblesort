package bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(double[] numbers){
        double temp;
        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j< numbers.length - 1; j++){
                double first = numbers[i];
                double sec = numbers[j + 1];
                if(first > sec){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[i];
                    numbers[i] = temp;
                    System.out.println("temp="+ temp);
                    System.out.println("j+1="+numbers[j+1]);
                    System.out.println("i =" +numbers[i]);
                }

            }
            System.out.println("numbers on outer loop run "+ i + " "+ Arrays.toString(numbers));

        }
    }

    public static void main(String[] args) {
        double[]numbers = {35, 35, 12, 77, 5, 10};
        System.out.println("numbers at start "+ Arrays.toString(numbers));
        sort(numbers);
        System.out.println("numbers at end "+ Arrays.toString(numbers));
    }
}
