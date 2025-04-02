package POO.src.Relacion11_Herencia.Ejercicio6;

public class Profesor extends Persona { 
    String especialidad; 
    double salario; 
          
    // Método getEspecialidad 
    public String getEspecialidad (){ 
        return especialidad; 
    } 

    // Método getSalario 
    public double getSalario (){ 
        return salario; 
    } 

    // Método setSalario 
    public void setSalario (double salario){ 
        this.salario= salario; 
    } 
     
    // Método setEspecialidad 
    public void setESpecialidad (String especialidad){ 
        this.especialidad= especialidad; 
    } 
    public void Mostrar(){
        System.out.println("Profesor especialista en "+especialidad+ " y cobra " +salario);
    }
} 
