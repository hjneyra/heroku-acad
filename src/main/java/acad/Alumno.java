package acad;

public class Alumno {
	private String nombres;
	private String apellidos;
	
	public Alumno() {
	}
	
	public Alumno(String nombres, String apellidos) {
		this.nombres = nombres;
		this.apellidos = apellidos;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
