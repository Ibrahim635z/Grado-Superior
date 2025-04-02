package POO.src.Relacion11_Herencia.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno();
        Profesor profe1=new Profesor();

        alumno1.setGrupo("1ºDaW");
        alumno1.setNotaMedia(5.3);
        profe1.setESpecialidad("Informatica");
        profe1.setSalario(2500);
        profe1.Mostrar();
        alumno1.Mostrar();
    }
    
}
