package p04_Encapsulation;


class EncapsTest{
	
	
  	public static void main(String[] args) {
		
		
		EncapsDemo enc = new EncapsDemo();
		
		enc.id=5;
		enc.name="Ramazan";
		enc.setAge(54);
		
		System.out.println(enc.id+"  "+enc.name+"  "+enc.getAge());
	}
   
}

