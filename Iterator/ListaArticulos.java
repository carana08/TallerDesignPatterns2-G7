package Example;

public interface ListaArticulos<E> extends IterableCollection<E> {

	public boolean add(E articulo);
	public Iterator<E> createIterator();
	public E get(int posicion);
	public int size();
}
