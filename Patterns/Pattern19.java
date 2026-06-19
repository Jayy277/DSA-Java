public class Pattern19 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<4;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print(i+1);
                System.out.print(" ");
            }System.out.println("");
            n--;
        }
    }
}
/*
Output:
1 1 1 1 
 2 2 2 
  3 3 
   4 
*/