package Sistema;

import java.util.Scanner;

enum Secci�n {Biblioteca, Regencia, Secretar�a, Administraci�n}

public class PersonalServicio extends Empleado implements Informaci�n{

	private Secci�n secci�nPers;
	
	public PersonalServicio() {
		super();
		//super.mostrar();
		//crearPersonal();
	}
	
	public PersonalServicio(Secci�n secci�nPers) {
		super();
		//super.mostrar();
		this.secci�nPers=secci�nPers;
	}
	
	public void crearPersonal() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese secci�n que desea asignarle al personal.");
		System.out.println("Opciones: Biblioteca, Regencia, Secretar�a, Administraci�n");
		
		try {
			switch(ingresoDatos.nextLine().toLowerCase()) {
			case "biblioteca": secci�nPers = Secci�n.Biblioteca;
			case "regencia": secci�nPers = Secci�n.Regencia;
			case "secretaria": secci�nPers = Secci�n.Secretar�a;
			case "administraci�n": secci�nPers = Secci�n.Administraci�n;
			}
		
		}catch(Exception e){
			System.out.println("Ingrese una secci�n correcta.");
		}
		ingresoDatos.close();
	}
	
	public void reasignarPers() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("La secci�n del personal es: "+secci�nPers);
		System.out.println("�Desea cambiarla?");
		
		try {
			
			if (ingresoDatos.nextLine().toLowerCase()=="si"){
			System.out.println("Ingrese nueva secci�n del personal.");
			
			switch(ingresoDatos.nextLine().toLowerCase()) {
			case "biblioteca": secci�nPers = Secci�n.Biblioteca;
			case "regencia": secci�nPers = Secci�n.Regencia;
			case "secretaria": secci�nPers = Secci�n.Secretar�a;
			case "administraci�n": secci�nPers = Secci�n.Administraci�n;
			}
			
			}else if (ingresoDatos.nextLine().toLowerCase()=="no") {
				System.out.println("�Hasta luego!");
			}
			
		}catch(Exception e) {
			System.out.println("Error, ingrese si o no.");
		}
		// Completar, revisar que el texto ingresado no sea el departamento al cual ya pertenece
		ingresoDatos.close();
	}
	
	public String mostrar() {
		
		return "Secci�n a la que pertenece el personal registrado: "+secci�nPers;
	}

	public Secci�n getSecci�nPers() {
		return secci�nPers;
	}
	
	public void setSecci�nPers(Secci�n secci�nPers) {
		this.secci�nPers = secci�nPers;
	}
}
