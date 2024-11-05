/*

  A pearson is booking a ticket in a railways normal price is RS:50 
  and senior citizen if age is above 60 , ticket price RS:30 
  and for children age below 12 the price is RS:20 . 
  Calculate the total Quantity and price of the ticket  

 */

import java.util.Scanner;

public class Train_Ticket_Booking {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity,i,ans,age,sol;

        System.out.println("Number of ticket you need :");
        quantity = scanner.nextInt();

        System.out.println("Did all pearson on same age ? \n if yes enter : 0 \n if No enter :1");
        ans=scanner.nextInt();

        if (ans==0) {
            System.out.println("Enter the age :");
            age=scanner.nextInt();
            sol=ticket_price(age ,quantity);
            System.out.println(sol);
        }

        else{
        int[] arr = new int[quantity];
        for(i=0 ; i < quantity ; i++){
            System.out.printf("Enter the age of pearson %d :" ,i+1);
            arr[i]=scanner.nextInt();
        }

        sol=ticket_price(arr);
        System.out.println(sol);
        }

        scanner.close();

    }

    private static int ticket_price(int[] arr){
        int sum=0;
        for (int j = 0 ; j < arr.length ; j++){
            if (arr[j] > 60 ) sum+=30;
            else if(arr[j] < 12 ) sum+=20;
            else sum+=50;
        }
        return sum;
    }

    private static int ticket_price(int age , int quan){
        if(age > 60 ) return(30*quan);
        else if(age < 12 ) return(20*quan);
        else return(50*quan);
    }
}
