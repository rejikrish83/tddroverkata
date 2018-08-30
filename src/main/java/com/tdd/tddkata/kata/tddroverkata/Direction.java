package com.tdd.tddkata.kata.tddroverkata;

enum Direction {	
	NORTH("N","W","E"),
	EAST("E","N","S"),
	SOUTH("S","E","W"),
	WEST("W","S","N");
	private String value;
	private String left;
	private String right;

	private Direction(String value, String left, String right) {
		this.value= value;
		this.left = left;
		this.right =  right;
	}

	public Direction left() {
		return directionMatching(left);
	}

	public String value() {
		
		return value;
	}

	public Direction right() {
		return directionMatching(this.right);
		
	}

	private Direction directionMatching(String value) {
		for(Direction direction: values()) {
			if (direction.value == value) {
				return direction;
			}
		}
		return null;
	}
	
}