package _08_array;

public class Demo16PairSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 11;
        //approach 01 : if array is not sorted --> HashMap,
        //approach 02 : if array is sorted --> Two pointers
        int left = 0, right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                System.out.println("(" + array[left] + "," + array[right] + ")");
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }


    }
}
