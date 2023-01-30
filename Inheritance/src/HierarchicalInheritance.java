class Bank
{
	int rateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank //overriding
{
	int rateOfInterest()
	{
		return 15;
	}
}
class ICIC extends Bank  //overriding
{
	int rateOfInterest()
	{
		return 10;
	}
} 
class AXIS extends Bank  //overriding
{
	int rateOfInterest()
	{
		return 20;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sbi=new SBI();
		System.out.println(sbi.rateOfInterest());
		
		ICIC icic=new ICIC();
		System.out.println(icic.rateOfInterest());
		
		AXIS axis =new AXIS();
		System.out.println(axis.rateOfInterest());
	}

}
