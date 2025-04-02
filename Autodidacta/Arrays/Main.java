package POO.src.Autodidacta.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        ArrayList<Integer> num=new ArrayList<>();
        a.add("Hola");
        num.add(2);
        num.add(2);
        num.add(2);
        num.add(2);
        num.add(2);
        num.add(2); 
        num.add(2);

        for (Integer i : num) {
            System.out.print(num.get(i));
        }

        System.out.println(a);
        System.out.println(num);
        System.out.println(a.get(0));
        System.out.println(num.get(0));
    }
    
}
