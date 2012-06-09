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

public class FrequencyChart extends Application{

	@Override public void start(Stage stage) {
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Integer, Double> abcMap = new abcFrequency().getAbc();
		stage.setTitle("Kryptonite -> Frequency Analysis");
		final NumberAxis yAxis = new NumberAxis();
		final CategoryAxis xAxis = new CategoryAxis();
		final BarChart<String, Number> bc =
				new BarChart<String, Number>(xAxis,yAxis);
		bc.setTitle("Frequency Analysis");
		yAxis.setLabel("Percentage");
		xAxis.setLabel("Alphabet");
		
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("Plain");
		for (int i = 1; i<= 25; i++) {
			series1.getData().add(new XYChart.Data(String.valueOf(abc.charAt(i-1)), abcMap.get(i)));
		}
//		series1.getData().add(new XYChart.Data("A", 1.1));
		
//		XYChart.Series series2 = new XYChart.Series();
//		series2.setName("Cipher");

		Scene scene = new Scene(bc,800,600);
		bc.getData().addAll(series1);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

