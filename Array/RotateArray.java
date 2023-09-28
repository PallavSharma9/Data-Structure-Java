import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        
        System.out.println("Enter length of Array ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        System.out.println("Enter Array");
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter number of elements you want to right shift");
        int k = scan.nextInt();

        reverse(arr,0,length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,length-1);

        System.out.println(Arrays.toString(arr));
        scan.close();
    }

    static void reverse(int[] arr,int start,int end){
        for(int i=start;i<=end;i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}