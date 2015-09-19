class Shape
{
	void draw(){
		System.out.println("Shape Draw..");
	}
}
class Circle extends Shape
{
	@Override
	void draw(){
		System.out.println("Circle Draw Call");
	}
}
class Square extends Shape
{
	@Override
	void draw(){
		System.out.println("Square Draw Call");
	}
	
	void allSideEquals(){
		System.out.println("This is for Square");
	}
}
class Drawing
{
	void drawShape(Shape shape){
		shape.draw();
		if(shape instanceof Square){
			int x = (int)90.39;
			Square s = (Square)shape; //Downcasting
			s.allSideEquals();
		}
	}
}
public class TestUpCasting {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		//Circle circle = new Circle();
		Square square = new Square();
		drawing.drawShape(square); //Upcasting
	}

}






