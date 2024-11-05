/*
 * Ria like to play a number of games always , 
 * today she dicided to find the largest number that can be made using all of the digits of the given input .
 * 
 * 
 * LOGIC VIDEO : https://youtu.be/qEIGhVtZ-sg?si=uT-LW8JSHA6Q_WVp
 */
public class Largest_Element_Form_From_Array {
    public static void main(String[] args){
        
       String[] arr = {"3","6","7","5","0","9","2"};

       findmax(arr);

        for (String arr1 : arr) {
            System.out.println(arr1);
        }
    }

    private static void findmax(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0 ; j<arr.length-1;j++){
                String str1=arr[j]+arr[j+1];
                String str2=arr[j+1]+arr[j];
                
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
    
                if(num1 < num2){
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
    
            }
        }
    }
}
