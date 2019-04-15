class Car
{
	String color;
	
	void setColor(Car c){
		c.color = "Blue";
		
	}
}
public class PassObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.color = "Red";
		System.out.println("Color before calling "+c1.color);
		c1.setColor(c1);
		System.out.println("Color After calling "+c1.color);
		
		

	}

}
