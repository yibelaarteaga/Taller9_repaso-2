package poo;
import java.util.*;
public class Uso_Empleado {
	public static void main(String[] args) {
		
		
		Empleado[] misEmpleados = new Empleado[4];
		misEmpleados[0] = new Empleado();
		misEmpleados[1]= new Empleado();
		misEmpleados[2]= new Empleado();
		misEmpleados[3]= new Empleado();
		
		for(Empleado e: misEmpleados) {
			e. subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " +e.dameNombre() + "Sueldo: " +e.dameSueldo ()  + "Fecha de Alta: "+e.dameFechaContrato());
			
		}
		
		
	}

}

   class Empleado{
	   /*public Empleado(String nom, double sue, int agno, int mes, int dia){
	    
	    nombre = nom;
	    sueldo = sue;
	    gregorianCalendar calendario=new gregorianCalendar(agno, mes-1,dia);
	    
	    altaContrato 0 calendario.getTime();
	   
 }
    public Empleado(String nom) {
    
    
   
  }*/
	  
	   public String dameNombre() {
		   return nombre;
	   }
	   
	   public double dameSueldo() {
		   return sueldo;
	   }
	    public Date dameFechaContrato() {
	    	return altaContrato;
	    }
	   public void subeSueldo(double porcentaje) {
		   double aumento = sueldo*porcentaje/100;
	   }
	   
	   private String nombre;
	   private double sueldo;
	   private Date altaContrato;
   }
	  
