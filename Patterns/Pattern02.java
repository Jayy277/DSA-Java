public class Pattern02 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<n;j++){
                System.err.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
/*
Output:

ABCD
ABCD
ABCD
ABCD

*/