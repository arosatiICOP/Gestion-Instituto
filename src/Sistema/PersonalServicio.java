package Sistema;

import java.util.Scanner;

enum Sección {Biblioteca, Regencia, Secretaría, Administración}

public class PersonalServicio extends Empleado implements Información{

	private Sección secciónPers;
	
	public PersonalServicio() {
		super();
		//super.mostrar();
		//crearPersonal();
	}
	
	public PersonalServicio(Sección secciónPers) {
		super();
		//super.mostrar();
		this.secciónPers=secciónPers;
	}
	
	public void crearPersonal() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese sección que desea asignarle al personal.");
		System.out.println("Opciones: Biblioteca, Regencia, Secretaría, Administración");
		
		try {
			switch(ingresoDatos.nextLine().toLowerCase()) {
			case "biblioteca": secciónPers = Sección.Biblioteca;
			case "regencia": secciónPers = Sección.Regencia;
			case "secretaria": secciónPers = Sección.Secretaría;
			case "administración": secciónPers = Sección.Administración;
			}
		
		}catch(Exception e){
			System.out.println("Ingrese una sección correcta.");
		}
		ingresoDatos.close();
	}
	
	public void reasignarPers() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("La sección del personal es: "+secciónPers);
		System.out.println("¿Desea cambiarla?");
		
		try {
			
			if (ingresoDatos.nextLine().toLowerCase()=="si"){
			System.out.println("Ingrese nueva sección del personal.");
			
			switch(ingresoDatos.nextLine().toLowerCase()) {
			case "biblioteca": secciónPers = Sección.Biblioteca;
			case "regencia": secciónPers = Sección.Regencia;
			case "secretaria": secciónPers = Sección.Secretaría;
			case "administración": secciónPers = Sección.Administración;
			}
			
			}else if (ingresoDatos.nextLine().toLowerCase()=="no") {
				System.out.println("¡Hasta luego!");
			}
			
		}catch(Exception e) {
			System.out.println("Error, ingrese si o no.");
		}
		// Completar, revisar que el texto ingresado no sea el departamento al cual ya pertenece
		ingresoDatos.close();
	}
	
	public String mostrar() {
		
		return "Sección a la que pertenece el personal registrado: "+secciónPers;
	}

	public Sección getSecciónPers() {
		return secciónPers;
	}
	
	public void setSecciónPers(Sección secciónPers) {
		this.secciónPers = secciónPers;
	}
}
