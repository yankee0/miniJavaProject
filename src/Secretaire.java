public class Secretaire extends Personne {
    
    private int numeroBureau;
    public int getNumeroBureau() {
        return numeroBureau;
    }
    public void setNumeroBureau(int numeroBureau) {
        this.numeroBureau = numeroBureau;
    }
    public Secretaire(String nom, String prenom, int age, String adresse, int numeroBureau) {
        super(nom, prenom, age, adresse);
        this.numeroBureau = numeroBureau;
    }
    public String toString() {
        String m = super.toString()+"Categorie: Secretaire\nnumero de bureau: "+getNumeroBureau();
        return m;        
    }
    void ecrirePersonne() {
        System.out.println("Secretaire");
        System.out.println("numero de bureau"+getNumeroBureau());        
    }
}
