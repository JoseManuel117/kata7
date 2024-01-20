package org.example.swing;

import org.example.HistogramDisplay;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private HistogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException{
        setTitle("Histograma Kata3");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JHistogramDisplay display = new JHistogramDisplay();
        histogramDisplay = display;
        return display;
    }

    public HistogramDisplay histogramDisplay(){
        return histogramDisplay;
    }


}
