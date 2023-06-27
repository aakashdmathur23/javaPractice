public class TilePlacement {
    
    public static int placeTiles(int n, int m){

        if(n==m){
            return 2;
        }

        if(n<m){
            return 1;
        }

        //Vertically 

        int vertPlacement = placeTiles(n-m, m);

        //Horizontally

        int HoriPlacement = placeTiles(n-1, m);

        return vertPlacement+HoriPlacement;
    }

    public static void main(String args[]) {

        int n=3, m=3;
        int placement = placeTiles(n, m);
        System.out.println(placement);
        
    }
}
