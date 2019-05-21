
public class AddTwoComplexNums {

	double real, img;
	
	AddTwoComplexNums(double r, double i){
		this.real = r;
		this.img = i;
	   }
		
	   public static AddTwoComplexNums sum(AddTwoComplexNums c1, AddTwoComplexNums c2)
	   {
		//temporary to hold the sum of two numbers
		   AddTwoComplexNums temp = new AddTwoComplexNums(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        return temp;
	    }
	   
	    public static void main(String args[]) {
	    	AddTwoComplexNums c1 = new AddTwoComplexNums(5.5, 4);
	    	AddTwoComplexNums c2 = new AddTwoComplexNums(1.2, 3.5);
	    	AddTwoComplexNums temp = sum(c1, c2);
	        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    }
	}


