/*
 * Naveen kumar ordering food in menu card in the menucard
 * below items is listed 
 * 1.pizza = 200 ,Burgre = 180 ,Briyani = 250 ,Dosa = 80, Idly = 50 .
 * Calculate the quantity of the items and display it ,
 * if the total price exit are more than 500 discound applicable for 10%.
 * Fnally after discound display total price .
 * 
 */

import java.util.Scanner;

public class Food_ordering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.pizza = 200 \n2.Burgre = 180 \n3.Briyani = 250 \n4.Dosa = 80 \n 5.Idly = 50");

        System.out.println("what you like to order enter (1-5) :");
        int item = scanner.nextInt();
        System.out.println("How much you need :");
        int quantity = scanner.nextInt();
        int price=0,total;
        switch (item){
            case 1 -> price=(200*quantity);
            case 2 -> price=(180*quantity);
            case 3 -> price=(250*quantity);
            case 4 -> price=(80*quantity);
            case 5 -> price=(504*quantity);
        }

        if(price >=500 ) System.out.println(price-(price*(10/100)));
        else if(price==0 || price > 5) System.out.println("YOU EXIT ");
        else System.out.println(price);

    scanner.close();
    }
}
