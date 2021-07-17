public interface SuppressWarningTest {

    //@SuppressWarnings("unchecked")
    default void warningMethod(){
        System.out.println("Haha");
    }

}
