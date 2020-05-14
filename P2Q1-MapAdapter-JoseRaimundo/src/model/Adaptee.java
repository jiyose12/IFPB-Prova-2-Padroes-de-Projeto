package model;

import java.util.HashMap;
import java.util.Map;

public class Adaptee {

	protected Map<Object,Object> map = new HashMap<Object,Object>();
	
	public void matrixToMap(Object[][] matrix) {
		
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				
				this.map.put(matrix[row], matrix[column]);
				System.out.println(matrix[row][column]);
			}
		}
	}
}
