import java.util.*;

public class TableOfn {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int element = 0;

        for(int i=0; i<=10; i++){

            element = n*i;

            System.out.println(element);
        }
}
}
