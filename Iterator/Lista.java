package Example;

public class Lista<E> implements ListaArticulos<E>{
	private E[] lista = (E[]) new Television[100];
	private int espacio =0;

	
	@Override
	public boolean add(E articulo) {
		lista[espacio] = articulo;
		espacio ++;
        return true;
	}

	@Override
	public Iterator<E> createIterator() {
		// TODO Auto-generated method stub
		return new IterarListas(this);
	}

	@Override
	public E get(int posicion) {
		return lista[posicion];
	}

	@Override
	public int size() {
		return espacio;
	}

}
