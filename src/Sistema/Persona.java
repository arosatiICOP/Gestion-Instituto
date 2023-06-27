package Sistema;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum EstadoCivil {Soltero, Casado, Viudo, Divorciado}

public class Persona implements Informaci�n{

	private String nombre;
	private String apellido;
	private int numIdentificaci�n;
	private EstadoCivil estado;
	
	public Persona() {
		nombre=null;
		apellido=null;
		numIdentificaci�n=0;
		estado=null;
		crearPersona();
	}
	
	public Persona(String nombre, String apellido, int numIdentificaci�n, EstadoCivil estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numIdentificaci�n = numIdentificaci�n;
		estado = estadoCivil;
	}
	
	public void crearPersona() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		Pattern patron = Pattern.compile("[0-9]+");
		int n�meroIngresado=0;
		String valor;
		
		System.out.println("Ingrese nombre.");
		if(ingresoDatos.nextLine()!=null) {
			valor = ingresoDatos.nextLine();
			String textoLimpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
			textoLimpio = Normalizer.normalize(valor, Normalizer.Form.NFC);
			nombre=textoLimpio;
		}
		System.out.println("Ingrese apellido.");
		if(ingresoDatos.nextLine()!=null) {
			valor = ingresoDatos.nextLine();
			String textoLimpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
			textoLimpio = Normalizer.normalize(valor, Normalizer.Form.NFC);
			apellido=textoLimpio;
		}
		
		System.out.println("Ingrese n�mero de identificaci�n.");

			n�meroIngresado = Integer.parseInt(ingresoDatos.nextLine());
			Matcher comprobar = patron.matcher(ingresoDatos.nextLine());
			boolean resultado = comprobar.matches();
		if (resultado==true) {
			numIdentificaci�n= n�meroIngresado;
			}else {
			System.out.println("Error, ingrese un n�mero.");
			System.exit(0);
			}
		
		System.out.println("Ingrese estado civil. Opciones: Soltero, Casado, Divorciado, Viudo.");
			valor = ingresoDatos.nextLine();
		if(valor!=null) {
			String textoLimpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
			textoLimpio = Normalizer.normalize(valor, Normalizer.Form.NFC);
		
		switch (textoLimpio) {
			case "soltero": estado = EstadoCivil.Soltero;
			case "casado": estado = EstadoCivil.Casado;
			case "divorciado": estado = EstadoCivil.Divorciado;
			case "viudo": estado = EstadoCivil.Viudo;
			}
		}else {
			System.out.println("Error, ingrese texto.");
			System.exit(0);
		}
		ingresoDatos.close();
	}
	public String mostrar() {
		
		return "Nombre: "+nombre+"\n Apellido: "+apellido+"\n N�mero de Identificaci�n: "+
		numIdentificaci�n+"\n Estado civil: "+estado;
	}
	
	public void cambioEstadoC() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		String valor;
		String textoIngresado;
		
		System.out.println("El estado civil registrado es: "+estado);
		System.out.println("�Desea cambiarlo? Ingrese si o no");
		
		try {
			valor = ingresoDatos.nextLine().toLowerCase();
			textoIngresado = Normalizer.normalize(valor, Normalizer.Form.NFD);
			textoIngresado = Normalizer.normalize(valor, Normalizer.Form.NFC);
		if (textoIngresado=="si") {
			System.out.println("Ingrese estado civil. Opciones: Soltero, Casado, Divorciado, Viudo.");
			
			switch (textoIngresado) {
				case "soltero": estado = EstadoCivil.Soltero;
				case "casado": estado = EstadoCivil.Casado;
				case "divorciado": estado = EstadoCivil.Divorciado;
				case "viudo": estado = EstadoCivil.Viudo;
			}
		}
		if(textoIngresado=="no"){
			System.out.println("�Hasta luego!");
			System.exit(0);
			}
		}catch(Exception e){
			System.out.println("Error, ingrese si o no.");
			System.exit(0);
		}
		//Completar,  revisar que el texto ingresado no sea el estado civil actual
		ingresoDatos.close();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumIdentificaci�n() {
		return numIdentificaci�n;
	}

	public void setNumIdentificaci�n(int numIdentificaci�n) {
		this.numIdentificaci�n = numIdentificaci�n;
	}

	public EstadoCivil getEstado() {
		return estado;
	}

	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}
}
