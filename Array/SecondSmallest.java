public class SecondSmallest {
    public static void main(String[] args) {
        int nums[]={40,10,30,60,15,50,5,100,200,2,300,1};
        int smallest=nums[0];
        int Ssmallest=10^9;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest){
                Ssmallest=smallest;
                smallest=nums[i];
            }else if(nums[i]!=Ssmallest && nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println("Smallest Number: "+smallest);
        System.out.println("Second Smallest Number: "+Ssmallest);
    }
}
