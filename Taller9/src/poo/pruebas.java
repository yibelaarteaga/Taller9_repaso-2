package poo;

public class pruebas {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos()+ "\n" +
		trabajador3. devuelveDatos()+ "\n" + trabajador4.devuelveDatos()) ;
		
		System.out.println(Empleados.dameIdSiguiente());
		
	}

}

      class Empleados{
    	  public Empleados(String nom) {
    		  nombre = nom;
    		  seccion = "Administracion";
    		  Id= IdSiguiente;
    		  IdSiguiente++;
    		  
    	  }
    	  
    	  public void cambiaSeccion(String seccion) {
    		  this.seccion = seccion;
    	  }
    	  
    	  public String devuelveDatos() {
    		  return "El nombre es:" + nombre + "la seccion es " + seccion + " y el Id =" +Id; 
    	  }
    	  
    	  public static String dameIdSiguiente() {
    		  return "El IdSiguiente es : " + IdSiguiente;
    	  }
    	  
    	  private final String nombre;
    	  private String seccion;
    	  private int Id;
    	  private static int IdSiguiente =1;
      }
