/**
 * 
 */
package com.tdd.tddkata.kata.tddroverkata;

/**
 * @author rejikrishnan.rr
 *
 */
public class Rover {
	Direction eDirection= Direction.NORTH;
	Coordinate coordinate = new Coordinate(0,0);
	Grid grid;
	public Rover(Grid grid) {
		super();
		this.grid = grid;
	}
	public String execute(String command) {
		for(char c: command.toCharArray()) {
			if(c == 'R') {				
				eDirection = eDirection.right();				
			}
			if(c == 'L') {				
				eDirection = eDirection.left();				
			}
			if(c == 'M') {
				coordinate = grid.nextCoordinateFor(coordinate, eDirection);
			}
		}		
		return coordinate.x()+":"+coordinate.y()+":"+eDirection.value();
	}
		

}
