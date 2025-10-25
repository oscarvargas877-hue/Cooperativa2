/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
//
/**
 *
 * @author Usuario
 */
 //SUBCLASE SOCIO
public class Socio extends Persona{
    private int idSocio;
    private int numCuenta;
    private String fechaIngreso;
    private String estado;//banderas"A":Activo,"I":Inactivo,"B":Bloqueado

    public Socio() {
    }
    //constructor subclase
    public Socio(int idSocio, int numCuenta, String fechaIngreso, String estado) {
        this.idSocio = idSocio;
        this.numCuenta = numCuenta;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }
        // Constructor COMPLETO: incluye atributos de Persona + propios
    public Socio(int idPersona, String nombre, String cedula, String direccion, int telefono, String email, boolean genero, String fechaNacimiento,int idSocio, int numCuenta, String fechaIngreso, String estado) {
        super(idPersona,nombre,cedula,direccion,telefono,email,genero,fechaNacimiento);
        this.idSocio = idSocio;
        this.numCuenta = numCuenta;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }
       //metodo set y get
    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Poner substring para poner datos propios de la subclase 
    @Override
    public String toString() {
        //super.toString(): me da todos los datos de mi clase padre
        return super.toString()+
                "Id Socio:"+getIdSocio()+"\n"+
                "Número de Cuenta:"+getNumCuenta()+"\n"+
                "Fecha de Ingreso:"+getFechaIngreso()+"\n"+
                "Estado:"+getEstado();
    }
    
}
