package Generics;

import FactoryExmpl.Model.EVichle;

import java.util.List;

public class WildCard {
        public static void wildCardExample (List<? extends EVichle > evlist){
            for (EVichle eVichle : evlist) {
                System.out.println(eVichle);
            }
        }
}
