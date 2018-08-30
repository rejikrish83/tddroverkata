package com.tdd.tddkata.kata.tddroverkata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class RoverTest {
	Rover rover;
	@Before
	public void beforeTest() {
		Grid grid=new Grid();
		rover =new Rover(grid);
	}
	 

	@Test
	@Parameters({
		"R, 0:0:E",
		"RR, 0:0:S",
		"RRR, 0:0:W",
		"RRRR, 0:0:N"
	})
	public void rotate_right(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	@Test
	@Parameters({
		"L, 0:0:W",
		"LL, 0:0:S",
		"LLL, 0:0:E",
		"LLLL, 0:0:N"
		
	})
	public void rotate_left(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	
	@Test
	@Parameters({
		"M, 0:1:N",
		"MMM, 0:3:N"		
		
	})
	public void moveUp(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	
	@Test
	@Parameters({
		"MMMMMMMMMM, 0:0:N",
		"MMMMMMMMMMMMMMM, 0:5:N"
		
	})
	public void wrap_from_top_to_bottom_when_moving_north	(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	
	@Test
	@Parameters({
		"RM, 1:0:E",
		"RMMMMM, 5:0:E"
		
	})
	public void move_right(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	
	@Test
	@Parameters({
		"RMMMMMMMMMM, 0:0:E",
		"RMMMMMMMMMMMMMMM, 5:0:E"
		
	})
	public void wrap_from_right_to_left_when_moving_easts(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	
	@Test
	@Parameters({
		"LM, 9:0:W",
		"LMMMMM, 5:0:W"
	})
	public void move_left(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	
	@Test
	@Parameters({
		"LLM, 0:9:S",
		"LLMMMMM, 0:5:S"
	})
	public void move_south(String command, String position) {
		
		assertEquals(rover.execute(command), position);
	}
	
	/*@Test
	@Parameters({
		"MMM, 0:3:N",
		"RMMMMMM, 1:0:E"
	})
	public void stop_at_obstacles(String command, String position) {
		Coordinate obstacle_0X4 =new Coordinate(0, 4);
		Coordinate obstacle_2X0 =new Coordinate(2, 0);
		Grid grid = new Grid(Arrays.asList(obstacle_0X4,obstacle_2X0));
		Rover rover = new Rover(grid);
		assertEquals(rover.execute(command), position);
	}*/
}
