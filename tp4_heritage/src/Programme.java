public class Programme {
    public static void main(String[] args) {

        CompteSimple simple = new CompteSimple(12,50000,10000);
        simple.verser(20000);
        System.out.println(simple);

        simple.retirer(80000);
        System.out.println(simple);



    }
}
