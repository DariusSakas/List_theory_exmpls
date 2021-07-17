package FactoryExmpl.Model;

public interface Transport {

    default void makeEngineSounds(){
        System.out.println("Brap brap brapp");
        System.out.println(this.getClass().getSimpleName());
    }
}
