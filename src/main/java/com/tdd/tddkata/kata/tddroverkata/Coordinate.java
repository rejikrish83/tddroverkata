package com.tdd.tddkata.kata.tddroverkata;

public class Coordinate {
	private final int x;	
	private final int y;
	
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	int x() {
		return x;
	}
	int y() {
		return y;
	}
	
	@Override
	public boolean equals(Object obj) {		
		return super.equals(obj);
	}
	@Override
	public int hashCode() {		
		return super.hashCode();
	}
}
