package krypto.gui.javafx.charts;

import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import krypto.data.abcFrequency;

public class BarChartSample extends Application{
	final static String austria = "Austria";
	final static String brazil = "Brazil";
	final static String france = "France";
	final static String italy = "Italy";
	final static String usa = "USA";

	@Override public void start(Stage stage) {
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Integer, Double> abcMap = new abcFrequency().getAbc();
		stage.setTitle("Kryptonite -> Frequency Analysis");
		final NumberAxis xAxis = new NumberAxis();
		final CategoryAxis yAxis = new CategoryAxis();
		final BarChart<Number,String> bc =
				new BarChart<Number,String>(xAxis,yAxis);

		bc.setTitle("Frequency Analysis");
		xAxis.setLabel("Percentage");
		yAxis.setLabel("Alphabet");

		XYChart.Series series1 = new XYChart.Series();
		series1.setName("Plain");
		for (int i = 1; i <= 25; i++) {
			series1.getData().add(new XYChart.Data(abcMap.get(i), String.valueOf(abc.charAt(i-1))));
		}
//		String a="A";
//		double x = 1.34;
//		series1.getData().add(new XYChart.Data(abcMap.get(1), String.valueOf(abc.charAt(0))));
//		series1.getData().add(new XYChart.Data(abcMap.get(1), String.valueOf(abc.charAt(13))));
//		series1.getData().add(new XYChart.Data(8.82, "B"));
//		series1.getData().add(new XYChart.Data(10, "C"));

		XYChart.Series series2 = new XYChart.Series();
		series2.setName("Cipher");
//		series2.getData().add(new XYChart.Data(57401.85, "A"));
//		series2.getData().add(new XYChart.Data(41941.19, "B"));
//		series2.getData().add(new XYChart.Data(45263.37, "C"));
		series2.getData().add(new XYChart.Data(2.3, "A"));
		series2.getData().add(new XYChart.Data(2.3, "B"));
		series2.getData().add(new XYChart.Data(2.3, "C"));
		series2.getData().add(new XYChart.Data(2.3, "D"));
		series2.getData().add(new XYChart.Data(2.3, "E"));
		
		Scene scene = new Scene(bc,800,600);
		bc.getData().addAll(series1, series2);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

