package Example;

public class IterarListas<E> implements Iterator<E>{
	
	private ListaArticulos coleccion;
	private int posicion = 0;
	
	public IterarListas(ListaArticulos coleccion) {
		this.coleccion = coleccion;
	}
	
	
	@Override
	public E next() {
		E ele = (E) coleccion.get(posicion);
        posicion ++;
        return ele;	
	}

	@Override
	public boolean hasNext() {
		return posicion < coleccion.size(); 
	}

}
