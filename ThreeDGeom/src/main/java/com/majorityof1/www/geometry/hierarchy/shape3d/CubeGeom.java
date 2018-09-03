package com.majorityof1.www.geometry.hierarchy.shape3d;
/**
 * 
 * @author yusei
 *
 * The following subinterface carries the methods of the RectPrismGeom
 * interface (its parent).
 */
public interface CubeGeom extends RectPrismGeom {
	
	/**
	 *  This method uses the method from its parent interface, RectPrismGeom.
	 *  (<b>Hint:</b> <u>It requires that we create a temporary object of type 
	 *  RectPrism in the body.</u>) 
	 */
	@Override
	default Double getVolume()
	{
		RectPrism rTemp = new RectPrism(this.getLength(), this.getWidth(), this.getHeight());
		return rTemp.getVolume();
	}
	
	
}
