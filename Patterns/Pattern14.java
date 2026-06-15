public class Pattern14 {
    public static void main(String[] args) {
        int num=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(num);
                num=num+1;
            }System.out.println("");
        }
    }
}
/*
Output:
1
23
456
78910
*/