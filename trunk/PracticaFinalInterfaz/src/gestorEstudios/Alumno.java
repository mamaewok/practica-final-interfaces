package gestorEstudios;

public class Alumno {

	private String dni;
	private String nombre;
	private String poblacion;
	private int telefono;
	private String fechaNacim;
	private String carrera;
		
	public Alumno(String dni, String nombre, String poblacion, int telefono, String fechaNacim, String carrera){
		this.dni = dni;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.fechaNacim = fechaNacim;
		this.carrera = carrera;
	}
	
	
	
	public String getDni() {
		return dni;
	}
	
	
	@Override
	public String toString() {
		
		return "Alumno: " + nombre + "\n Población: "+poblacion+ "\n Teléfono: " +telefono+
				"\n F.Nacimiento: " +fechaNacim+ "\n Carrera: " + carrera;
	}
}
