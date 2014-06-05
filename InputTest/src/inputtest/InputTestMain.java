package inputtest;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputTestMain
{
	public static final String	NEW_LINE	= System.getProperty( "line.separator" );

	public InputTestMain( )
	{
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		System.out.println( "This program exercises input methods in Java." );

		Scanner input = new Scanner( System.in );

		try
		{
			System.out.print( "Enter a string: >> " );
			String userInput = input.nextLine( );

			System.out.println( "Got: " + userInput );

			System.out.print( "Enter an integer: >> " );
			int userInt = input.nextInt( );

			System.out.println( "Got: " + userInt );
		}
		catch( InputMismatchException e )
		{
			System.out
					.println( "InputMismatchException: Either the token is not an Integer, or is out of range." );
		}
		catch( NoSuchElementException e )
		{
			System.out.println( "NoSuchElement: No more tokens are availiable" );
		}
		catch( IllegalStateException e )
		{
			System.out
					.println( "IllegalStateException: The scanner was closed." );
		}
		catch( Exception e )
		{
			System.out.println( "Caught an unexpected exception." );
			e.printStackTrace( );
		}
		finally
		{
			// Make sure all resources are closed.
			if ( input != null )
			{
				input.close( );
			}
		}
	}
}
