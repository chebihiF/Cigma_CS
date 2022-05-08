import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("############ MENU ###############");
        System.out.println("1 - Parité");
        System.out.println("2 - Temp");
        System.out.println("3 - Quitter");
        System.out.print("choix : ");
        int choix = scanner.nextInt();
        switch (choix){
            case 1 : {
                System.out.print("Donner un nombre : ");
                int nbr = scanner.nextInt();
                if(nbr%2 == 0){
                    System.out.println("paire");
                }else {
                    System.out.println("impaire");
                }
            }break;
            case 2 : {
                System.out.print("temp : ");
                int t = scanner.nextInt();
                if(t<=0){
                    System.out.println("Solid");
                }else if(t<100){
                    System.out.println("Liquide");
                }else{
                    System.out.println("Gaz");
                }
            }break;
            case 3: {
                System.out.println("Merci d'avoir util ...");
            }break;
            default:
                System.out.println("svp il faut ... 1,2 et 3");
        }
    }
}
