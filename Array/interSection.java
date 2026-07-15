//Leetcode Question Number 350
import java.util.*;
public class interSection {
    public static void main(String[] args) {
        int arr1[]={1, 2, 2, 3, 3, 4, 5, 6};
        int arr2[]={2, 3, 3, 5, 6, 6, 7};
        ArrayList <Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        int m=arr1.length;
        int n=arr2.length;

        while (i<m && j<n) {
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
    
            
        }
        for(int k=0;k<ans.size();k++){
            System.out.print(ans.get(k)+" ");
        }
        
    }
}
