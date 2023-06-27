package Sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Instituto {

	private String nombre;
	private int altura;
	private String direcci�n;
	private HashMap<Integer, String> cursos;
	private ArrayList<Estudiante> estudiantes;
	
	
	public Instituto() {
		
		crearInstituto();
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();	
	}
	
	public Instituto(String nombre, int altura, String direcci�n) {
		
		this.nombre=nombre;
		this.altura=altura;
		this.direcci�n=direcci�n;
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();
	}

	public void crearInstituto() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();	
		
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

	/*public void crearCurso() {
	this.cursos.put(1, "Matematica");
	this.cursos.put(2, "Contabilidad");
	this.cursos.keySet().forEach(key -> {System.out.println(key+" "+this.cursos.get(1));});
	}*/
	
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
}
