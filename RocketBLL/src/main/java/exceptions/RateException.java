package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	public RateException() {
		super();
		// TODO Auto-generated constructor stub
	}



private RateDomainModel dummy;

public RateException(RateDomainModel dummy){
	super();
}
	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)



public RateDomainModel getDummy() {
	return dummy;
}

}
