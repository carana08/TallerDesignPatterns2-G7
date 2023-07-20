package Example;

public class Prueba {
	public static void main(String[] args) {
		
		ListaArticulos<Television> televisiones = new Lista<>();
		televisiones.add(new Television("Samsung", 1000));
		televisiones.add(new Television("LG", 800));
		televisiones.add(new Television("Sony",900));
		
		Iterator iterador = televisiones.createIterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
}
