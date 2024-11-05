/*

Consider Two Integers M and N . 
Calculate the sum of the cubes of integer's value from M to N . 
if M is greater than N , return ' 0 ' or display the proper message 
 
*/

import java.util.Scanner;
public class Sum_of_qube_of_integer{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m,n,sol;
        m=scanner.nextInt();
        n=scanner.nextInt();

        scanner.close();

        sol=solution(m,n);
        System.out.println("solution :" + sol);
    }

    public static int solution(int m,int n ){
        if(m>n) return 0;
        int sum=0 ;
        for (int i = m ; i <= n ; i++){
            sum+=i*i*i;
        }
        return sum;
    }
}