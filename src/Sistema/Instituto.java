package Sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Instituto {

	private String nombre;
	private int altura;
	private String dirección;
	private HashMap<Integer, String> cursos;
	private ArrayList<Estudiante> estudiantes;
	
	
	public Instituto() {
		
		crearInstituto();
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();	
	}
	
	public Instituto(String nombre, int altura, String dirección) {
		
		this.nombre=nombre;
		this.altura=altura;
		this.dirección=dirección;
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();
	}

	public void crearInstituto() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		cursos = new HashMap<Integer, String>();
		estudiantes = new ArrayList<Estudiante>();	
		
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
}
