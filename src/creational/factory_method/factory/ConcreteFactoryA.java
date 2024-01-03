package creational.factory_method.factory;

import creational.factory_method.product.ConcreteProductA;
import creational.factory_method.product.IProduct;

public class ConcreteFactoryA implements AbstractFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
