package com.tdd.tddkata.kata.tddroverkata;

import java.util.Collections;
import java.util.List;

public class Grid{
	private static final int MAX_HIGHT = 10;
	private static final int MAX_WIDTH = 10;
	private List<Coordinate> obstacles = Collections.emptyList();
	
	Grid() {
		
	}
	
	Grid(List<Coordinate> obstacles) {
		this.obstacles = obstacles;
	}

	public Coordinate nextCoordinateFor(Coordinate coordinate, Direction direction) {
		int y = coordinate.y();
		int x = coordinate.x();
		if(direction == Direction.NORTH) {
			y=(y+1) % MAX_HIGHT;
		}
		if(direction == Direction.EAST) {
			x=(x+1) % MAX_WIDTH;
		}
		if(direction == Direction.WEST) {
			x=(x>0) ? x-1: MAX_WIDTH-1;
		}
		if(direction == Direction.SOUTH) {
			y=(y>0) ? y-1: MAX_HIGHT-1;
		}
		Coordinate newCoordinate = new Coordinate(x, y);
		return obstacles.contains(newCoordinate)? coordinate: newCoordinate;
		//return new Coordinate(x, y);
	}
}