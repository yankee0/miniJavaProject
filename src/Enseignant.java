
public class Enseignant extends Personne {
    
    private boolean grincheux;
    private int nbHeuresCours;
    private String specialite;

    
    public Enseignant(String nom, String prenom, int age, String adresse, boolean grincheux,
            int nbHeuresCours, String specialite) {
        super(nom, prenom, age, adresse);
        this.grincheux = grincheux;
        this.nbHeuresCours = nbHeuresCours;
        this.specialite = specialite;
    }

    
    
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public int getNbHeuresCours() {
        return nbHeuresCours;
    }
    public void setNbHeuresCours(int nbHeuresCours) {
        this.nbHeuresCours = nbHeuresCours;
    }
    public boolean isGrincheux() {
        return grincheux;
    }
    public void setGrincheux(boolean grincheux) {
        this.grincheux = grincheux;
    }
    void ecrirePersonne() {
        System.out.println("Enseignant ");
        if (isGrincheux() == true ) {
            System.out.println("grincheux: oui");
        }
        else System.out.println("grincheux: non");
        System.out.println("nombre d'heures de cours: "+getNbHeuresCours());
        System.out.println("sspecialite: "+getSpecialite());
    }
    public String toString() {
        ecrirePersonne();
        return super.toString();
    }
    public double SalaireEnseignant(double paye){

        double Salaire = 0; 
        if (isGrincheux() == false) {
            int heuresNor = 40;
            if (getNbHeuresCours() > heuresNor ) {
                int heuresSup = getNbHeuresCours() - heuresNor;
                Salaire = (heuresNor * paye) + (heuresSup * (3*paye/2));
                return Salaire;
            }
            else {
                Salaire = getNbHeuresCours() * paye;
                return Salaire;
            }
        } else {
            Salaire = getNbHeuresCours() * paye;
            return Salaire;
        }
        
    }
}
