public class PascalTriangle {
    
    public static void main(String args[]) {
    int n=5;

    for(int i=n; i<=n; i++){

        //for spaces

        int space = 2*(n-i);
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }

        //for numbers

        for(int j=1; j<=i; j++){
            System.out.print(j);
        }   
    }
    System.out.println();
}
}
