import java.util.Scanner;

public class ArrayTask7_3 {
	public static void main(String[] args) {
		//a[]= {10,10,20,50,60,80,60,50};
		//n=8;
		
		Scanner sc = new Scanner(System.in);
		  
	   
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
		int j=0;
        int arr[] = new int[n];
        int[] temp = new int[n];  
       
        for(int i=0; i<n; i++) {
            
            arr[i] = sc.nextInt();
        }
        System.out.print("Array after removing duplicate values: ");
      
        //complete logic to removing duplicate values in sorted array
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
        }  
        temp[j++] = arr[n-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }   
        
        //printing value after removing duplicate    
        for (int i=0; i<j; i++)  
           System.out.print(arr[i]+" "); 
	
	}
	
}
