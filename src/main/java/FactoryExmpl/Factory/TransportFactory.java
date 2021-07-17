package FactoryExmpl.Factory;

import FactoryExmpl.AbstractFactory.AbstractTransportFactory;
import FactoryExmpl.Model.EVs.EVCar;
import FactoryExmpl.Model.Motorcycle.Motorcycle;
import FactoryExmpl.Model.Transport;
import FactoryExmpl.Model.Vehicle.Vehicle;

public class TransportFactory implements AbstractTransportFactory<Transport> {
    @Override
    public Transport createAnyTypeTransport(String vehicleType) {
        if("Motorcycle".equalsIgnoreCase(vehicleType)){
            return new Motorcycle();
        }else if("Vehicle".equalsIgnoreCase(vehicleType)){
            return new Vehicle();
        }else if("EVichle".equalsIgnoreCase(vehicleType)){
            return new EVCar();
        }
        return null;
    }






}
