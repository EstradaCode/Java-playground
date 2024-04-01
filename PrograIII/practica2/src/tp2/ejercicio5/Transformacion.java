package tp2.ejercicio5;

import tp1.ejercicio8.Queue;
import tp2.ejercicio1.BinaryTree;

public class Transformacion {
		private BinaryTree<Integer> treeNode;
		public BinaryTree<Integer> suma( BinaryTree<Integer> tree){ // se enviará el mismo objeto por getter
			BinaryTree<Integer> ab = new BinaryTree<Integer>(); // vacio 
			int sum =0;
			if(tree != null && !tree.isEmpty()) {
				if(tree.hasLeftChild()) {
					suma(tree.getLeftChild()).getData();
				}else if(tree.isLeaf()) {
					ab.addLeftChild(new BinaryTree<Integer>(0));
				}
				if(tree.hasRightChild()) {
					ab.addRightChild(tree.getRightChild());
				}else if(tree.isLeaf()) {
					ab.addRightChild(new BinaryTree<Integer>(0));
				}
			} else {
				ab.setData(0);
				return ab;
			}
		}
}
