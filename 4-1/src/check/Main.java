package check;

import constants.Constants;

public class Main {
	
	private String firstName = "菊地";
	private String lastName = "浩太";

	public void printName() {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.printName();
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robot.introduce();
	}
}
