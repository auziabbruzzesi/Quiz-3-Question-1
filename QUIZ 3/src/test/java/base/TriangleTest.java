package base;
import static org.junit.Assert.*;



import org.junit.Test;
public class TriangleTest {
	public Triangle noarg = new Triangle();
	public Triangle args = new Triangle(3.0,4.0,5.0,"green",true);
	public String[] noargdetails = noarg.toString().split("\n", 0);
	public String[] argsdetails = args.toString().split("\n",0);
	@Test
	public void noArgTest(){
		
/*
 * Accidentally wrote more tests than needed. required tests are outlined!
 */
//////////////////////////////////////////////////////////////////////		
//		
		assertEquals((noarg.getPerimeter()),3.0,0);
//		
//////////////////////////////////////////////////////////////////////		
	
//////////////////////////////////////////////////////////////////////
//
		assertEquals(noarg.getArea(),0.433,0);
//
//////////////////////////////////////////////////////////////////////
		assertEquals(noargdetails[0],"The length of side 1 is: 1.0");
		assertEquals(noargdetails[1],"The length of side 2 is: 1.0");
		assertEquals(noargdetails[2],"The length of side 3 is: 1.0");
		assertEquals(noargdetails[3],"The perimeter of the triangle is: 3.0");
		assertEquals(noarg.isFilled(),false);
		assertEquals(noarg.getColor(),"white");
		
		
		
		
		
	}
	
	@Test 
	public void args(){
//////////////////////////////////////////////////////////////////////
//		
		assertEquals(args.getPerimeter(),12.0,0);
//
//////////////////////////////////////////////////////////////////////
		
//////////////////////////////////////////////////////////////////////		
//		
		assertEquals(args.getArea(),6.0,0);
//
//////////////////////////////////////////////////////////////////////
		assertEquals(args.isFilled(),true);
		assertEquals(args.getColor(),"green");
		
		
	}

}
