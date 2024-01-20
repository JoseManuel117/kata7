package org.example.csvReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFileCarLoader implements CarLoader{
    private final File file;

    public CsvFileCarLoader(File file){
        this.file = file;
    }

    @Override
    public List<Car> load(){
        try{
            return load(new FileReader(file));
        }catch (Exception e){
            return Collections.emptyList();
        }
    }


    private List<Car> load(FileReader reader) throws IOException{
        return load(new BufferedReader(reader));
    }

    private List<Car> load(BufferedReader reader) throws  IOException{
        return reader.lines().skip(1).limit(6).map(this::toCar).collect(Collectors.toList());
    }


    private Car toCar(String s){
        return toCar(s.split(","));
    }

    private Car toCar(String[] split){
        return  new Car(
                split[0],
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]),
                Integer.parseInt(split[3]),
                split[4],
                split[5],
                split[6],
                split[7]
        );
    }



}
