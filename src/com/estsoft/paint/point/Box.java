package com.estsoft.paint.point;

import java.lang.reflect.Array;

public class Box<T> {
	private T object;
	private T[] a;  
	
	public Box(){
//		a = Array.newInstance(a.getClass(), 10);		
	}
	
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
