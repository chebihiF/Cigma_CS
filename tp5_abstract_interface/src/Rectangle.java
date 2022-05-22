public class Rectangle extends Quadrilatere{

    public Rectangle(int larg, int longu){
        cote1 = larg;
        cote2 = larg;
        cote4 = longu;
        cote3 = longu;
    }

    @Override
    public double surface() {
        return cote1*cote3;
    }
}
