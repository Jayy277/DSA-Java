public class ArraySorted {

static int a[]={1,2,4,7,12,17,20,3};
    static boolean isSorted(int a[]){
        for(int i=1;i<a.length;i++){
            if(a[i]>=a[i-1]){
                
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if(isSorted(a)){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is Not Sorted");
        }
        
    }
}
