package abstractfactory;

public class ColorFactory extends AbstractFactory {

	public Color getColor(String color) {

		Color colorObj = null;

		switch (color) {

		case "RED": {
			colorObj = new Red();

			break;
		}

		case "GREEN": {
			colorObj = new Green();
			break;
		}

		case "YELLOW": {
			colorObj = new Yellow();
			break;
		}

		}

		return colorObj;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
