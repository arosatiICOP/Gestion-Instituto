package Sistema;

import java.util.Scanner;

public class Principal {

	private static int elecci�n;
	
	public static void main(String[] args) {
		
		procesos();
	}
	
	private static void procesos() {
		
		Scanner ingresoDatos;
		elecci�n=0;
		
		Instituto i1;
		
		i1 = new Instituto();
		
		i1.mostrarDatos();
		
		System.out.println("---");
		
		System.out.println("Men�: ");
		System.out.println("1- Crear y a�adir estudiante");
		System.out.println("2- Crear y a�adir profesor");
		System.out.println("3- Crear y a�adir personal de servicio");
		System.out.println("4- Crear y a�adir curso");
		System.out.println("0: Salir");

		System.out.println("---");
		
		ingresoDatos = new Scanner(System.in);
		elecci�n = Integer.parseInt(ingresoDatos.nextLine());
		
		while (elecci�n!=0) {
		
		switch (elecci�n) {
		case 1: i1.a�adirEstudiante();
		case 2: i1.a�adirProfesor();
		case 3: i1.a�adirPersonalS();
		case 4: i1.a�adirCurso();
			}
		break;
		}
		
		ingresoDatos.close();
	}
}