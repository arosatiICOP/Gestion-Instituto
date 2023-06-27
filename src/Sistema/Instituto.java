package Sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Instituto {

	private String nombre;
	private int altura;
	private String direcci�n;
	private HashMap<Integer, String> cursos;
	private ArrayList<Profesor> profesores;
	private ArrayList<Estudiante> estudiantes;
	private ArrayList<PersonalServicio> personalS;
	
	public Instituto() {
		crearInstituto();
	}
	
	public Instituto(String nombre, int altura, String direcci�n) {
		
		this.nombre=nombre;
		this.altura=altura;
		this.direcci�n=direcci�n;
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
		
		System.out.println("Ingrese direcci�n: ");
		direcci�n = ingresoDatos.nextLine();
		
		System.out.println("Ingrese altura: ");
		altura = ingresoDatos.nextInt();
		
		ingresoDatos.close();
	}
	
	public void mostrarDatos() {
		System.out.print("\nDatos Instituto");
		System.out.print("Nombre: "+nombre);
		System.out.print("Direcci�n: "+direcci�n);
		System.out.println("Altura: "+ altura);
	}
	
	public void a�adirCurso() {
		
	}
		
	public void a�adirEstudiante() {
			
	}
		
	public void a�adirProfesor() {
		
	}
	
	public void a�adirPersonalS() {
		
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

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
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
