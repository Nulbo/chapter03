package chapter03;

public class Box<T> {
	private T object;
	
	
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
