package Sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Instituto {

	private String nombre;
	private int altura;
	private String dirección;
	private HashMap<Integer, String> cursos;
	private ArrayList<Profesor> profesores;
	private ArrayList<Estudiante> estudiantes;
	private ArrayList<PersonalServicio> personalS;
	
	public Instituto() {
		crearInstituto();
	}
	
	public Instituto(String nombre, int altura, String dirección) {
		
		this.nombre=nombre;
		this.altura=altura;
		this.dirección=dirección;
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();
		setProfesores(new ArrayList<Profesor>());
		setPersonalS(new ArrayList<PersonalServicio>());
	}

	public void crearInstituto() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();
		setProfesores(new ArrayList<Profesor>());
		setPersonalS(new ArrayList<PersonalServicio>());
		
		System.out.println("Ingrese nombre del Instituto: ");
		nombre = ingresoDatos.nextLine();
		
		System.out.println("Ingrese dirección: ");
		dirección = ingresoDatos.nextLine();
		
		System.out.println("Ingrese altura: ");
		altura = ingresoDatos.nextInt();
		
		ingresoDatos.close();
	}
	
	public void mostrarDatos() {
		System.out.print("\nDatos Instituto");
		System.out.print("Nombre: "+nombre);
		System.out.print("Dirección: "+dirección);
		System.out.println("Altura: "+ altura);
	}
	
	public void añadirCurso() {
		
	}
		
	public void añadirEstudiante() {
			
	}
		
	public void añadirProfesor() {
		
	}
	
	public void añadirPersonalS() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public HashMap<Integer, String> getCursos() {
		return cursos;
	}

	public void setCursos(HashMap<Integer, String> cursos) {
		this.cursos = cursos;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public ArrayList<PersonalServicio> getPersonalS() {
		return personalS;
	}

	public void setPersonalS(ArrayList<PersonalServicio> personalS) {
		this.personalS = personalS;
	}
}
