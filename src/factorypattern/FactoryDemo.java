package factorypattern;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape shape = new ShapeFactory().getShape("Circle");
		shape.draw();
	}

}
