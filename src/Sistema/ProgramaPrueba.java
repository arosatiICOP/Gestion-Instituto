package Sistema;

public class ProgramaPrueba {

	public static void main(String[] args) {

		Instituto inst1; Instituto inst2;
		
		Persona p1;		Persona p2;
		
		Estudiante est1;	Estudiante est2;
		
		Empleado e1;	Empleado e2;
		Profesor profe1;	Profesor profe2;
		PersonalServicio ps1;	PersonalServicio ps2;
		
		inst1 = new Instituto();	inst1.mostrarDatos();
		inst2 = new Instituto("ICOP",1408,"San Mart�n");	inst2.mostrarDatos();
		
		p1 = new Persona();		p1.mostrar();		p1.cambioEstadoC();
		p2 = new Persona("Agust�n","Rosati",123,EstadoCivil.Soltero);	
		p2.mostrar();		p2.cambioEstadoC();
		
		est1 = new Estudiante();	est1.mostrar();	est1.a�adirCursos();
		est2 = new Estudiante("Jos�","Hernandez",456,EstadoCivil.Casado);
		est2.mostrar();		est2.a�adirCursos();
		
		e1 = new Empleado();	e1.mostrar();	e1.reasigLegajo();
		e2 = new Empleado(2000,123);
		e2.mostrar();	e2.reasigLegajo();
		
		profe1 = new Profesor();	profe1.mostrar();	profe1.cambiarDep();
		profe2 = new Profesor(instDepartamento.Inform�tica);
		profe2.mostrar();	profe2.cambiarDep();
		
		ps1 = new PersonalServicio();	ps1.mostrar();	ps1.reasignarPers();
		ps2 = new PersonalServicio(Secci�n.Biblioteca);
		ps2.mostrar();	ps2.reasignarPers();
	}

}
