package tp2.ejercicio1;

public class TestBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree <Integer> a = new BinaryTree<Integer>(6);
		a.addLeftChild(new BinaryTree<Integer>(4));
		a.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
		a.getLeftChild().addRightChild(new BinaryTree<Integer>(5));
		a.addRightChild(new BinaryTree<Integer>(11));
		a.getRightChild().addRightChild(new BinaryTree<Integer>(15));
		BinaryTree <Integer> a2 = a.espejo(a);
		System.out.println(a2.toString());
		System.out.println("nivel 1 : " + a2.getLeftChild().toString() + " -- " + a2.getRightChild().toString());
		System.out.println("nivel2: " + a2.getLeftChild().getLeftChild().toString() +"-- " + a2.getRightChild().getLeftChild().toString());
		System.out.println(a2.contarHojas(a2));
	}

}
