package com.charlie.it;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class mainMarsRover {
	
	static {
		//System.out.println("START -- PROBLEM THREE: MARS ROVERS");
		System.out.println("Output:");
	}

	static boolean forMaxs( String line ) {
		String[] elms = line.split(" ");
		int len = elms.length;
		if( len == 2 ) {
			if( elms[0].matches("\\d+") && elms[1].matches("\\d+") ) {
				//System.out.println("forMaxs");
				return true;
			}
		}
		return false;
	}
	
	static boolean forPos( String line ) {
		String[] elms = line.split(" ");
		int len = elms.length;
		if( len == 3 ) {
			if( elms[0].matches("\\d+") && elms[1].matches("\\d+") && Character.isLetter(elms[2].charAt(0))  ) {
				//System.out.println("forPos");
				return true;
			}
		}
		return false;
	}
	
	static boolean forMove( String line ) {
		String[] elms = line.split(" ");
		int len = elms.length;
		if( len == 1 ) {
			return true;
		}
		return false;
	}
	
	
	@SuppressWarnings({ "resource", "unused" })
	private static void showInputFile() throws IOException {
		new BufferedReader(new FileReader(new File("inputfile.txt"))).lines().forEach(System.out::println);
	}
	

	public static void main(String args[])  {
	
		
        MarsRover mr = new MarsRover();
        
		/* read inputfile.txt from the app root */
        try ( Scanner input = new Scanner(new File("inputfile.txt")) ) {
    		//showInputFile();
	        while( input.hasNextLine()) {
	        	String line = input.nextLine();
	        	String[] elms = line.split(" ");
	        	
	        	if( forMaxs(line) ) {
	        		mr.setMax( Integer.parseInt(elms[0]), Integer.parseInt(elms[1]) );
	        	} else if( forPos(line) ) {
	        		mr.setPos( Integer.parseInt(elms[0]), Integer.parseInt(elms[1]), elms[2].charAt(0) );
	        	} else if( forMove(line) ) {
	        		mr.runMoves( elms[0] );
	        		mr.printPos();
	        	}
	        }
        } catch (IOException e) {
			System.out.println("Got IOException. message=" + e.getMessage() );
        } catch (InputMismatchException e) {
			System.out.println("Got InputMismatchException message=" + e.getMessage() );
        } catch (Exception e) {
			System.out.println("Got Exception. message=" + e.getMessage() );
		} finally {
			mr = null;
			//System.out.println("END -- PROBLEM THREE: MARS ROVERS"); 
			System.out.println("=========="); 
		}
        
        
			
		
	}
	
	
	
	
}
