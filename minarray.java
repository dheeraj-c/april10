class MinArray{
  static void min(int arr[]){
    int min=arr[0];
    int i=0;
    for(i=1; i<arr.length; i++){
      if (min>arr[i]){
        min=arr[i];
      }
    }
    System.out.println(min);
  }
}

public class minarray{
  public static main(String args[]){
    int a[]={3, 4, 55, 1};
    min(int a);
  }
}
