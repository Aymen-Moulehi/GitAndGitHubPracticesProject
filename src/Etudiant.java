public class Etudiant extends Personne{
    private int moyenne;
    private int numInscription;
    private String classe;


    public Etudiant(String id, String cin, String nom, String prenom, int age,
                    int moyenne, int numInscription, String classe) {
        super(id, cin, nom, prenom, age);
        this.moyenne = moyenne;
        this.numInscription = numInscription;
        this.classe = classe;
    }

    public int getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }

    public int getNumInscription() {
        return numInscription;
    }

    public void setNumInscription(int numInscription) {
        this.numInscription = numInscription;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "moyenne=" + moyenne +
                ", numInscription=" + numInscription +
                ", classe='" + classe + '\'' +
                '}';
    }
}
