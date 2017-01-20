package epn;

public class Lista {
	private Node inicio;
	private Node p;

	public Lista() {
		super();
		inicio= null;
	}
	
	public boolean estaVacia(){
		return inicio == null;
	}
	
	public synchronized void insertarAlInicio(Libro libro){
		if(estaVacia()) 
			inicio=p=new Node(libro);
		else
			inicio=new Node(libro, inicio);
	}
	
	public  boolean estaVacía(){
		return inicio==null;
	}	
	
	public void insertarAlFinal(Libro libro) {
		if (estaVacía())
			inicio = p = new Node(libro);
		else
			p = p.enlace = new Node(libro);
	}
	
	
	
	
	public void buscar(int posicion){	 
	     Node aux= inicio;
	     int cont=1;
	     if(posicion<1 || posicion>=9){
	         System.out.println("Posicion NO encontrada");
	     }
	     
	     else{
	         while(aux!=null){
	             if (posicion ==  cont){
	                 System.out.println("el elemento es : "+aux.getInformacion()  +": en la posicion "+ posicion);
	                 aux=null;
	                 
	                 }
	                 
	             else{                 
	                 aux=aux.getEnlace();
	                 cont++;
	             }
	         }
	     }
	 }
	
	

	public void eliminar (int posicion){
		 Node aux= inicio;
	     int cont=1;
	     if(posicion<1 || posicion>=9){
	         System.out.println("Posicion NO encontrada");
	     }
	     
	     else{
	         while(aux!=null){
	             if (posicion ==  cont){
	                 System.out.println("el elemento es : "+aux.getInformacion()  +": en la posicion "+ posicion);
	                 aux.informacion.r;
	                 aux.enlace=null;
	                 aux=null;
	                 
	                 }
	                 
	             else{                 
	                 aux=aux.getEnlace();
	                 cont++;
	             }
	         }
	     }
	}
	
	
	
	
	
	
	public int indexOf(Libro palabra) {
	     Node aux= inicio;
	     int cont=1;
	     if(!palabra.equals(aux)){
	         System.out.println("Posicion NO encontrada");
	     }
		return 0;
	}
	

	
	/*
	
	public Nodo buscarLista(Elemento destino)
	{
		 Nodo indice;
		 for (indice = primero; indice!= null; indice = indice.enlace)
			 if (destino == indice.dato)	 // (destino.equals(indice.dato))
				 return indice;			
		 return null;
	}*/
	
	
	
	
	
	public void crearEnOrden(Libro libro){
		
		Node nuevo= new Node(libro);
		 if(estaVacia()){
			 inicio= nuevo;
		 }
		 else if( nuevo.getInformacion().getNombreLibro().compareTo(inicio.getInformacion().getNombreLibro())<0){
			 nuevo.enlace= inicio;
			 inicio= nuevo;
		 }
		 else{
			 Node p= inicio.enlace; 
			 Node q= inicio; 
			 while(p!=null){
				 if(nuevo.getInformacion().getNombreLibro().compareTo(p.getInformacion().getNombreLibro())<0)
					 break;
				 q=p;
				 p=p.enlace;	 
			 }
			 nuevo.enlace= q.enlace;
			 q.enlace= nuevo;
	 
		 }

		
	}
	
	
	@Override
	public synchronized String toString()
	{
		String salida = "";
		if (estaVacia())
		{
			salida= "Lista vacia";
			
			return salida;
		}
		else
		{
			salida="\n la lista de libros es:";
			
			Node p=inicio;
		while(p!=null)
			{
			salida+=p.informacion.toString();
			p=p.enlace;
		
			}
		return salida;
		}
	}

	
	
	
	
	
}