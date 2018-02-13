package DirectoryClothing;

import java.io.*;

public class UI {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static Logic Lg = new Logic();
	static int id;
	static String color, tamano, descripcion, precio;
	static String nombre, cedula, apellidos, direccion, telefono;

	public static void main(String[] args) throws IOException {
		int opc;
		boolean noSalir = true;

		do {
			mostrarMenu();
			opc = leerOpcion();
			noSalir = ejecutarAccion(opc);
		} while (noSalir);

	}

	static void mostrarMenu() {
		out.println();
		out.println("Menu de opciones del sistema");
		out.println();
		out.println("1.  Crear Catalogo.");
		out.println("2.  Mostar Catalogo.");
		out.println("3.  Crear cliente.");
		out.println("4.  Mostar cliente");
		out.println("5.  Salir.");
		out.println();
	}

	static int leerOpcion() throws IOException {
		int opcion;

		out.print("Selecciones su opcion: ");
		opcion = Integer.parseInt(in.readLine());
		out.println();

		return opcion;
	}

	public static boolean ejecutarAccion(int popcion) throws IOException {
		boolean noSalir = true;
		switch (popcion) {
		case 1:
			IngresarDatosCatalogo();

			break;

		case 2:// Mostramos las categorias guardas en el objeto
			MostrarCatalogo();

			break;

		case 3:
			IngresarClientes();

			break;

		case 4:
			MostrarClientes();

			break;

		case 5:
			noSalir = false;
			break;

		default:
			out.println("Opcion Invalidad");
			out.println();
			break;
		}
		return noSalir;
	}

	static void IngresarDatosCatalogo() {

		try {
			out.println("Ingrese el Id de la camisa");
			id = Integer.parseInt(in.readLine());
			out.println("Ingrese el color de la camisa");
			color = in.readLine();
			out.println("Ingrese el tamaño de la camisa");
			tamano = in.readLine();
			out.println("Ingrese la descripcion de la camisa");
			descripcion = in.readLine();
			out.println("Ingrese el precio de la camisa");
			precio = in.readLine();
			Lg.IngresarDatosCatalogo(id, color, tamano, descripcion, precio);
		} catch (Exception ex) {// evitar los throws
		}
	}

	static void MostrarCatalogo() {
		String[] listado;
		listado = Lg.listCamisa();

		for (String datos : listado) {
			out.println(datos.toString());
		}
	}

	static void IngresarClientes() {

		try {
			out.println("Ingrese el nombre");
			nombre = in.readLine();
			out.println("Ingrese la cedula");
			cedula = in.readLine();
			out.println("Ingrese los apellidos");
			apellidos = in.readLine();
			out.println("Ingrese la direccion");
			direccion = in.readLine();
			out.println("Ingrese el telefono");
			telefono = in.readLine();
			Lg.IngresarClientes(nombre, cedula, apellidos, direccion, telefono);

		} catch (Exception ex) {// evitar los throws
		}

	}

	static void MostrarClientes() {

		String[] listado;
		listado = Lg.listClient();

		for (String datos : listado) {
			out.println(datos.toString());

		}

	}

}
