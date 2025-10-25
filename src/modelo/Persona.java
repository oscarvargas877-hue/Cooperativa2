/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Persona {
    //atributos
   private int idPersona;
   private String nombre;
   private String cedula;
   private String direccion;
   private int telefono;
   private String email;
   private boolean genero;//true->femenino false->masculino
   private String fechaNacimiento;
    
   //constructor
   public Persona(){}

    public Persona(int idPersona, String nombre, String cedula, String direccion, int telefono, String email, boolean genero, String fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }
    //Metodo get y set
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    // Escribir toString() para mostrar datos de la clase padre
    @Override
    public String toString() {
         return "IdPersona:"+getIdPersona()+"\n"+
                 "Nombre:"+getNombre()+"\n"+
                 "Cédula:"+getCedula()+"\n"+
                 "Dirección:"+getDireccion()+"\n"+
                 "Teléfono:"+getTelefono()+"\n"+
                 "Email:"+getEmail()+"\n"+
                 "Género:"+getGenero()+"\n"+
                 "Fecha de Nacimiento:"+getFechaNacimiento()+"\n"+
                 getClass(); 
    }
}
