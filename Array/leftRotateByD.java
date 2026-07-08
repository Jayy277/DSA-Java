public class leftRotateByD {
    
    static int nums[]={1,2,3,4,5,6,7,8,9};
    static int D=4;
    
    //Output: {5,6,7,8,9,1,2,3,4}
    static void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        reverse(nums,0,D-1);
        reverse(nums,D,nums.length-1);
        reverse(nums,0,nums.length-1);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
