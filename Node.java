package epn;

public class Node {
	Libro informacion;
	Node enlace;
	
	public Node(Libro libro) {
		super();
		
		informacion= libro;
		enlace=null;
	}

	public Node(Libro libro, Node enlace) {
		super();
		this.informacion = libro;
		this.enlace = enlace;
	}
	
	
	Libro obtenerLibro(){
		return informacion;
	}
	
	Node obtenerSiguienteLibro(){
		return enlace;
	}

	public Libro getInformacion() {
		return informacion;
	}

	public void setInformacion(Libro informacion) {
		this.informacion = informacion;
	}

	public Node getEnlace() {
		return enlace;
	}

	public void setEnlace(Node enlace) {
		this.enlace = enlace;
	}
	

	
}