package food;

public class Food {
	
	public String name;
	public int calories;
	public final int weight = 30;
	
	public Food (String name, int calories){
		this.calories = calories;
		this.name = name;		
	}
	
	public void printFood(){
				System.out.println("This " +name +" has "  +calories +" calories.");
		}
	
	public void printCalories(){
		System.out.println("This " +calories);
		
	}
	public static void tetsStaticMethod(){
		System.out.println("This is a static method");
	}

}
