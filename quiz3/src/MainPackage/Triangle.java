package MainPackage;

public abstract class Triangle extends GeometricObject {

	//private fields
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//no arg constructor
	public Triangle(){
		
	}
	
	//constructor method
	public Triangle(double side1, double side2, double side3){
		
	}
	
	//accessor methods
	
	public void setSide1(){
		this.side1 = side1;
	}
	public void setSide2(){
		this.side2 = side2;
	}
	public void setSide3(){
		this.side3 = side3;
	}
	
	//methods
	public double halfPerim = getPerimeter()/2;
	public double getPerim(){
		return (side1 + side2 + side3);
	}
	public double getArea(){
		return Math.sqrt(halfPerim*(halfPerim - side1)*(halfPerim - side2)*(halfPerim - side3));
	}
	
	public String toString(){
		return ("The length of side one is: " + side1 + ", side two is: " + side2 + ", and side three is:  " + side3);
	}
}
