public class Pattern07 {
    public static void main(String[] args) {
        char ch='A'-1;
        int n=5;
        for(int i=0;i<n;i++){
            ch++;
            for(int j=0;j<i+1;j++){
                System.out.print(ch);
            }System.out.println("");
        }
    }
}
/*
Output:
A
BB
CCC
DDDD
EEEEE
*/