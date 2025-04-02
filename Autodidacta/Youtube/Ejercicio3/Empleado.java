package Autodidacta.Youtube.Ejercicio3;

public class Empleado {
    private String dni;
    private String nombre;
    private String departamento;
    private Empresa empresa;
    private int edad;
    private static int salario_base=1000;
    private boolean teletrabajo;

    public Empleado(String dni,String nombre,String departamento,Empresa empresa,int edad,boolean teletrabajo){
        this.dni=dni;
        this.nombre=nombre;
        this.departamento=departamento;
        this.empresa=empresa;
        this.edad=edad;
        this.teletrabajo=teletrabajo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static void setSalario_base(int salario_base) {
        Empleado.salario_base = salario_base;
    }
    public void setTeletrabajo(boolean teletrabajo) {
        this.teletrabajo = teletrabajo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public String getNombre() {
        return nombre;
    }
    public static int getSalario_base() {
        return salario_base;
    }
    public boolean getTeletrabajo(){
        return teletrabajo;
    }

    
}
