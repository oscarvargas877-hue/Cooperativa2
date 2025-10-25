/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {

    Persona persona1 = new Socio(
                        1001, 
                        "Juan Pérez", 
                        "1002003001", 
                        "Ibarra", 
                        992937789, 
                        "jp@gmail.com", 
                        false, 
                        "23/01/1990",
                        101, 
                        123456, 
                        "01/01/2000",
                        "A");

        
        // 🔼 UPCASTING: tratamos al Socio como Persona (clase padre)
        System.out.println(" UPCASTING ");
        System.out.println(persona1.toString());
        System.out.println();

        
        // 🔽 DOWNCASTING: recuperamos al Socio para usar sus atributos específicos
        // instanceof: me ayuda a evitar que el programa se truene o rompa omitiendo, si el objeto no es el tipo que creo simplemnte no hace nada
        if ((persona1 instanceof Socio)) {
            Socio socioRecuperado = (Socio) persona1;

            System.out.println(" DOWNCASTING ");
            System.out.println("Estado del socio: " + socioRecuperado.getEstado());
            System.out.println("Número de cuenta: " + socioRecuperado.getNumCuenta());
            System.out.println();
            System.out.println("Datos completos del socio: ");
            System.out.println(socioRecuperado.toString()); 
            System.out.println();
            
            
            //UPCASTING Y DOWNCASTING CON EMPLEADO
    
             Persona persona2 = new Empleado(
                                    201,                    
                                    1500.75,                
                                    "Desarrollador",       
                                    "10/03/2023",          
                                    2001,                   
                                    "Marlene Tapia",        
                                    "1002003002",           
                                    "Quito",                
                                    987654321,              
                                    "mar@gmail.com",       
                                    true,                  
                                    "15/05/1988");
               
             //UPCASTING 
             System.out.println("UPCASTING");
             System.out.println(persona2.toString());
             System.out.println();
             
             //DOWNCASTING
             if((persona2 instanceof Empleado)){
                Empleado empleadoRecuperado = (Empleado) persona2;
                System.out.println(" DOWNCASTING   ");
                System.out.println("Salario del empleado: " +empleadoRecuperado.getSalario());
                System.out.println("Cargo del empleado: " + empleadoRecuperado.getCargo());
                System.out.println();
                System.out.println("Datos completos del empleado:  " + empleadoRecuperado.toString());

             }
            
        }
        
     
    }
}
