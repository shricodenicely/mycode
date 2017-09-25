
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



 public class BubbleSort{
        static void bubbleSort(int[] arr){
          int n = arr.length;
          int b = 0;
          for(int i=0;i<n;i++){

             for(int j=1;j<(n-i);j++){

             if(arr[j-1]>arr[j]){
          
              b = arr[j-1];
              arr[j-1]=arr[j];
              arr[j]=  b;
         
             }
         }
      }    
  
   } 
             public static void main(String[] args){
              
              int arr[] = {4,2,34,55,66,77,3};
              
                 System.out.println("before bubble sort"); 
              
                  for(int i=0;i<arr.length;i++){
                  
                     System.out.print(arr[i] + "  ");
                   } 
                      System.out.println();

                    bubbleSort(arr);
 
                  System.out.println("after bubble sort");
                    for(int i=0;i<arr.length;i++){
                     System.out.print(arr[i] + "  ");
                    }  
               }
}  
