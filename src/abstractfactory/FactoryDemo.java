package abstractfactory;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory abstractFactory = factoryProducer.getFactory("Shape");
		Shape shape =  abstractFactory.getShape("Square");
		
		AbstractFactory abstractFactory2 = factoryProducer.getFactory("Color");
		Color color =  abstractFactory2.getColor("GREEN");
		
		shape.draw();
		color.draw();
	}

}
