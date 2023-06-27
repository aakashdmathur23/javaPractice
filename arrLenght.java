import java.util.Scanner;

public class arrLenght {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String array [] = new String[size];

        int totalLenght = 0;

        for(int i=0; i<size; i++){
            array[i] = sc.next();
            totalLenght += array.length;
        }

        System.out.println(totalLenght);

}
}