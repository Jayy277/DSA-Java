public class Largestelement {
    public static void main(String[] args) {
        int nums[]={10,20,30,40};
        int larg=nums[0];
        for (int i=0;i<nums.length;i++){
            if(nums[i]>larg){
                larg=nums[i];
            }
        }
        System.err.print(larg);
    }
}
