package com.majorityof1.www.geometry.hierarchy.shape3d;

/**
 * 
 * @author yusei
 * 
 * Parallelepiped encompasses all six-sided, three-dimensional
 * shapes consisting of parallel sides/faces, including rectangular
 * prisms and cubes.
 * 
 * Data fields are deliberately declared using reference types to
 * enable the additional utility members associated with type
 * Double.
 * 
 */
public abstract class Parallelepiped {
	
	/**
	 * setLength() is a polymorphic mutator utility function.
	 * @param l the length of the object.
	 * @return reference to current object.
	 */
	public abstract Parallelepiped setLength(Double l);
	
	/**
	 * setHeight() is a polymorphic mutator utility function.
	 * @param h variable for assigning height.
	 * @return reference to current object.
	 * 
	 */
	public abstract Parallelepiped setHeight(Double h);
	
	/**
	 * setWidth() is a polymorphic mutator utility function.
	 * @param w variable for assigning width.
	 * @return reference to current object.
	 * 
	 */
	public abstract Parallelepiped setWidth(Double w);
	
	/**
	 * getLength() will be used to return the
	 * length attribute of sub-classed objects.
	 * @return length the height data member 
	 *  of current object. 
	 */
	public abstract Double getLength();
	
	/**
	 * getHeight() will be used to return the
	 * height attribute of sub-classed objects.
	 * @return height the height data member 
	 *  of current object. 
	 */
	public abstract Double getHeight();
	
	/**
	 * getWidth() will be used to return the
	 * width attribute of sub-classed objects.
	 * @return width the width data member 
	 *  of current object. 
	 */
	public abstract Double getWidth();


	protected Double length, height, width;
	
}
