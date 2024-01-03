package creational.factory_method.factory;

import creational.factory_method.product.ConcreteProductB;
import creational.factory_method.product.IProduct;

public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductB();
    }
}
