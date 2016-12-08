package food;

import java.util.Random;

public class TestFood {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Food [] foodArray = new Food[5];
		
		foodArray[0] = new Food ("hamburger", r.nextInt(450));
		foodArray[1] = new Food ("cheesburger", 550);
		foodArray[2] = new Food ("pizza", 350);
		foodArray[3] = new Food ("coffee", 150);
		foodArray[4] = new Food ("hotdog", 550);
		
		for (int i= 0; i < foodArray.length; i++){
			foodArray[i].printFood();
			foodArray[i].printCalories();
		}
					
		//Food hamb = new Food("hamburger", r.nextInt(450));
		//Food cheesb = new Food ("cheesburger", 550);
		//hamb.printFood();
		//cheesb.printFood();
		
		Food.tetsStaticMethod();
		
	}

}
