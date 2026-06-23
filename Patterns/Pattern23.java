// public class Pattern23 {
//     public static void main(String[] args) {
//         int n=4;
//         //part 1
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 if(i!=3){
//                     for(int k=0;k<n-i-1;k++){
//                         System.out.print("");
//                     }
                    
//                 }
//                 System.out.print("*");
//             }System.out.println(" ");

//             //part 2
//             for(int j=0;j<n;j++){
                
//                 for(int k=0;k<n-i-1;k++){
//                     System.out.print("");
//                 }
//                 System.out.print("*");
                
//             }System.out.println(" ");
//         }
//     }
// }


class Pattern23 {
    public static void main(String[] args) {
        int n=4;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

       
    }
}
/*
Output:
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */