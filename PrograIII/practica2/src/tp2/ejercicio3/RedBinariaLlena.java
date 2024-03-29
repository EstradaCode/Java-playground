package tp2.ejercicio3;
import tp2.ejercicio1.*;
public class RedBinariaLlena {
	// UTILIZO UN RECORRIDO EN PROFUNDIDAD, YA QUE ME CONVIENE IR DESDE LAS HOJAS HASTA LA RAIZ,
	// LOS NIVELES NO SON IMPORTANTES, Y SERIA DIFICIL DIFERENCIAR QUE NODO ES HIJO DE QUIEN POR EL CAMINO ITERATIVO
	public int retardoReenvio(BinaryTree <Integer> tree) {
		int max1=0,max2=0;
		if(tree != null && !tree.isEmpty()) {
			if(tree.hasLeftChild())
				max1 += retardoReenvio(tree.getLeftChild());
			if(tree.hasRightChild())
				max2 += retardoReenvio(tree.getRightChild());
			max2+= tree.getData();
			max1+=tree.getData();
			if( max1>= max2) {
				return max1;
			}else {
				return max2;
			}
		}else {
			return 0;
		}
	}
}
