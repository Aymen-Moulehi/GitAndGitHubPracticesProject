import java.util.ArrayList;
import java.util.List;

public class Enseignant extends Personne{
    private List<Enseignant> ListEnseignant;

    public Enseignant(String id, String cin, String nom, String prenom, int age)
    {
        super(id,cin,nom,prenom,age);
        this.ListEnseignant = new ArrayList<>();
    }
    public void ajouterEnseignant(Enseignant e)
    {
        this.ListEnseignant.add(e);
    }
    public void supprimerEnseignant(Enseignant e)
    {
        boolean trouve  = this.ListEnseignant.contains(e);
        if (trouve)
        {
            this.ListEnseignant.remove(e);
        }
    }
    public void afficherListEnseignant()
    {
        for(Enseignant e : this.ListEnseignant)
        {
            System.out.println(e.toString());
        }
    }
}

