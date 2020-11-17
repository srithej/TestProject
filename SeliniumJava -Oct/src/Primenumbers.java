
public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname ref=new classname();
		Primenumbers obj=new Primenumbers();
		//ref variable.methaodname();
		obj.m2();
	}
public void m2() {
	int num=873;
	int temp;
	boolean flag=true;
	int i;
	for(i=2;i<=num/2;i++)
	{
		temp=num%i;
		if(temp==0)
		{
			flag=false;
			break;
			
		}
	}
	if(flag==true) {
		System.out.println("prime num"+num);
		
	}
	else {
		System.out.println("not prime num"+num);
	}
	
			
}
}

