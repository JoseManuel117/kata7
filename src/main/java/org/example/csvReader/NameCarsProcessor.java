package org.example.csvReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCarsProcessor implements CarProcessor{

    @Override
    public Map<String, Integer> process(List<Car> cars){
        Map<String, Integer> result = new HashMap<>();
        for (Car carAux : cars){
            String name = carAux.getName();
            result.put(name, result.getOrDefault(name, 0) + 1);
        }
        return result;

    }


}
