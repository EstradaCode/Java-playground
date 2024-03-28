package tp2.ejercicio1;



public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
	// corresponden a ejercicio2
	public  int contarHojas(BinaryTree <T> tree) {
		int total = 0;
		if(!tree.isEmpty()) {
			total++;
			if(tree.hasLeftChild())
				total+= this.contarHojas(tree.leftChild);
			if(tree.hasRightChild())
				total+= this.contarHojas(tree.rightChild);
		}
		return total;
	}
		
		
    	 // ej 2
    public BinaryTree<T> espejo(BinaryTree <T> tree){
	   BinaryTree <T> aux = null;
    	if(!this.isEmpty()) {
    		aux = new BinaryTree<T>(tree.getData()); ;
		   if(tree.hasLeftChild() && tree.hasRightChild()) {
			   aux.addLeftChild(espejo(tree.rightChild));
			   aux.addRightChild( espejo(tree.leftChild));
		   }else if(tree.hasRightChild()) {
			   aux.addLeftChild(espejo(tree.rightChild));
		   }else if(tree.hasLeftChild()) {
			   aux.addRightChild(espejo(tree.leftChild));
		   }
    	}
    	return aux;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		
   }
		
}

