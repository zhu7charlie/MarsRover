package com.charlie.it;

import java.util.InputMismatchException;


public class MarsRover {

	int x;
	int y;
	char dir;
	int xMax;
	int yMax;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getDir() {
		return dir;
	}

	public void setDir(char dir) {
		this.dir = dir;
	}

	public int getxMax() {
		return xMax;
	}

	public void setxMax(int xMax) {
		this.xMax = xMax;
	}

	public int getyMax() {
		return yMax;
	}

	public void setyMax(int yMax) {
		this.yMax = yMax;
	}
	
	public MarsRover() {
		x = 0;
		y = 0;
		dir = 'N';
		xMax = 10;
		yMax = 10;
	}
	
	public void setMax(int xMax, int yMax) {
		this.xMax = xMax;
		this.yMax = yMax;
	}	
	
	public void setPos(int x, int y, char dir) throws InputMismatchException  {
		this.x = x;
		this.y = y;
		validatePos();
		this.dir = dir;
		validateDir();
	}
	
	public void printPos() {
		System.out.println( x + " " + y  + " " + dir );
	}
	
	
	public void runMoves(String cli) throws InputMismatchException  {
		for (int i = 0; i < cli.length(); i++  ) {
			move(cli.charAt(i));
		}
	}
	
	private void move(char c) throws InputMismatchException  {
		switch (c) {
		case 'L':
			turnL();
			break;
		case 'R':
			turnR();
			break;
		case 'M':
			moveM();
			validatePos();
			break;
		default:
			//ignore other Commands
			//System.out.println( "invalid command " + c  + " --- ignore" );
			break;
		}
	}
	
	private void moveM() {
		switch(dir) {
			case 'N': 
				this.y++;
				break;
			case 'E':
				this.x++ ;
				break;
			case 'S': 
				this.y--;
				break;
			case 'W':
				this.x--  ;
				break;
			default:
				//ignore other moves
				break;
		}
	}
	
	private void turnL() {
		switch(dir) {
		case 'N': 
			dir = 'W';
			break;
		case 'E':
			dir = 'N';
			break;
		case 'S': 
			dir = 'E';
			break;
		case 'W':
			dir = 'S';
			break;
		default:
			//ignore other turns
			break;
		}
	}
	
	private void turnR() {
		switch(dir) {
		case 'N': 
			dir = 'E';
			break;
		case 'E':
			dir = 'S';
			break;
		case 'S': 
			dir = 'W';
			break;
		case 'W':
			dir = 'N';
			break;
		default:
			//ignore other turns
			break;
		}
	}
	
	
	/*
	 * pos(x,y) should be within (xMax, yMax)
	 */
	private void validatePos() throws InputMismatchException  {
		String errMsg = null;
		if( x < 0 || x > xMax ) {
			errMsg = "Invalid input for x pos " + x + ". x should be within (0," + xMax + ")";
		} else if( y < 0 || y > yMax ) {
			errMsg = "Invalid input for y pos " + y + ". y should be within (0," + yMax + ")";
		}
        if(errMsg != null ) throw new InputMismatchException (errMsg);
	}

	/*
	 * direction should be in (N, S, E, W)
	 */
	private void validateDir() throws InputMismatchException  {
		String errMsg = null;
		if( dir!='N' && dir!='S' && dir!='E' && dir!='W' ) {
			errMsg = "Invalid input for direction. dir should be within (N,S,E,W)";
		}
        if(errMsg != null )throw new InputMismatchException (errMsg);
	}
	
	

}
