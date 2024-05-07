package dominio;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	Direccion direccion;
	Sexo sexo;
	TipoAlerta alerta;
	Boolean esUsuarioActivo;
	
	public Boolean getEsUsuarioActivo() {
		return esUsuarioActivo;
	}
	public void setEsUsuarioActivo(Boolean esUsuarioActivo) {
		this.esUsuarioActivo = esUsuarioActivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public TipoAlerta getAlerta() {
		return alerta;
	}
	public void setAlerta(TipoAlerta alerta) {
		this.alerta = alerta;
	}
	
}
