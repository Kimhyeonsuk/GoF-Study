package behavioral.template_method.template;

public interface AbstractTemplate {
    default void templateMethod(){
        step1();
        step2();

        if(hook()){
            step3();
        }
    }


   boolean hook();

    void step1();
    void step2();
    void step3();
}
