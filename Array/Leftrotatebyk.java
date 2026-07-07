public class Leftrotatebyk {
    public static void main(String[] args) {
        int k=4;
        int nums[]={1,2,3,4,5,6,7,8};
        int n=nums.length;
        k=k%n;
        //output:{5,6,7,8,1,2,3,4}
        int tamp[]={1,2,3,4};
        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
        }

        for(int j=k;j<n;j++){
            nums[j]=tamp[j-(n-k)];
        }
        // print arr 
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
