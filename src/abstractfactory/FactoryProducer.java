package abstractfactory;

public class FactoryProducer {

	public AbstractFactory getFactory(String factoryName) {
		AbstractFactory factoryObj = null;

		switch (factoryName) {

		case "Color": {
			factoryObj = new ColorFactory();
			break;
		}

		case "Shape": {
			factoryObj = new ShapeFactory();
			break;
		}

		}

		return factoryObj;
	}

}
