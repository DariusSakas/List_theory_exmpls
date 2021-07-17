package FactoryExmpl.AbstractFactory;

public interface AbstractTransportFactory<T> {
    T createAnyTypeTransport (String vehicleType);
   }
