import java.util.Iterator;

public  class Persona
{

	protected int id;
	protected String nombre;
	protected String Apellidos;
	protected int Edad;
	
	
	{
	
//Menu
	
		
		int opcion;
		do //Controlamos la elección de opciones.Solo nos permite elegir
		//opciones desde el 1 al 4.
		{
		System.out.println("1.Añadir jugador");
		System.out.println("2.Eliminar jugador");
		System.out.println("3.Mostrar jugadores");
		System.out.println("4.Salir");
		System.out.println();
		System.out.print("Introduzca una opcion: ");
	
		opcion=Integer.parseInt(stdin.readLine());
		
		//variable
		if(opcion<0 || opcion>4) System.out.println("***Opcion Incorrecta***");
		}while(opcion<0 || opcion>4);

		switch(opcion)
		{
		case 1: 
		break;

		case 2:

		break;
		case 3:

		break;
		case 4: 
		break;
		}
		while(opcion!=4);

		} 
		
	


	// constructor, getter y setter
	

	public void Concentrarse() {
		
	}

	public void Viajar() {
		
	}

	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		this.Edad = edad;
	}

	//Eliminar un entrenador
	public void eliminarEntrenador(String nombre) {
		Iterator<Persona> i = Persona.iterator();
		
		while(i.hasNext()){
			Persona a = i.next();
			if (a.getNombre().equals("getNombre") ) {
				i.remove();
			}
		}
	}

	private static Iterator<Persona> iterator() {
		return null;
	}

	//Mostrar
	public final void mostrar() {
		super.mostrar();
		System.out.print("gerger");
		if (Futbolista) {
			System.out.print("gerge");
		} else {
			System.out.print("gergerg");
		}
}
	
	
}