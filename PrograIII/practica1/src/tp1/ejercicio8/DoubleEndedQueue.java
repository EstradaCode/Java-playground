package tp1.ejercicio8;

public class DoubleEndedQueue <E> extends Queue {

	public DoubleEndedQueue() {
		// TODO Auto-generated constructor stub
		super();
	}
	public void enqueueFirst(E dato) {	
		super.l.addFirst(dato); // consultar
		
	}
}
