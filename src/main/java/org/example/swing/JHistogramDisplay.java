package org.example.swing;

import org.example.Histogram;
import org.example.HistogramDisplay;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class JHistogramDisplay extends JPanel implements HistogramDisplay {
    public JHistogramDisplay(){
        setLayout(new BorderLayout());
    }

    @Override
    public void show(Histogram histogram){
        DefaultCategoryDataset dataset = dataset(histogram.result());
        JFreeChart chart = chart(dataset);
        add(new ChartPanel(chart));
    }


    private JFreeChart chart(DefaultCategoryDataset dataset){
        return ChartFactory.createBarChart(
                "Unidades de modelos en venta",
                "Modelo",
                "Unidades en venta",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
    }

    private DefaultCategoryDataset dataset(Map<String, Integer> data){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for(Map.Entry<String, Integer> entry : data.entrySet()){
            dataset.addValue(entry.getValue(), "Coches", entry.getKey());
        }

        return dataset;
    }


}
