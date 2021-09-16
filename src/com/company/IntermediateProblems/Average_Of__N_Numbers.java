// Java program to find the average of N numbers

package com.company.IntermediateProblems;

import java.util.Scanner;

public class Average_Of__N_Numbers {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int range,number,count=1,sum=0;
        System.out.println("Enter the range:");
        range=input.nextInt();
        while (count <= range) {
            System.out.println("Enter"+count+"number:");
            number= input.nextInt();
            sum=sum+number;
            count++;
        }
        int average = sum / range;
        System.out.println("Average of " +range + "Numbers is :"+average);

    }
}
