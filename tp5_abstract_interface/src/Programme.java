import java.util.ArrayList;
import java.util.List;

public class Programme {
    public static void main(String[] args) {

        Carrer cr = new Carrer(10);
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(20,10);
        Cercle c1 = new Cercle(50);

        List<FG> figures = new ArrayList<FG>();
        figures.add(cr);
        figures.add(r1);
        figures.add(r2);
        figures.add(c1);

        double surface = 0 ;
        for(FG figure: figures){
            surface+= figure.surface();
        }

        List<Comparable> comparables = new ArrayList<>();
        comparables.add(c1);
        comparables.add(cr);


        System.out.println("Somme : "+surface);

    }
}
