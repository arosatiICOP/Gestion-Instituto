package Sistema;

import java.util.Scanner;

enum instDepartamento {Lenguajes, Cursos_Complementarios, Ciencias_Sociales, Informática}

public class Profesor extends Empleado implements Información{
	
	private instDepartamento departamento;
	
	public Profesor() {
		super();
		//super.mostrar();
		asignarDep();
	}
	
	public Profesor( instDepartamento departamento) {
		super();
		//super.mostrar();
		this.departamento=departamento;
	}
	
	public void asignarDep() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese departamento que desea asignarle al profesor.");
		System.out.println("Opciones: Lenguajes, Cursos complementarios, Ciencias Sociales, Informática");
		
		try {
		switch(ingresoDatos.nextLine().toLowerCase()) {
		case "lenguajes": departamento = instDepartamento.Lenguajes;
		case "cursos complementarios": departamento = instDepartamento.Cursos_Complementarios;
		case "ciencias sociales": departamento = instDepartamento.Ciencias_Sociales;
		case "informática": departamento = instDepartamento.Informática;
		}
		}catch(Exception e) {
			System.out.println("Ingrese un departamento correctamente.");
		}
		ingresoDatos.close();
	}
	
	public void cambiarDep() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("El departamento que pertenece el profesor es: "+departamento);
		System.out.println("¿Desea cambiarlo?");
		
		try {
			
			if (ingresoDatos.nextLine().toLowerCase()=="si"){
			System.out.println("Ingrese nuevo departamento del profesor.");
			
			switch (ingresoDatos.nextLine().toLowerCase()) {
			case "lenguajes": departamento = instDepartamento.Lenguajes;
			case "cursos complementarios": departamento = instDepartamento.Cursos_Complementarios;
			case "ciencias sociales": departamento = instDepartamento.Ciencias_Sociales;
			case "informática": departamento = instDepartamento.Informática; 
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
		return "El departamento al que pertenece el profesor es: "+departamento;
	}

	public instDepartamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(instDepartamento departamento) {
		this.departamento = departamento;
	}
}
