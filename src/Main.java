import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("7000", "1001", "fadhel", "ben fadhel", 22,
        12, 454545, "ALINFO10");
        Etudiant etudiant2 = new Etudiant("7001", "1002", "amin", "ben amin", 23,
                15, 454545, "ALINFO10");
        Etudiant etudiant3 = new Etudiant("7002", "1003", "karim", "ben karim", 21,
                11, 454545, "ALINFO10");

        ArrayList<Etudiant> list=new ArrayList();
        list.add(etudiant1);
        list.add(etudiant2);
        list.add(etudiant3);

    }
}