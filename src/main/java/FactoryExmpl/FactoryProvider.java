package FactoryExmpl;

import FactoryExmpl.Factory.TransportFactory;

public class FactoryProvider {
    public static TransportFactory getFactory(String factoryType){
        if("Transport".equalsIgnoreCase(factoryType)){
            return new TransportFactory();
        }
        return null;
    }
}
