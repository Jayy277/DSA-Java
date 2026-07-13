//Brute Solution

// class MoveZeroEnd{
//     public static void main(String[] args) {
//         // Input: nums = [0,1,0,3,12]
//         // Output: [1,3,12,0,0]
//         int nums[]={8,9,0,2,54,0,0,98,11,0,1,0,3,12};
//         int j=0;
//         int tamp[]=new int[nums.length];
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 tamp[j]=nums[i];
//                 j++;
//                 count++;
//             }
            
//         }
//         for(int i=count;i<nums.length;i++){
//             tamp[count]=0;
//         }
//         for(int i=0;i<nums.length;i++){
//             System.out.print(tamp[i]+" ");
//         }
//     }
// }


//Optimal Solution

class MoveZeroEnd{
    public static void main(String[] args) {
    int nums[]={1,0,2,3,2,0,0,4,5,1};
    //int nums[]={1};
        moveZeroes(nums);
    }
   static public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                 int tamp=nums[j];
                 nums[j]=nums[i];
                 nums[i]=tamp;
                 j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}