package Generics;

import FactoryExmpl.Model.Transport;

import java.awt.datatransfer.Transferable;

public class T_type {
    public static <T extends Transport> T getSomeClass(Class<T> classToCheck) throws InstantiationException, IllegalAccessException {
      return classToCheck.newInstance();
    }
}
