import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int intArray[], num, counter;

		Scanner input = new Scanner(System.in); 
        
       		System.out.println("Enter number of integers:"); 
       		num = input.nextInt();  
 
       		//Creates an array 
       		intArray = new int[num]; 
 
       		System.out.println("Enter " + num + " integers");
 
       		//Loop to store each number 
       		for (counter = 0; counter < num; counter++) 
          	intArray[counter] = input.nextInt(); 

                bubbleSort(intArray);
                System.out.println("");

                System.out.println("Bubble Sorted:");

                for(int i=0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");

                }
        }

	//Bubble Sort Algorithm
        private static void bubbleSort(int[] intArray) {
                
		int n = intArray.length;
                
		int temp = 0;
                for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
                        	if(intArray[j-1] > intArray[j]){
					//Swap
                                        temp = intArray[j-1];
                                        intArray[j-1] = intArray[j];
                                        intArray[j] = temp;
                                }
                        }
                }    
        }


}
