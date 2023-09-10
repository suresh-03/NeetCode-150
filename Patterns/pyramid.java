public class pyramid {
    public static void main(String[] args) {
        printPyramid(10);
    }

    
    static void printPyramid(int n){
        int a = 0;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n*2-1; col++){
                if(col == n){
                    System.out.print("* ");
                }
                else if(col >= n-a && col <= n+a){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            a++;
            System.out.println();
        }
    }
}
