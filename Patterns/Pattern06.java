public class Pattern06 {
    public static void main(String[] args) {
        int num=0;
        int n=4;
        for(int i=0;i<n;i++){
            num++;
            for(int j=0;j<i+1;j++){
                System.out.print(num);
                
            }System.out.println("");
        }
    }
}
/* 
Output:
1
22
333
4444
*/
