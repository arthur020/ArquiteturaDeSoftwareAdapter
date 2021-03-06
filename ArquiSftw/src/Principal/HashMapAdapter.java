package Principal;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class HashMapAdapter<K> extends HashMap<K, K> implements Map<K, K>, Cloneable, Serializable {
	
	private static final long serialVersionUID = -1705246308285838022L;

	public HashMapAdapter(K[][] matrix) throws IllegalArgumentException, NullPointerException {
		super();

		if (matrix == null) {
			throw new NullPointerException("Matriz nula");
		}

		if (matrix.length != 2) {
			throw new IllegalArgumentException("Matriz não tem duas linhas");
		}

		if (matrix[0].length != matrix[1].length) {
			throw new IllegalArgumentException("Linhas de comprimento diferente");
		}

		for (int column = 0; column < matrix[0].length; column++) {
			put(matrix[0][column], matrix[1][column]);
		}
	}

	
}
