public class dupalicate {
    public static int dupaArr(int arr[]) {
        int tem = 0;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
               tem = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = tem;
            }
        }
    return tem ;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 2, 4, 5, 6 };
          System.out.print(dupaArr(arr));
        // for(int i=0; i<arr.length; i++){
        // }
    }

}
