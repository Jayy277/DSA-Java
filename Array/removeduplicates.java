public class removeduplicates {
       static int arr[]={1,2,2,3,3,3,4,5,5};
    static int removedupli(int arr[]){

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        return i+1;
    }
    public static void main(String[] args) {
        System.out.println(removedupli(arr));
       }
}
