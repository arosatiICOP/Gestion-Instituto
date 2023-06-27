package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante extends Persona implements Información{
	
	private ArrayList<String> cursosMatriculado;
	
	public Estudiante() {
		super();
		cursosMatriculado = new ArrayList<String>();
	}
	
	public Estudiante(String nombre, String apellido, int numeroIdentificación, EstadoCivil estadoCivil) {
		super();
		//super(nombre, apellido, numeroIdentificación, estadoCivil);
		cursosMatriculado = new ArrayList<String>();
	}
	
	public void añadirCursos() {
		Scanner ingresoDatos;
		
		ingresoDatos=new Scanner(System.in);
		System.out.println("Ingrese curso.");
		String textoIngresado = ingresoDatos.nextLine();
		
		cursosMatriculado.add(textoIngresado);
		
		ingresoDatos.close();
	}
	
	public void eliminarCurso() {
		
	}
	
	public String mostrar() {
		
		return "Cursos: "+cursosMatriculado;
	}

	public ArrayList<String> getCursosMatriculado() {
		return cursosMatriculado;
	}

	public void setCursosMatriculado(ArrayList<String> cursosMatriculado) {
		this.cursosMatriculado = cursosMatriculado;
	}
}
