public class House2{
	int a;
	static int b;
	int c,d;
	static String clr, model;
	final long price=5000000;
	final String place="Bankura";
	House2(){
	}
	House2(int a){
	this.a=a;
	}
	House2(String clr, String model){
	this.clr=clr;
	this.model=model;
	}
	public String cleaning( String clean){
	return clean;
	}
	public int hanger(int a){
	return a;
	}
	public static void main(String args[]){
	int Houseno=12;
	System.out.println("House no = "+ Houseno);
	String address="Bibarda";
	System.out.println("City = "+ address);
	House2 h1=new House2(10);
	System.out.println(h1.a);
	House2 h2=new House2("Yellow","ABCD");
	System.out.println("House color "+h2.clr+ " Model = "+h2.model);
	String clean1=h2.cleaning("Cleaning");
	System.out.println(clean1);
	int p=h2.hanger(20);
	System.out.println("Hanger = "+p);
	System.out.println("Other values are "+House2.b+","+h2.c+","+h2.d);
	}
	{
	
	b=200;
	
	}
}