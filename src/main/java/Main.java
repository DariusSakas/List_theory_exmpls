import FactoryExmpl.Factory.TransportFactory;
import FactoryExmpl.FactoryProvider;
import FactoryExmpl.Model.EVs.EVCar;
import FactoryExmpl.Model.Motorcycle.Motorcycle;
import FactoryExmpl.Model.Transport;
import Generics.E_element;
import Generics.T_type;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Collections_is_not_Collection collections_is_not_collection = new Collections_is_not_Collection();
        collections_is_not_collection.checkCollectionsMethods();

        collections_is_not_collection.warningMethod();

        //Big O URL: https://www.bigocheatsheet.com/

//        Algorithm           ArrayList   LinkedList
//        seek front            O(1)         O(1)
//        seek back             O(1)         O(1)
//        seek to index         O(1)         O(N)
//        insert at front       O(N)         O(1)
//        insert at back        O(1)         O(1)
//        insert after an item  O(N)         O(1)

        //Abstract factory:
//        TransportFactory transportFactory = FactoryProvider.getFactory("Transport");
//
//        Transport motorcycle = transportFactory.createAnyTypeTransport("Motorcycle");
//
//        //Generics Element:
        //primitives no no /Valhalla project yes yes

//        String[] strings = new String[]{"a", "b", "c"};
//        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
//
//        E_element.printArray(strings);
//        E_element.printArray(numbers);

//        Motorcycle motorcycle222 = T_type.getSomeClass(Motorcycle.class);
//
//        EVCar evCar = T_type.getSomeClass(EVCar.class);

    }
}
