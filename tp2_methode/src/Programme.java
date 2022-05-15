import java.util.Scanner;
public class Programme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hello(); // consomation
        System.out.print("Password : ");
        String cryptoPass = myCrypto(sc.nextLine());
        System.out.println("the crypto pass is : "+cryptoPass);
    }

    public static String myCrypto(String pass){
        String pass1 = pass.substring(0, pass.length()/2);
        String pass2 = pass.substring(pass.length()/2);
        String cryptoPass = pass1+"Az23PO"+pass2+"PASS";
        cryptoPass = cryptoPass.replace('a','z');
        return cryptoPass;
    }

    // declaration
    public static void hello(){
        System.out.println("Hello World");
    }
}
