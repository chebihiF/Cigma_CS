import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        //5379293 s =>J, H, min, s
        Scanner clavier = new Scanner(System.in); // data source = keyboard
        int s, min, h, j;
        System.out.print("give a number (s) : ");
        s = clavier.nextInt();
        int hj = 3600 * 24;
        j = s/ hj; // j = h/24 (h = s/3600) => j = (s/3600)/24 => s/(3600*24)
        int r = s%hj ; // => < 3600*24
        h = r/3600 ;
        r = r%3600;
        min = r/60;
        s = r%60;
        System.out.println(j+" Jour "+h+"H "+min+"Min "+s+"S");
        /*
        Scanner clavier = new Scanner(System.in); // data source = keyboard
        String name, lastName = "fayçal" ;
        int a = 10, b = 20 ;
        System.out.print("Name : "); // sout ln => saut
        name = clavier.nextLine();
        System.out.println("your name is : "+name+" "+lastName+" !!!!! "); //concatination
        System.out.println("result : "+(a+b));
        */

    }
}
