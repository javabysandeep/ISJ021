package _08_array;

public class Demo14FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        //approach 01 : sum of n numbers
        //formula sum = n * (n+1)/2
        //find actual sum = for loop
        //difference = formula - actual --> missing number
        int n = array[array.length - 1];
        int formulaSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int temp : array) {
            actualSum += temp;
        }
        System.out.println("missing number = " + (formulaSum - actualSum));
    }
}
