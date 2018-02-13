package DirectoryClothing;

public class Camisa {

	int id;
	String color, tamano, descripcion, precio;

	public Camisa() {

	}

	public Camisa(int id, String color, String tamano, String descripcion, String precio) {
		this.id = id;
		this.color = color;
		this.tamano = tamano;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String toString() {
		String info = "";
		info = ("El id e : " + id + " El color es: " + color + " El tamaño es: " + tamano + " La descripcion es: "
				+ descripcion + " El precio es :" + precio);

		return info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

}
