package DirectoryClothing;

import java.io.IOException;
import java.util.ArrayList;

public class Logic {

	ArrayList<Camisa> listCamisa = new ArrayList<Camisa>();
	ArrayList<Client> listClient = new ArrayList<Client>();

	public void IngresarDatosCatalogo(int id, String color, String tamano, String descripcion, String precio)
			throws IOException {

		Camisa miCamisa = new Camisa();
		miCamisa.setId(id);
		miCamisa.setColor(color);
		miCamisa.setTamano(tamano);
		miCamisa.setDescripcion(descripcion);
		miCamisa.setPrecio(precio);
		listCamisa.add(miCamisa);

	}

	public String MostrarCatalogo() throws IOException {
		String mostrar = "";

		for (int i = 0; i < listCamisa.size(); i++) {
			Camisa camisa = listCamisa.get(i);
			System.out.println("El Id es: " + camisa.getId() + " El color es: " + camisa.getColor() + ""
					+ "El tamaño es: " + camisa.getTamano() + "La descripcion es:" + camisa.getDescripcion()
					+ "El precio es: " + camisa.getPrecio());
		}
		return mostrar;
	}

	public String[] listCamisa() {
		String[] data = new String[listCamisa.size()];
		int cont = 0;
		for (Camisa dato : listCamisa) {
			data[cont] = dato.toString();
			cont++;
		}
		return data;
	}

	public void IngresarClientes(String nombre, String cedula, String apellidos, String direccion, String telefono)
			throws IOException {

		Client miClient = new Client();
		miClient.setNombre(nombre);
		miClient.setCedula(cedula);
		miClient.setApellidos(apellidos);
		miClient.setDireccion(direccion);
		miClient.setTelefono(telefono);
		listClient.add(miClient);

	}

	public String MostrarClientes() throws IOException {
		String mostrar = "";

		for (int i = 0; i < listClient.size(); i++) {
			Client client = listClient.get(i);
			System.out.println("El nombre es:" + client.getNombre() + "La cedula es: " + client.getCedula()
					+ "El apellido es: " + client.getApellidos() + "" + "La direccion es: " + client.getDireccion()
					+ " El telefono es: " + client.getTelefono());
		}
		return mostrar;
	}

	public String[] listClient() {
		String[] data = new String[listClient.size()];
		int cont = 0;
		for (Client dato : listClient) {
			data[cont] = dato.toString();
			cont++;
		}
		return data;
	}
}
