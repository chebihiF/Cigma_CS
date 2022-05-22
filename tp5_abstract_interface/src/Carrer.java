public class Carrer extends Rectangle implements Comparable  {

    public Carrer(int cote){
        super(cote,cote);
    }

    public void display(){
        System.out.println("Test");
    }

    @Override
    public boolean comparer(Comparable c) {
        return (surface() > c.surface());
    }
}
