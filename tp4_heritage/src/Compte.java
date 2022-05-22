public class Compte {
    private int code ;
    private double solde ;
    private static int nbrComptes = 0 ;

    public void verser(double mnt){
        solde += mnt ; // solde = solde + mnt
    }

    public void retirer(double mnt){
        if(mnt <= solde)
            solde -= mnt;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }

    public Compte(int code) {
        this.code = code;
        this.solde = 0;
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public int getCode() {
        // controle security
        return code;
    }

    public void setCode(int code) {
        // controle security
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getNbrComptes() {
        return nbrComptes;
    }

    public static void setNbrComptes(int nbrComptes) {
        Compte.nbrComptes = nbrComptes;
    }
}
