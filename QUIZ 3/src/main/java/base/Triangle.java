package base;
/*
 * AUSTIN ABBRUZZESI QUIZ 3
 */



public class Triangle extends GeometricObject{
	private double side1 = 1.0;//Default side length
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/*
	 * returns the perimeter by adding the 3 sides
	 */
	
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	/* 
	 * returns the area from the 3 sides of the triangle
	 */
	
	public double getArea(){
		double sp = ((side1+side2+side3)/2);
		
		double area =  Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3));
		double rounded = Math.floor(1000 * area + 0.5) / 1000;
		return rounded;
	}
	
	
	
	public Triangle(){
		super();
		this.side1 = getSide1();
				
		this.side2 = getSide2();
		
		this.side3 = getSide3();
		
		
	}
	
	public Triangle(double side1,double side2, double side3, String color,boolean filled){
		super(color,filled);
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
		
		
	}
	/*
	 * generates a string describing the different attributes of the triangle
	 */
	@Override
	public String toString() {
		
		return ("The length of side 1 is: " + this.getSide1()+"\n"
				+"The length of side 2 is: " + this.getSide2() + "\n" 
				+ "The length of side 3 is: " + this.getSide3()+"\n"
				+ "The perimeter of the triangle is: " + this.getPerimeter() + "\n" 
				+"The area of the triangle is: " + this.getArea() + "\n" 
				+"The color of this triangle is: " + this.getColor() + "\n"
				+"This triangle was created on: " + this.getDateCreated()
				+ "This trangle is filled: " + this.isFilled());
				
		
	
		
	}
	
	
	
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}

}
