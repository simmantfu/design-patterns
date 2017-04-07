package abstractfactory;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String shapeRequest) {

		Shape shape = null;

		switch (shapeRequest) {

		case "Rectangle": {
			shape = new Rectangle();
			break;
		}
		case "Circle": {
			shape = new Circle();
			break;
		}
		case "Square":
			shape = new Square();
			break;
		}

		return shape;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
