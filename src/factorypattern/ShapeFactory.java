package factorypattern;

public class ShapeFactory {

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

}
