package model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Adapter extends Adaptee implements Map<Object,Object>{

	public Adapter(Object[][] matrix) {
		matrixToMap(matrix);
	}
	
	public String getMap() {
		String result = "";
		for(Object sigla : map.keySet()) {
			
			result = (String) sigla.toString();
//			result = String.valueOf(entry.getKey()) +" "+ entry.getValue();
		}
		System.out.println(result);
		return result;
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

}
