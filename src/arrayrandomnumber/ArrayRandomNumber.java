/*
 * Emma Elliott
March 25, 2020
Array Random Number Program
 */
package arrayrandomnumber;
import java.util.*;
/**
 *
 * @author gregelliott
 */
public class ArrayRandomNumber {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] number=new int[10];
    
    int total=0;
    
    Random r= new Random();
    System.out.println("This program will generate 10 random numbers between 1 and 100 and output the average value");
    for (int i=0;i<10;i++){
        number[i]=r.nextInt(100);
    } 
    for (int i=0;i<number.length;i++){
        System.out.println(number[i]);
        total =total+number[i];
    }
    System.out.println("Average: "+total/10);
    
}
}
    

