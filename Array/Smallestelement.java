public class Smallestelement {
    public static void main(String[] args) {
        int nums[]={60,20,30,40,50,50,10,10,9};
        int smallest=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println(smallest);
    }
}
