package POO.src.Autodidacta.Arrays;
import java.util.*;
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList<String> nombres=new ArrayList<>();
       
        int cont=0;
        do {
            System.out.println("dime un nombre");
            nombres.add(entrada.nextLine());
            cont++;
        } while (cont<4);
       
        for (String i : nombres) {
            System.out.printf(i+" ");
            
        }

       System.out.println("hola soy el ultimo: " +nombres.get(nombres.size()-1));


        entrada.close();

    }
}
