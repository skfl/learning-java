package DSTU.MathMethods.Graphics;

import DSTU.MathMethods.Lab2.Data;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class GraphicOutput {
    public static void graphOutput() {
        double[] xData = Data.getXdata();
        double[] yData = Data.getYdata();
        XYChart chart = QuickChart.getChart("sin(x)/x - 0,5","X","Y","y(x)",xData,yData);
        new SwingWrapper(chart).displayChart();
    }
}
