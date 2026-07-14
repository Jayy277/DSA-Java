import java.util.*;
class UnionSortedArray{
    public static void main(String[] args) {
        int arr1[]={1, 1 , 2 , 3, 4, 5 };
        int arr2[]={2, 3, 4, 4, 5, 6};
        ArrayList<Integer> Union=new ArrayList<>();
        int i=0;
        int j=0;
        int n=arr1.length;
        int m=arr2.length;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                //check is Empty and not duplicate element 
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i]){
                Union.add(arr1[i]); 
                }
                i++;

            }else if(arr1[i]>arr2[j]){
               if(Union.isEmpty() || Union.get(Union.size()-1)!=arr2[j]){
                Union.add(arr2[j]); 
                }
                j++;

            }else{
                //element are equale
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i]){
                Union.add(arr1[i]); 
                }
                i++; j++;

            }
        }

        while(i<n){
            if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i]){
                Union.add(arr1[i]);
            }
            i++;

        }
        while(j<m){
            if(Union.isEmpty() || Union.get(Union.size()-1)!=arr2[j]){
                Union.add(arr2[j]);
            }
            j++;

        }
        for(int k=0;k<Union.size();k++){
            System.out.print(Union.get(k)+" ");
        }
    }
}