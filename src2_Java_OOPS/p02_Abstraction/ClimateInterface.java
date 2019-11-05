package p02_Abstraction;

public interface ClimateInterface {
	
	/*
	All the methods of an interface are public abstract by default. You cannot have concrete (regular methods with body) methods in an interface.
	*/
	
	public abstract void heat();
	       abstract void cold();
	public abstract void start();
	public abstract void stop();
	public abstract boolean isQuality();
	public abstract int getMultiply();
	public abstract String getText();

}
