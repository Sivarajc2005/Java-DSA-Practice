/*
 * A chocolate factory pack the chocolates into the package
 * .the chocolate packet have the array of N number of integers value.
 * the task is to find the empty packets of chocolate and push it to the end of the conveyor belt
 */

import java.util.Scanner;

public class Found_The__Empty_Packet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,i,j,k,poin=0;
        n=scanner.nextInt();
        int[] arr = new int[n];
        for (i=0;i<n;i++){
            System.out.printf("Enter the number of chocolate in %d : ",i+1);
            arr[i]=scanner.nextInt();
        }

        for (j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[poin]=arr[j];
                poin++;
            }
        }
        for(k=poin ; k < arr.length; k++){
            arr[k]=0;
        }

        for (int arr1 : arr) {
            System.out.println(arr1);
        }
    }
}
