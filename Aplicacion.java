package epn;

import javax.swing.JOptionPane;

public class Aplicacion {


	public static void main(String[] args) {
		Lista lista=new Lista();
		int opcion, opciones;
		String salida="";
		JOptionPane.showMessageDialog(null,"Ingreso de Libros");
		
		do{
			Libro libro=new Libro();
			Object[] botones={"Insertar al inicio", "Insertar al final"};
			
			
			opciones=JOptionPane.showOptionDialog(null, "como desea ingresar","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.NO_OPTION,null,botones, botones[0]);
			
			/*
			lista.insertarAlInicio("El Anticristo");
			 libro.insertarAlInicio("Las venas abiertas de America Latina");
			 libro.insertarFinal("Una breve histotairia del cpital");
			 libro.insertarFinal("Manuela");
			 libro.insertarFinal("Mitos y Leyendas del Ecuador");
			 libro.insertarFinal("Breve Historia republicana del Ecuador");
			 libro.insertarFinal("El universo en una cascara de nuez");
			 libro.insertarFinal("Polvo de Estrella");
			
			*/
			
			switch(opciones){
			case 0:{
				lista.insertarAlInicio(libro);
				salida+=lista.toString();
				JOptionPane.showMessageDialog(null, lista);
				break;
			}
			
			case 1:{
				lista.insertarAlFinal(libro);
				salida+=lista.toString();
				JOptionPane.showMessageDialog(null, lista);
				
				break;
			}
			
			
			}
				
		 	
			opcion=JOptionPane.showConfirmDialog(null, "Seguir ingresando", "Continuar",JOptionPane.YES_NO_OPTION);
		}while(opcion==JOptionPane.YES_NO_OPTION);		
		
						
		System.out.println("La lista de libros esta compuesta de :  " +lista.toString());
		
		
	 	
	 	
	 	do{
//			Libro libro=new Libro();
			Object[] botones={"Buscar por indice", "Buscar por nombre", "eliminar"};
			opciones=JOptionPane.showOptionDialog(null, "Como desea buscar","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.NO_OPTION,null,botones, botones[0]);
		
		
			switch(opciones){
				case 0:{
					
					int busc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese NUMERO de libro a buscar"));
				 	lista.buscar(busc);
					
					
					break;
				}
		
				case 1:{
					Libro palabra=new Libro();
					
//					String palabra=JOptionPane.showInputDialog("Ingrese nombre de libro a buscar");
					lista.buscarPalabra(palabra);
					
			
					
					break;
				}
				case 2:{
					int elim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese NUMERO de libro a eliminar"));
//				 	lista.eliminar(elim);
					break;
				}
		
			}
			
//			System.out.println("****La lista de libros esta compuesta de :  " +lista.toString());
				opcion=JOptionPane.showConfirmDialog(null, "Seguir buscando", "Continuar",JOptionPane.YES_NO_OPTION);
			}while(opcion==JOptionPane.YES_NO_OPTION);		
			
		
	}
		

}



