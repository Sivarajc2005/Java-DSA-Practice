/*
 * You are the teacher creating and engaging maths activity for your student by writting 
 * N number on the classroom on white board you use a green pen for ODD and red pen for EVEN number.
 *  your task is to find and and return the number of times you need to switch from the green to red penwhile writing 
 */

import java.util.Scanner;


public class Red_Pen_And_Blue_Pen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr={1,2,1,2,3};

        int GtR,Tswit;
        GtR=Green_To_Red(arr);
        Tswit=total_switching(arr);
        System.out.println("Switch from green to red only :"+GtR );
        System.out.println("Total number of time pen switched :"+Tswit );

        scanner.close();
    }
        
    private static int Green_To_Red(int[] arr) {
        int n=arr.length ;
        int sum=0;
        boolean green;

        if(arr[0]%2 == 0) green=false;
        else green=true;

        for(int i=1 ; i < n ; i++){
            if(arr[i]%2 == 0 && green){
                sum+=1;
                green= false;
            }
            else green = true;
        }
        return sum;
    }

    private static int total_switching(int[] arr){
        int n=arr.length ;
        int sum=0;
        boolean green;

        if(arr[0]%2 == 0) green=false;
        else green=true;

        for(int i=1 ; i < n ; i++){
            if(arr[i]%2 == 0 && green){
                sum+=1;
                green= false;
            }
            else {
                sum+=1;
                green = true;
            }
        }
        return sum;
    }
}
