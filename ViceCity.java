package overriding;

public class ViceCity {
	
	int health = 100;
	boolean attack = false;
	
	
	public void getBike(String Bname)
	{
		System.out.println(Bname + " bike picked !");
	}
	
	public void run()
	{
		System.out.println("Walking");
	}
	
	public void avoidAttack()
	{
		health = 100;
		System.out.println(health);
	}

}
