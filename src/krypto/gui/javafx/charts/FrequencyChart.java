/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.charts;

import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import krypto.data.Alphabet;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FrequencyChart extends Application {

	private String abcd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private Map<Character, Double> frequencyMap;

	public FrequencyChart(Map<Character, Double> frequencyMap) {
		this.frequencyMap = frequencyMap;
	}

	/**
	 * Zeigt Normalverteilung der Buchstaben im Vergleich zur errechneten
	 * Verteilung im verschlüsselten Text als Balken Diagramm an.
	 */
	public void start(Stage stage) {
		NumberAxis yAxis = new NumberAxis();
		CategoryAxis xAxis = new CategoryAxis();
		BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);

		stage.setTitle("Kryptonite -> Frequency Analysis");
		bc.setTitle("Frequency Analysis");
		yAxis.setLabel("Percentage");
		xAxis.setLabel("Alphabet");

		XYChart.Series<String, Number> plainSeries = new XYChart.Series<String, Number>();
		plainSeries.setName("Plain");
		for (Alphabet abc : Alphabet.values()) {
			plainSeries.getData().add(new XYChart.Data<String, Number>(abc.name(), abc.getFrequency()));
		}

		XYChart.Series<String, Number> cipherSeries = new XYChart.Series<String, Number>();
		cipherSeries.setName("Cipher");

		for (int i = 0; i < 26; i++) {
			String str = String.valueOf(abcd.charAt(i));
			Double number = frequencyMap.get(abcd.charAt(i));
			cipherSeries.getData().add(new XYChart.Data<String, Number>(str, number));
		}

		Scene scene = new Scene(bc, 800, 600);
		bc.getData().addAll(plainSeries, cipherSeries);
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
