
public class GestionScolaire {
    

    public static void ordonnertab(Personne[] p) {
        int echange = 0;
        while (true) {
            for (int i = 0; i < p.length; i++) {
                if ((p[i] instanceof Etudiant) && (p[i+1] instanceof Secretaire)) {
                    Etudiant test = (Etudiant) p[i];
                    p[i] = (Secretaire) p[i+1];
                    p[i+1] = (Etudiant) test;
                    echange = 1;
                }
                if ((p[i] instanceof Etudiant) && (p[i+1] instanceof Enseignant)) {
                    Etudiant test = (Etudiant) p[i];
                    p[i] = (Enseignant) p[i+1];
                    p[i+1] = (Etudiant) test;
                    echange = 1;
                }
                if ((p[i] instanceof Enseignant) && (p[i+1] instanceof Secretaire)) {
                    Enseignant test = (Enseignant) p[i];
                    p[i] = (Secretaire) p[i+1];
                    p[i+1] = (Enseignant) test;
                    echange = 1;
                }
            }
            if (echange == 1) {
                echange = 0;
            }
            else break;
        }
    }
    
    public static void main(String[] args) throws Exception {
        Personne[] individu = new Personne[100]; 
        int total = 0;
        int nbEns = 0;
        int nbEtu = 0;
        int nbSec = 0;
        
        individu[0] = new Secretaire("Fall", "Fatou", 27, "Pikine", 6);
        individu[1] = new Enseignant("Ba", "Mandicou", 43, "KéneKhamoul", false, 64, "Systeme d'Exploitation");
        individu[2] = new Enseignant("Fall", "Omar", 55, "Beuydeukk", false, 50, "Maths");
        individu[3] = new Etudiant("Faye", "Elhadji", 20, "Grand Dakar", 3, "DSTI");
        individu[4] = new Etudiant("Lo", "Souleymane", 21, "Fofou Nonou", 16, "DSTI");
        individu[5] = new Etudiant("Ramos", "Fabrice", 20, "Pout", 13, "DSTI");
        individu[6] = new Secretaire("ly", "Awa", 28, "Baobab", 7);
        individu[7] = new Etudiant("Anoma", "Mathieu", 21, "Guinaw Rail", 17, "DSTI");
        individu[8] = new Enseignant("Biaye", "Monsieur", 45, "Goree Musee Maison des esclaves", true, 30, "culture & Societe");
        
        
        int i = 0;
        
        ordonnertab(individu);
        
        while (i < 100) {
            if (individu[i] instanceof Enseignant) {
                System.out.println(individu[i].toString());
                System.out.println("--------------------------");
                i++;
                nbEns++;
            }
            
            else if (individu[i] instanceof Etudiant) {
                System.out.println(individu[i].toString());
                System.out.println("--------------------------");
                i++;
                nbEtu++;
            }
            else if (individu[i] instanceof Secretaire) {
                System.out.println(individu[i].toString());
                System.out.println("--------------------------");
                i++;
                nbSec++;
            }
            else{
                i++;
            }    
        }

        

        System.out.println("nombre etudiants: "+nbEtu);
        System.out.println("nombre enseignants: "+nbEns);
        System.out.println("nombre secretaires: "+nbSec);
        total = nbEns + nbEns + nbSec ;
        System.out.println("total: "+total );

        


    }
}
