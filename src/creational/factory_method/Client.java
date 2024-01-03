package creational.factory_method;

import creational.factory_method.factory.AbstractFactory;
import creational.factory_method.factory.ConcreteFactoryA;
import creational.factory_method.factory.ConcreteFactoryB;
import creational.factory_method.product.IProduct;

public class Client {
    AbstractFactory[] factories = {
            new ConcreteFactoryA(),
            new ConcreteFactoryB()
    };

    IProduct productA = factories[0].createOperation();
    IProduct productB = factories[1].createOperation();
}
