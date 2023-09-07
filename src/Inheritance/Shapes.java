package Inheritance;

public class Shapes extends Abstractclass {
	
	public void Circle()
	{
		System.out.println("You are circle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclass S = new Shapes();
		Shapes SI = new Shapes();
		SI.Circle();
		S.square();
	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
		System.out.println("You are square");
	}

}
