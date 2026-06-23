class Pattern22{
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            //top
            for(int j=0;j<n-i-1;j++){
                //spaces
                System.out.print(" ");
            }
            System.out.print("*");
                if(i!=0){
                    //space
                    for(int j=0;j<2*i;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            System.out.println(" ");
            
        }
        //bottom part
        for(int i=0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                //spaces
                System.out.print(" ");
            }
            System.out.print("*");
                if(i!=n-2){
                    //space
                    for(int j=0;j<2*(n-i)-5;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            System.out.println(" ");
        }
    }
}
/*
Output:
   * 
  *  * 
 *    * 
*      * 
 *    * 
  *  * 
    * 
*/