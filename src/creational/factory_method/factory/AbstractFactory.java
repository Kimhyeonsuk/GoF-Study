package creational.factory_method.factory;

import creational.factory_method.product.IProduct;

public interface AbstractFactory {
    default IProduct createOperation(){
        IProduct product = createProduct();
        product.setting();
        return product;
    }

    IProduct createProduct();
}
