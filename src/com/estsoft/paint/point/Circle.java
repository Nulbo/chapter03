package com.estsoft.paint.point;

public class Circle {
	private int x;
	private int y;
	private int redius;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + redius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (redius != other.redius)
			return false;
		return true;
	}

	
}
