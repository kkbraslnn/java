package day15arrays;

import java.util.Arrays;

public class Eng_Arrays01 {
    /*

    When we create byte,short,int,long,float,double,char,boolean containers we can
    store just a single value in them.Sometimes we need to store multiple values in a
    single container.To be able to store multiple values Java created a new structure,its name is "Array".

    Note:Arrays are to store multiple data in single data type.
         You cannot store different data types in an array.

     */
    public static void main(String[] args) {

        //How to create an Array
        String names[] = new String[5];

        //How to print an Array
        System.out.println(Arrays.toString(names));//[null, null, null, null, null]

        //How to put elements into an array
        names[1] = "Tom";
        names[4] = "Mark";
        names[0] = "jim";
        names[2] = "mary";
        names[3] = "Susan";
        System.out.println(Arrays.toString(names));//[jim, Tom, mary, Susan, Mark]

        //How to print a spesific element in an Array
        System.out.println(names[3]);//Susan

        //ex1: Create an integer array and print the sum of the first and the last elements on the console.

        int ages[] = new int[7];
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0, 0, 0]

        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 25;
        ages[3] = 14;
        ages[4] = 17;
        ages[5] = 12;
        ages[6] = 14;

        System.out.println(Arrays.toString(ages));//[12, 23, 25, 14, 17, 12, 14]

        System.out.println(ages[0] + ages[ages.length-1]);

        //ex2:Create a double array and find the sum of all elements in array
        //    [1.2 , 2.3 , 5.0 , 4.51] ==>13.01

        double prices[] = new double[4];

        prices[0] = 1.2;
        prices[1] = 2.3;
        prices[2] = 5.0;
        prices[3] = 4.51;

        System.out.println(Arrays.toString(prices));

        //1.way
        double sum = 0;

        for(int i=0; i<prices.length; i++){

            sum=sum+prices[i];
        }
        System.out.println(sum);

        //2.way
        //     for-each-loop can be used with Arrays and collections

        double summy = 0;
        for(double w: prices){
            summy=summy +w;
        }
        System.out.println(summy);






























    }
}

