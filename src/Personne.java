


abstract class Personne {

    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    public Personne(String nom, String prenom, int age, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
    }
   
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String toString() {
        String sms = "\nnom: "+nom+"\nprenom: "+prenom+"\nage: "+age+"\nadresse: "+adresse;
        return sms;
    }
    abstract void ecrirePersonne();
    static void nombrePersonne(int n){
        n++;
    };
    
    void modifierPersonne(String vString){
        this.adresse = vString;
        ecrirePersonne();
    }

}