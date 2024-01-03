package behavioral.template_method;

import behavioral.template_method.template.AbstractTemplate;

public class Client {
    AbstractTemplate template = new ImplementationA();

    public void setting(){
        template.templateMethod();
    }
}
