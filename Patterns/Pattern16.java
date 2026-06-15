public class Pattern16{
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);

            for (char j = ch; j >= 'A'; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}