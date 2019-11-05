package p01_Inheritance;

public class MyCar {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		mycar.serialNumber="3456AG5432";
		mycar.doorNumber=4;
		
		
		GMC mygmc = new GMC();
	mygmc.color="Red";
	mygmc.doorNumber=4;
	mygmc.serialNumber="2V567N34";
	mygmc.gmc_gear=6;
	mygmc.gmc_type="Sport";
	

	Tahoe mythao = new Tahoe(); 
	mythao.color="Black";
	mythao.doorNumber=4;
	mythao.serialNumber="2V567N35";
	mythao.thao_gear=6;
	mythao.thao_type="Classic";
	
	System.out.println("===Model=======Color=======Door=======Serial============gear======type==");
	System.out.println("   GMC "+"       "+mygmc.color+"           "+mygmc.doorNumber+"        "+mygmc.serialNumber+"           "+mygmc.gmc_gear+"        "+mygmc.gmc_type);
	System.out.println("   THAO "+"      "+mythao.color+"         "+mythao.doorNumber+"        "+mythao.serialNumber+"           "+mythao.thao_gear+"        "+mythao.thao_type);
	
	
	}

}
