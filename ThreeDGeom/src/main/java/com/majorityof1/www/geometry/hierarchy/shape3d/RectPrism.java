package com.majorityof1.www.geometry.hierarchy.shape3d;

/**
 * 
 * @author yusei
 *
 * RectPrism for instantiating Rectangular Prism objects.
 */
public class RectPrism extends Parallelepiped implements RectPrismGeom {
	
	/**
	 * Default constructor.
	 * @param l the length of the rectagle to be set.
	 * @param w the width of the rectangle to be set.
	 * @param h the height of the rectangle to be set.
	 */
	public RectPrism(Double l, Double w, Double h)
	{
		setLength(l);
		setWidth(w);
		setHeight(h);
	}
	
	/**
	 * setLength() is a polymorphic mutator utility function.
	 * @param l the length attribute of the rectangle object.
	 * @return reference to current object.
	 */
	@Override
	public RectPrism setLength(Double l)
	{
		length=l;
		return this;
	}
	
	/**
	 * setHeight() is a polymorphic mutator utility function.
	 * @param h variable for assigning height.
	 * @return reference to current object.
	 * 
	 */
	@Override
	public RectPrism setHeight(Double h) 
	{
		height = h;
		return this;
	}
	
	/**
	 * setWidth() is a polymorphic mutator utility function.
	 * @param w variable for assigning width.
	 * @return reference to current object.
	 * 
	 */
	@Override
	public RectPrism setWidth(Double w) 
	{
		width = w;
		return this;
	}
	
	/**
	 * getLength() will be used to return the
	 * length attribute of sub-classed objects.
	 * @return length the height data member 
	 *  of current object. 
	 */
	@Override
	public Double getLength()
	{
		return length;
	}
	
	/**
	 * getHeight() will be used to return the
	 * height attribute of sub-classed objects.
	 * @return height the height data member 
	 *  of current object. 
	 */
	@Override
	public Double getHeight()
	{
		return height;
	}
	
	/**
	 * getWidth() will be used to return the
	 * width attribute of sub-classed objects.
	 * @return width the width data member 
	 *  of current object. 
	 */
	@Override
	public Double getWidth()
	{
		return width;
	}


}
