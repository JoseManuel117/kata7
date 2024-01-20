package org.example.csvReader;

import java.util.List;
import java.util.Map;

public interface CarProcessor {

    Map<String, Integer> process(List<Car> cars);
}
