package Sistema;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empleado extends Persona implements Información{

	private int añoIncorp;
	private int numLegajo;
	
	public Empleado() {
		super();
		añoIncorp=0;
		numLegajo=0;
		//super.mostrar();
		crearEmpleado();
	}
	
	public Empleado(int añoIncorp, int numLegajo) {
		super();
		//super.mostrar();
		this.añoIncorp=añoIncorp;
		this.numLegajo=numLegajo;
	}
	
	public void crearEmpleado() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		Pattern patron = Pattern.compile("[0-9]+");
		int númeroIngresado;
		
		System.out.println("Ingrese año de incorporación al instituto.");
		
		try {
			númeroIngresado = Integer.parseInt(ingresoDatos.nextLine());
			Matcher comprobar = patron.matcher(ingresoDatos.nextLine());
			boolean resultado = comprobar.matches();
		if (resultado==true) {
			añoIncorp= númeroIngresado;
			}
		}catch(Exception e){
			System.out.println("Error, ingrese un número.");
		}
		
		System.out.println("Ingrese número de legajo.");
		
		try {
			númeroIngresado = Integer.parseInt(ingresoDatos.nextLine());
			Matcher comprobar = patron.matcher(ingresoDatos.nextLine());
			boolean resultado = comprobar.matches();
		if (resultado==true) {
			numLegajo= númeroIngresado;
			}
		}catch(Exception e){
			System.out.println("Error, ingrese un número.");
		}
		
		ingresoDatos.close();
	}
	
	public String mostrar() {
		
		return "Año de Incorporación: "+añoIncorp+"\n Número legajo: "+numLegajo;
	}
	
	public void reasigLegajo() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		int númeroIngresado=0;
		
		System.out.println("El número de legajo registrado es: "+numLegajo);
		System.out.println("¿Desea cambiarlo? Ingrese si o no");
		
		try {
			
			if (ingresoDatos.nextLine().toLowerCase()=="si") {
				
				System.out.println("Ingrese nuevo número de legajo.");
				try {
					Pattern patron = Pattern.compile("[0-9]+");
					númeroIngresado = Integer.parseInt(ingresoDatos.nextLine());
					Matcher comprobar = patron.matcher(ingresoDatos.nextLine());
					boolean resultado = comprobar.matches();
				if (resultado==true) {
					numLegajo= númeroIngresado;
					}
				}catch(Exception e){
					System.out.println("Error, ingrese un número.");
				}
				
			}else if(ingresoDatos.nextLine().toLowerCase()=="no"){
				System.out.println("¡Hasta luego!");
			}
			
				}catch(Exception e) {
				System.out.println("Error, ingrese si o no.");
			}
		
		ingresoDatos.close();
		// Completar, buscar evitar números repetidos en los registros.
	}

	public int getAñoIncorp() {
		return añoIncorp;
	}

	public void setAñoIncorp(int añoIncorp) {
		this.añoIncorp = añoIncorp;
	}

	public int getNumLegajo() {
		return numLegajo;
	}

	public void setNumLegajo(int numLegajo) {
		this.numLegajo = numLegajo;
	}
}