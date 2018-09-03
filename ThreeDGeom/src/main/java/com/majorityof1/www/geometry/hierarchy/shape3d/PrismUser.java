package com.majorityof1.www.geometry.hierarchy.shape3d;

/**
 * 
 * @author yusei
 * PrismUser is our main class for testing out prisms.
 * Note: print() has been deprecated, please use 
 * printBetter() instead.
 * 
 */
public class PrismUser {

	/**
	 * Our entryway into the program.
	 * @param args a string array of command-line arguments.
	 */
	public static void main(String[] args) 
	{	
		Cube  cb1 = new Cube(5.0);
		RectPrism rp1 = new RectPrism(3.0,5.0,7.0);
		print(cb1);
		print(rp1);
		
		cb1.setSide(15.0);
		rp1.setLength(7.0)
			 .setHeight(8.0)
			 .setWidth(12.0);
		
		printBetter(cb1);
		printBetter(rp1);
		
	}
	
	/**
	 * printBetter() performs better type checking so as to sort out
	 * polymorphic objects. A cube will explicitly be understood as 
	 * a cube and not necessarily a rectangle which it is derived from.
	 * @param rp our rectangular prism object or possibly a cube.
	 */
	public static void printBetter(RectPrism rp) 
	{
		if((rp instanceof RectPrism)&& !(rp instanceof Cube))
		{
			rectDetails(rp); // call rectangular prism member functions
		}
		else if(rp instanceof Cube) 
		{
			cubeDetails( (Cube)rp /* casting rect prism into a cube*/); // call cube member functions. 
		}
	}
	
	/**
	 *  This method takes care of  "object-specific" printing.
	 * @param rp a rectangular prism object whose attributes will be printed.
	 */
	@Deprecated
	public static void print(RectPrism rp) 
	{
		if(rp instanceof RectPrism)
		{
			rectDetails(rp); // call rectangular prism member functions.
		}
		else if(rp instanceof Cube) 
		{
			cubeDetails( (Cube)rp /* casting rect prism into a cube*/); // call cube member functions. 
		}
	}
	/**
	 * rectDetails will print methods particular to the RectPrism class object.
	 * @param rp a rectangular prism object passed as an argument.
	 */
	public static void rectDetails(RectPrism rp)
	{
		System.out.println("Rectangular prism details:\n");
		System.out.println(rp.getHeight());
		System.out.println(rp.getLength());
		System.out.println(rp.getWidth());
		System.out.println(rp.getSurfaceArea());
		System.out.println(rp.getVolume());
	}
	
	/**
	 * cubeDetails prints details specific to a Cube objedt only.
	 * @param cp the cube object to be operated upon.
	 */
	public static void cubeDetails(Cube cp)
	{
		System.out.println("Cube details:\n");
		System.out.println(cp.getSide());
		System.out.println(cp.getSurfaceArea());
		System.out.println(cp.getVolume());
	}
}

