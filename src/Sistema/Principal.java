package Sistema;

import java.util.Scanner;

public class Principal {

	private static int elección;
	
	public static void main(String[] args) {
		
		procesos();
	}
	
	private static void procesos() {
		
		Scanner ingresoDatos;
		elección=0;
		
		Instituto i1;
		
		i1 = new Instituto();
		
		i1.mostrarDatos();
		
		System.out.println("---");
		
		System.out.println("Menú: ");
		System.out.println("1- Crear y añadir estudiante");
		System.out.println("2- Crear y añadir profesor");
		System.out.println("3- Crear y añadir personal de servicio");
		System.out.println("4- Crear y añadir curso");
		System.out.println("0: Salir");

		System.out.println("---");
		
		ingresoDatos = new Scanner(System.in);
		elección = Integer.parseInt(ingresoDatos.nextLine());
		
		while (elección!=0) {
		
		switch (elección) {
		case 1: i1.añadirEstudiante();
		case 2: i1.añadirProfesor();
		case 3: i1.añadirPersonalS();
		case 4: i1.añadirCurso();
			}
		break;
		}
		
		ingresoDatos.close();
	}
}