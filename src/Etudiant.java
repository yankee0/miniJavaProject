public class Etudiant extends Personne {
    private int noteMoyenne;
    private String diplomeEnCours;
    public Etudiant(String nom, String prenom, int age, String adresse, int noteMoyenne, String diplomeEnCours) {
        super(nom, prenom, age, adresse);
        this.setNoteMoyenne(noteMoyenne);
        this.setDiplomeEnCours(diplomeEnCours);
    }
    
    public String getDiplomeEnCours() {
        return diplomeEnCours;
    }
    public void setDiplomeEnCours(String diplomeEnCours) {
        this.diplomeEnCours = diplomeEnCours;
    }
    public int getNoteMoyenne() {
        return noteMoyenne;
    }
    public void setNoteMoyenne(int noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }
    @Override
    public String toString() {
        String mess = super.toString() +"Categorie: Etudiant\n"+"Note Moyenne: "+noteMoyenne+"\ndiplome en cours: "+diplomeEnCours+"\n";
        return mess;
    }
    void ecrirePersonne() {
        System.out.println("Etudiant");
        System.out.println("note moyenne: "+noteMoyenne);
        System.out.println("diplome en cours: "+diplomeEnCours);        
    }

    
    
}
