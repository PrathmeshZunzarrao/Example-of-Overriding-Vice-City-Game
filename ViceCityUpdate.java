package overriding;

public class ViceCityUpdate extends ViceCity {

	public void run()
	{
		System.out.println("Running !");
	}
	
	public void avoidAttack()
	{
		attack = true;
		
		if(attack)
		{
			health--;
		}
		else if(health <= 0)
		{
			health += 100;
		}
		
		System.out.println(health + " Health reamining !");
	}
}
