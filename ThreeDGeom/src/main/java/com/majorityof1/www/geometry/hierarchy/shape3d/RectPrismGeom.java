package com.majorityof1.www.geometry.hierarchy.shape3d;

/**
 * 
 * @author yusei
 *
 * This interface will calculate the volume and surface area
 * for rectangular prisms.
 * 
 */
public interface RectPrismGeom {
	
	public Double getWidth();
	public Double getLength();
	public Double getHeight();
	
	/**
	 * getVolume() get's the volume of Rectangle object invoking the
	 * method call.
	 * 
	 * @return the volume - the outcome calculated by functions calls.
	 */
	default Double getVolume()
	{
		return getLength() * getWidth() * getHeight();
	}
	
	/**
	 * getSurfaceArea() get's the surface area of Rectangle object invoking
	 *  the method call.
	 * 
	 * @return the surface area - the outcome calculated by functions calls.
	 */
	default Double getSurfaceArea()
	{
		return 2 *(
							(getHeight()*getLength()) 
							+ (getHeight()*getWidth())
							+ (getWidth()*getLength())
							);
	}
	
	
}
