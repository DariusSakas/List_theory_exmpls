package FactoryExmpl.Model;

public interface EVichle extends Transport {

    @Override
    default void makeEngineSounds() {
        System.out.println("Bzzzzzzzzz");
        System.out.println(this.getClass().getSimpleName());
    }
}
