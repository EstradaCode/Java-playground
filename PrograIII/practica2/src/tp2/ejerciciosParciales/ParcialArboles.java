package tp2.ejerciciosParciales;
import tp2.ejercicio1.*;
public class ParcialArboles {
	BinaryTree <Integer> root;

	public ParcialArboles(BinaryTree<Integer> root) {
		super();
		this.root = root;
	}
	/* CORRESPONDE AL EJERCICIO 7 DE LA PRACTICA 2
	 * 
	 */
	public boolean isLeftTree(int num) {
		BinaryTree<Integer> ab = getRootNode(root, num);
		if(ab == null) return false;
		int leafsL = compareLeafs(ab.getLeftChild());
		int leafsR = compareLeafs(ab.getRightChild());
		return leafsL > leafsR;
	}
	private BinaryTree <Integer> getRootNode( BinaryTree<Integer> ab, int num ) {
		BinaryTree <Integer> data = null;
		if(ab!=null && !ab.isEmpty()) {
			if(ab.getData() == num) {
				return ab;
			}else {	
				if(ab.hasLeftChild()) {
					data = getRootNode(ab.getLeftChild(),num);
					if(data != null) return data;
					
				}
				if(ab.hasRightChild()) {
					data = getRootNode(ab.getRightChild(),num);
					if(data != null) return data;
				}
			}
		} return data;
	}
	private int compareLeafs(BinaryTree<Integer> ab) {
		int sumLeafs=0;
		if(ab!= null && !ab.isEmpty()) {
			if(ab.hasLeftChild() ^ ab.hasRightChild()){
				sumLeafs++;
			}
			if(ab.hasLeftChild()) {
				sumLeafs += compareLeafs(ab.getLeftChild());
			}
			if(ab.hasRightChild()) {
				sumLeafs+= compareLeafs(ab.getRightChild());
			}
		}
		return sumLeafs;
	}
	/* FIN DEL EJERCICIO 7 PRACTICA 2 
	 * 
	 */
}
