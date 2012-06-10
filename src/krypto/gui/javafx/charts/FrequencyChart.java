/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.gui.javafx.charts;

import com.sun.glass.events.MouseEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import krypto.data.Alphabet;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class FrequencyChart extends Application{

	private String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public void start(Stage stage) {
		NumberAxis yAxis = new NumberAxis();
		CategoryAxis xAxis = new CategoryAxis();
		BarChart<String, Number> bc = new BarChart<String, Number>(xAxis,yAxis);

		stage.setTitle("Kryptonite -> Frequency Analysis");
		bc.setTitle("Frequency Analysis");
		yAxis.setLabel("Percentage");
		xAxis.setLabel("Alphabet");

		XYChart.Series plainSeries = new XYChart.Series<String, Number>();
		plainSeries.setName("Plain");
		for (Alphabet abc : Alphabet.values()) {
			plainSeries.getData().add(new XYChart.Data<String, Number>(abc.name(), abc.getFrequency()));
		}

		XYChart.Series<String, Number> cipherSeries = new XYChart.Series<String, Number>();
		cipherSeries.setName("Cipher");
		for (Alphabet def : Alphabet.values()) {
			cipherSeries.getData().add(new XYChart.Data<String, Number>(def.name(), def.getFrequency()));
		}
		
		Scene scene = new Scene(bc,800,600);
		bc.getData().addAll(plainSeries, cipherSeries);
		stage.setScene(scene);
		stage.show();
		
//		Label caption = new Label(" ");
//		caption.setTextFill(Color.RED);
//		caption.setStyle("-fx-font: 24 arial;");
//		for (Series<String, Number> data : bc.getData()) {
//			data.getNode().addEventHandler(MouseEvent.CLICK, new EventHandler<MouseEvent>() {
//
//				@Override
//				public void handle(MouseEvent e) {
//					// TODO Auto-generated method stub
//					caption.setTranslateX(e.getS)
//				}
//			});
//		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
