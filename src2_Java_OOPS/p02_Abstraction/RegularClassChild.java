package p02_Abstraction;
// cretae one more class like this to see you have to implement abstract methods


public class RegularClassChild extends AbstractClassParent implements ClimateInterface  {

	@Override
	public void getRam() {
		System.out.println("getRam is implemented  Methods from parent in  child class");	
		
		
	}

	@Override
	public void getZel() {
		System.out.println("getZel is implemented  Methods from parent in  child class");	
		
	}

	public void getReady() {
		System.out.println("it is child class Methods");
	}

	@Override
	public void heat() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isQuality() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMultiply() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cold() {
		// TODO Auto-generated method stub
		
	}
	
	
}
