  public class SelectionSort{
    public static void selectionSort(int[] arr){
      for(int i=0;i<arr.length-1;i++){
          int n=i;
              for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[n]){
                 n=j;
     
                 }
              }
                 int smallerNum = arr[n];
                arr[n] = arr[i];
                arr[i] = smallerNum; 
           } 
 
         } 
               public static void main(String a[]){

                int[]arr1 = {33,55,22,66,78,22,1,23,22};

               System.out.println("without sortin");

               for(int i:arr1){

               System.out.print(i+"  ");
               }
                System.out.println();
                selectionSort(arr1); 
                System.out.println("with sortin");
                for(int i:arr1){
                System.out.print(i+"   ");
       }
    }
}
