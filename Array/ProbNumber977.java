public class ProbNumber977 {
    public static void main(String[] args) {
        int nums []= {-7, -3, 2, 3, 11};
        int right=nums.length-1;
        int left=0;
        int result[]=new int[nums.length];
        int index=result.length-1;


        while(left<=right){
            int leftSqure=nums[left]*nums[left];
            int rightSqure=nums[right]*nums[right];

            if(leftSqure>rightSqure){
                result[index]=leftSqure;
                left++;
            }else{
                result[index]=rightSqure;
                right--;
            }

            index--;
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
       
}
