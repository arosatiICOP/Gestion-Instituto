package Sistema;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empleado extends Persona implements Informaci�n{

	private int a�oIncorp;
	private int numLegajo;
	
	public Empleado() {
		super();
		a�oIncorp=0;
		numLegajo=0;
		//super.mostrar();
		crearEmpleado();
	}
	
	public Empleado(int a�oIncorp, int numLegajo) {
		super();
		//super.mostrar();
		this.a�oIncorp=a�oIncorp;
		this.numLegajo=numLegajo;
	}
	
	public void crearEmpleado() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		Pattern patron = Pattern.compile("[0-9]+");
		int n�meroIngresado;
		
		System.out.println("Ingrese a�o de incorporaci�n al instituto.");
		
		try {
			n�meroIngresado = Integer.parseInt(ingresoDatos.nextLine());
			Matcher comprobar = patron.matcher(ingresoDatos.nextLine());
			boolean resultado = comprobar.matches();
		if (resultado==true) {
			a�oIncorp= n�meroIngresado;
			}
		}catch(Exception e){
			System.out.println("Error, ingrese un n�mero.");
		}
		
		System.out.println("Ingrese n�mero de legajo.");
		
		try {
			n�meroIngresado = Integer.parseInt(ingresoDatos.nextLine());
			Matcher comprobar = patron.matcher(ingresoDatos.nextLine());
			boolean resultado = comprobar.matches();
		if (resultado==true) {
			numLegajo= n�meroIngresado;
			}
		}catch(Exception e){
			System.out.println("Error, ingrese un n�mero.");
		}
		
		ingresoDatos.close();
	}
	
	public String mostrar() {
		
		return "A�o de Incorporaci�n: "+a�oIncorp+"\n N�mero legajo: "+numLegajo;
	}
	
	public void reasigLegajo() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		int n�meroIngresado=0;
		
		System.out.println("El n�mero de legajo registrado es: "+numLegajo);
		System.out.println("�Desea cambiarlo? Ingrese si o no");
		
		try {
			
			if (ingresoDatos.nextLine().toLowerCase()=="si") {
				
				System.out.println("Ingrese nuevo n�mero de legajo.");
				try {
					Pattern patron = Pattern.compile("[0-9]+");
					n�meroIngresado = Integer.parseInt(ingresoDatos.nextLine());
					Matcher comprobar = patron.matcher(ingresoDatos.nextLine());
					boolean resultado = comprobar.matches();
				if (resultado==true) {
					numLegajo= n�meroIngresado;
					}
				}catch(Exception e){
					System.out.println("Error, ingrese un n�mero.");
				}
				
			}else if(ingresoDatos.nextLine().toLowerCase()=="no"){
				System.out.println("�Hasta luego!");
			}
			
				}catch(Exception e) {
				System.out.println("Error, ingrese si o no.");
			}
		
		ingresoDatos.close();
		// Completar, buscar evitar n�meros repetidos en los registros.
	}

	public int getA�oIncorp() {
		return a�oIncorp;
	}

	public void setA�oIncorp(int a�oIncorp) {
		this.a�oIncorp = a�oIncorp;
	}

	public int getNumLegajo() {
		return numLegajo;
	}

	public void setNumLegajo(int numLegajo) {
		this.numLegajo = numLegajo;
	}
}