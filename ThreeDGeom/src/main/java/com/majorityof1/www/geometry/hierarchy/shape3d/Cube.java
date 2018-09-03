package com.majorityof1.www.geometry.hierarchy.shape3d;

/**
 * 
 * @author yusei
 *
 * Cube is a subclass of Rectangular Prism.
 * Many of the methods in the API are derived from
 * either the superclass.
 */
public class Cube extends RectPrism implements CubeGeom {

	/**
	 * Default constructor calls superclass for initialization.
	 * @param s the length of every side of the cube.
	 */
	public Cube(Double s)
	{
		super(s, s, s);
	}
	
	/**
	 * Retrieves the length of every side.
	 * @return the length returned by superclass' implementation.
	 */
	public Double getSide()
	{
		return super.getLength();
	}
	
	/**
	 * Assign the length of each side of the cube.
	 * @param s the value to be set; the length of the cube's side.
	 * @return a reference to the current object for method chaining.
	 */
	public Parallelepiped setSide(Double s)
	{
		super.setLength(s);
		return this;
	}
}
