public class secondLargestelement {
    public static void main(String[] args) {
        int nums[]={10,20,30,40,50,50,40};
        int largest=nums[0];
        int Seclarhest=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                Seclarhest=largest;
                largest=nums[i];
            } else if(nums[i]>Seclarhest && nums[i]<largest){
                Seclarhest=nums[i];

            }
        }
        System.out.println("Your Second largest element is: "+ Seclarhest);
    }
}
