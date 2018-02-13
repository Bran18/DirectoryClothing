package DirectoryClothing;

public class Client {


String nombre, cedula, apellidos, direccion, telefono;

public Client () {
	
}

public Client (String nombre, String cedula, String apellidos, String direccion, String telefono) {
	this.nombre=nombre;
	this.cedula=cedula;
	this.apellidos=apellidos;
	this.direccion=direccion;
	this.telefono=telefono;
	
}

public String toString() {
	String info;
	info=("El nombre es: "+nombre+"La cedula es: "+cedula+"El apellido es:"+apellidos+"La direccion es: "+direccion+"El telefono es:"+telefono);
	return info;
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

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}
	
}
