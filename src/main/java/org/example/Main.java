package org.example;

import org.example.csvReader.Car;
import org.example.csvReader.CarLoader;
import org.example.csvReader.CsvFileCarLoader;
import org.example.csvReader.NameCarsProcessor;
import org.example.swing.MainFrame;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CarLoader loader = new CsvFileCarLoader(new File("C:\\Users\\ganma\\IdeaProjects\\kata7\\src\\main\\resources\\CAR DETAILS FROM CAR DEKHO.csv"));
        List<Car> carList= loader.load();
        Map<String, Integer> result = new NameCarsProcessor().process(carList);
        List<String> keys = new ArrayList<>(result.keySet());

        result.put(keys.get(1), 3);
        result.put(keys.get(3), 5);

        for(String key : result.keySet()){
            System.out.println(key + " = " + result.get(key));
        }

        Histogram histogram = new Histogram(result);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);



    }
}