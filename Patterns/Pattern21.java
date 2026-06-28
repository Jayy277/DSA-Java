public class Pattern21 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
             for(int j=0;j<n-i;j++){
                System.out.print(" ");
             }
             for(int j=1;j<=i+1;j++){
                System.out.print(j);
             }
             for(int j=i;j>=1;j--){
                System.out.print(j);
                
             }System.out.println("");
        }
    }
}
/*
Output:
    1
   121
  12321
 1234321
*/
