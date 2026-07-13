public class LinearSearch {

    public static int linearSearch(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {5, 6, 8, 4, 2};
        int num = 4;

        int result = linearSearch(nums, num);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}