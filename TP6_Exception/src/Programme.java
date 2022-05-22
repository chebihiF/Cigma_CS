import java.util.InputMismatchException;
import java.util.Scanner;

public class Programme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("a : ");
            int a = scanner.nextInt();
            System.out.print("b : ");
            int b = scanner.nextInt();
            System.out.println("result is " + Functions.calcule(a,b));
        }catch (ArithmeticException ex1){
            //ex1.printStackTrace();
            System.out.println("impossible de diviser par 0");
        }catch (InputMismatchException ex2){
            System.out.println("type incorrect");
        }catch (RuntimeException ex3){
            System.out.println(ex3.getMessage());
        }
    }


}
