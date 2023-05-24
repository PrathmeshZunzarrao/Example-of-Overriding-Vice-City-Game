package overriding;

public class ViceCityDriver {

	public static void main(String[] args) {

		ViceCity v1 = new ViceCity();
		
		v1.getBike("R15");
		v1.run();
		v1.avoidAttack();
		
		System.out.println("==========================");
		
		
		ViceCity v2 = new ViceCityUpdate();
		
		v2.avoidAttack();
		v2.getBike("BMW");
		v2.run();
		v2.avoidAttack();
		v2.avoidAttack();
	}

}
