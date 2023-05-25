package ArrayListDemonstration;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemonstration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        
        while(true){
            System.out.print("Enter a number (-1 to quit): ");
            double number = input.nextDouble();

            if(number == -1){
                break;  
            }

            numbers.add(number);
        }


        System.out.println("List of numbers: "+numbers);
        System.out.println("Average: "+average(numbers));



        input.close();
    }

    private static double average(ArrayList<Double> numbers){
        double sum = 0;
        for(double x:numbers){
            sum+=x;
        }
        return sum/numbers.size();
    }
}