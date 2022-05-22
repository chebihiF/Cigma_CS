public abstract class Quadrilatere extends FG{

    protected int cote1;
    protected int cote2;
    protected int cote3;
    protected int cote4;

    @Override
    public double perimettre() {
        return cote1+cote2+cote3+cote4;
    }
}
