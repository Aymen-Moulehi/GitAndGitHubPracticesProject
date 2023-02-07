import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Etudiant et1=new Etudiant("1","14523698","salhi","saleh",25,12,335,"ALINFO10");
        et1.setClasse("ALINFO2");
        System.out.println(et1.getClasse());


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

        Enum_Niveau e1 = Enum_Niveau.ALINFO1;
        Enum_Niveau e2 = Enum_Niveau.ALINFO2;
        Enum_Niveau e3 = Enum_Niveau.ALINFO3;
        Enum_Niveau e4 = Enum_Niveau.ALINFO4;

        System.out.println("The First Class is " + e1);
        System.out.println("The Second Class is " + e2);
        System.out.println("The Third Class is " + e3);
        System.out.println("The Forth Class is " + e4);

    }
}