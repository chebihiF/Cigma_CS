public class Cercle extends FG implements Comparable{

    private int rayon ;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon,2);
    }

    @Override
    public double perimettre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public boolean comparer(Comparable c) {
        return (surface() > c.surface());
    }
}
