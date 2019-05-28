package com.charlie.it;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MarsRoverTest {

	MarsRover mr = new MarsRover();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.out.println("START -- testing PROBLEM THREE: MARS ROVERS");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("END -- testing PROBLEM THREE: MARS ROVERS");
	}

	@Before
	public void setUp() throws Exception {
		mr.setMax(5, 5);
	}

	@After
	public void tearDown() throws Exception {
		mr = null;
	}

	@Test
	public void testMarsRover() {
		//MarsRover mr = new MarsRover();
		assertEquals(mr.x, 0);
		assertEquals(mr.y, 0);
		assertEquals(mr.dir, 'N');
		assertEquals(mr.xMax, 5);
		assertEquals(mr.yMax, 5);
	}


	@Test
	public void testSetPos() {
		mr.setPos(1, 2, 'N');
		assertEquals(mr.x, 1);
		assertEquals(mr.y, 2);
		assertEquals(mr.dir, 'N');
	}

	@Test
	public void testPrintPos() {
		//fail("Not yet implemented");
	}

	@Test
	public void testRunMoves() {
		mr.setPos(1, 2, 'N');
		mr.runMoves("LMLMLMLMM");
		assertEquals(mr.x, 1);
		assertEquals(mr.y, 3);
		assertEquals(mr.dir, 'N');
		
		mr.setPos(3, 3, 'E');
		mr.runMoves("MMRMMRMRRM");
		assertEquals(mr.x, 5);
		assertEquals(mr.y, 1);
		assertEquals(mr.dir, 'E');
	}


}
