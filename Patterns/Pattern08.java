public class Pattern08 {
    public static void main(String[] args) {
        int n=4;
        int num=1;
        for(int i=0;i<n;i++){
            num=1;
            for(int j=0;j<i+1;j++){
                System.out.print(num);
                num++;
            }System.out.println("");
        }
    }
}
/*
Output:
1
12
123
1234
*/
