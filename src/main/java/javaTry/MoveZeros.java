package javaTry;

import java.util.stream.Stream;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 3, 12, 0};
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                arr[left] = arr[right] + arr[left];
                arr[right] = arr[left] - arr[right];
                arr[left] = arr[left] - arr[right];
                left++;
            }
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
