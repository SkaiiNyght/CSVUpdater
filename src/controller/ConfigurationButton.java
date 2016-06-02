/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Ag User
 */
public class ConfigurationButton {
    public static void onClick(){
        Stage window = new Stage();
        
        /*==============================
        Background
        ==============================*/
        Pane background = new Pane();
        
        /*==============================
        Layout
        ==============================*/
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(5,5,5,5));
        
        /*==============================
        Labels
        ==============================*/
        Label lblPctBaseSaturation = new Label("% Base Saturation");
        Label lblPctClay = new Label("% Clay");
        Label lblPctDryMatter = new Label("% Dry Matter");
        Label lblPctMoisture = new Label("% Moisture");
        Label lblPctSand = new Label("% Sand");
        Label lblAmmoniaN = new Label("Ammonia N");
        Label lblAmmoniumN = new Label("Ammonium N");
        Label lblAsh = new Label("Ash");
        Label lblB = new Label("Boron");
        Label lblBaseSaturationCa = new Label("Base Saturation Ca");
        Label lblBaseSaturationH = new Label("Base Saturation H");
        Label lblBaseSaturationK = new Label("Base Saturation K");
        Label lblBaseSaturationMg = new Label("Base Saturation Mg");
        Label lblBaseSaturationNa = new Label("Base Saturation Na");
        Label lblBufferpH = new Label("Buffer pH");
        Label lblCa = new Label("Calcium");
        Label lblCEC = new Label("CEC");
        Label lblChloride = new Label("Chloride");
        Label lblCu = new Label("Copper");
        Label lblEC = new Label("EC");
        Label lblESP = new Label("ESP");
        Label lblExtractableFe = new Label("Extractable Iron");
        Label lblFe = new Label("Iron");
        Label lblFizz = new Label("Fizz");
        Label lblH = new Label("Hydrogen");
        Label lblK = new Label("Potassium");
        Label lblMg = new Label("Magnesium");
        Label lblMn = new Label("Manganese");
        Label lblMoistCa = new Label("Moist Calcium");
        Label lblMoistK = new Label("Moist Potassium");
        Label lblMoistMg = new Label("Moist Magnesium");
        Label lblMoistNa = new Label("Moist Sodium");
        Label lblMoisture = new Label("Moisture");
        Label lblNa = new Label("Sodium");
        Label lblNitrateN = new Label("Nitrate");
        Label lblOM = new Label("Organic Matter");
        Label lblpH = new Label("pH");
        Label lblProtein = new Label("Protein");
        Label lblS = new Label("Sulfur");
        Label lblSulfateS = new Label("Sulfate");
        Label lblTotalC = new Label("Total C");
        Label lblTotalN = new Label("Total N");
        Label lblTotalP = new Label("Total P");
        Label lblZn = new Label("Zinc");
        window.showAndWait();
    }
}
