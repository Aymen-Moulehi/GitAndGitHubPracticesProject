import java.util.ArrayList;
import java.util.List;

public class Enseignant {
    private List<Enseignant> ListEnseignant;

    public Enseignant()
    {
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

