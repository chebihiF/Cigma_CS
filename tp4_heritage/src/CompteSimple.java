public class CompteSimple extends Compte{

    private int decouvert ;

    public CompteSimple(int code, double solde, int decouvert) {
        super(code, solde);
        this.decouvert = decouvert;
    }

    public CompteSimple(int code, int decouvert) {
        super(code);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double mnt) {
        if(mnt <= getSolde()+decouvert) {
            setSolde(getSolde() - mnt);
        }
    }

    @Override
    public String toString() {
        return "CompteSimple{" +
                "decouvert=" + decouvert +
                "} " +super.toString();
    }
}
