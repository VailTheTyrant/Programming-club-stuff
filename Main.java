import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = 0;
        System.out.println(a);
        while (a > 0){
            a = a / 10;
            c = c + 1;
        }
        if (c % 2 == 0){
            System.out.println( "Even" );
        
        }
        else {
            System.out.println( "Odd" );
        }
        
    }
}