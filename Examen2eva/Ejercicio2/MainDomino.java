package Examen.Ejercicio2;

public class MainDomino {
    public static void main(String[] args) {
        FichaDomino f1=new FichaDomino(6, 1);
        FichaDomino f2=new FichaDomino(0, 4);
        FichaDomino f3=new FichaDomino(3, 3);
        FichaDomino f4=new FichaDomino(0, 1);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println(f2.encajar(f4));
        System.out.println(f1.encajar(f4));
        System.out.println(f1.encajar(f3));
        System.out.println(f1.encajar(f2));

    }
}
