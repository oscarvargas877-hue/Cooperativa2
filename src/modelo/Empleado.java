/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {
    //ATRIBUTOS
    private int idEmpleado;
    private double salario;
    private String cargo;
    private String fechaContratacion;
    
    //CONSTRUCTOR 
       public Empleado(int idEmpleado, double salario, String cargo, String fechaContratacion) {
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
    }
 
    //CONSTRUCTOR CLASE PADRE + LA CLASE HIJA
        public Empleado(int idEmpleado, double salario, String cargo, String fechaContratacion, 
                int idPersona, String nombre, String cedula, String direccion, int telefono, String email, 
                boolean genero, String fechaNacimiento) {
        super(idPersona, nombre, cedula, direccion, telefono, email, genero, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
    }

    
    //METODO SET Y GET
     public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }


    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }
        
    //ESCRIBIR toString(), Usar super.toString

    @Override
    public String toString() {
        return super.toString()+"id empleado: " + getIdEmpleado() + "\n"
                +"salario: " + getSalario() + "\n"+ "cargo: " +getCargo() + "\n" 
                +"fechaContratacion: " + getFechaContratacion(); 
    }
    
    }

  
    
    
    
    

