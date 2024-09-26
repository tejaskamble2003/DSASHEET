import java.util.Arrays;

class sortArray {
    public static int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            System.out.println("Start" + start);
            System.out.println("End" + end);
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start += 1;
            end -= 1;
        }
        System.out.println("Start" + start);
        System.out.println("End" + end);
        return nums;
    }

    public static void main(String args[]) {
        int a[] = { 5, 2, 3, 1 };
        for (int i : a) {
            System.out.println(i);
        }
        sortArray(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}