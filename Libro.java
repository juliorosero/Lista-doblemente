package epn;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Libro {
	private String nombreLibro;
	
	
	public Libro() {
		super();
		this.setLibro();
	}
	
	 Libro(String nombreLibro) {
		super();
		this.nombreLibro = nombreLibro;
	}


	 int i=0;

	public void setLibro(){
		nombreLibro= JOptionPane.showInputDialog("Ingrese nombre del Libro");
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	
	@Override
	public String toString() {
		i++;
		return "\n [Nombre del Libro=   " + nombreLibro + "]";
		
		
	}
	
	
	
	
	
	
	
/*
	public Libro(int codlibro, String nombreLibro, int precioUnitario,
			int añoEdicion) {
		super();
		this.codlibro = codlibro;
		this.nombreLibro = nombreLibro;
		this.precioUnitario = precioUnitario;
		this.añoEdicion = añoEdicion;
	}
*/
	
	
	
	
	/*
	public void setLibro(){
		String linea= JOptionPane.showInputDialog("ingrese informacion codigo, nombre, precio unitario y año de edicion del libro separado por coma");
		StringTokenizer tokens = new StringTokenizer(linea, ",");
		this.codlibro=Integer.parseInt(tokens.nextToken());
		this.nombreLibro=tokens.nextToken();
		this.precioUnitario=Integer.parseInt(tokens.nextToken());
		this.añoEdicion=Integer.parseInt(tokens.nextToken());	
	}

	

	public int getCodlibro() {
		return codlibro;
	}

	public void setCodlibro(int codlibro) {
		this.codlibro = codlibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getAñoEdicion() {
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		this.añoEdicion = añoEdicion;
	}

	
	
	@Override
	public String toString() {
		return "\nLibro [codlibro=" + codlibro + ", nombreLibro=" + nombreLibro
				+ ", precioUnitario=" + precioUnitario + ", añoEdicion="
				+ añoEdicion + "]";
	}
	*/
	
	
	
	

}