package view;

import java.util.Map;

import model.Adapter;

public class demo {
	
public static void main(String[] args) {
		
		Object[][] matrix =  {{ "Eu sou a chave"},{"Sou o valor"}};
		
		Map<Object,Object> adapter = new Adapter(matrix);
		
		System.out.println(((Adapter) adapter).getMap());
	}

}
