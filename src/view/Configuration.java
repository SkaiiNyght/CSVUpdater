package view;

import controller.Props;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Zach Larson
 */
public class Configuration {

    private TextField txtPctBaseSaturation;
    private TextField txtPctClay;
    private TextField txtPctDryMatter;
    private TextField txtPctMoisture;
    private TextField txtPctSand;
    private TextField txtPctSilt;
    private TextField txtAmmoniaN;
    private TextField txtAmmoniumN;
    private TextField txtAsh;
    private TextField txtB;
    private TextField txtBaseSaturationCa;
    private TextField txtBaseSaturationH;
    private TextField txtBaseSaturationK;
    private TextField txtBaseSaturationMg;
    private TextField txtBaseSaturationNa;
    private TextField txtBufferpH;
    private TextField txtCa;
    private TextField txtCEC;
    private TextField txtChloride;
    private TextField txtCu;
    private TextField txtEC;
    private TextField txtESP;
    private TextField txtExtractableFe;
    private TextField txtFe;
    private TextField txtFizz;
    private TextField txtH;
    private TextField txtK;
    private TextField txtMg;
    private TextField txtMn;
    private TextField txtMoistCa;
    private TextField txtMoistK;
    private TextField txtMoistMg;
    private TextField txtMoistNa;
    private TextField txtMoisture;
    private TextField txtNa;
    private TextField txtNitrateN;
    private TextField txtOM;
    private TextField txtPBrayStrong;
    private TextField txtPBrayWeak;
    private TextField txtPOlsen;
    private TextField txtpH;
    private TextField txtProtein;
    private TextField txtS;
    private TextField txtSulfateS;
    private TextField txtTotalC;
    private TextField txtTotalN;
    private TextField txtTotalP;
    private TextField txtZn;

    public void Display() {

        Properties props = Props.getProperties();

        Stage window = new Stage();

        /*==============================
        Background
        ==============================*/
        Pane background = new Pane();

        /*==============================
        Layout
        ==============================*/
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(5, 5, 5, 5));

        /*==============================
        Labels
        ==============================*/
        Label lblPctBaseSaturation = new Label("% Base Saturation");
        GridPane.setConstraints(lblPctBaseSaturation, 0, 0);
        Label lblPctClay = new Label("% Clay");
        GridPane.setConstraints(lblPctClay, 0, 1);
        Label lblPctDryMatter = new Label("% Dry Matter");
        GridPane.setConstraints(lblPctDryMatter, 0, 2);
        Label lblPctMoisture = new Label("% Moisture");
        GridPane.setConstraints(lblPctMoisture, 0, 3);
        Label lblPctSand = new Label("% Sand");
        GridPane.setConstraints(lblPctSand, 0, 4);
        Label lblAmmoniaN = new Label("Ammonia N");
        GridPane.setConstraints(lblAmmoniaN, 0, 5);
        Label lblAmmoniumN = new Label("Ammonium N");
        GridPane.setConstraints(lblAmmoniumN, 0, 6);
        Label lblAsh = new Label("Ash");
        GridPane.setConstraints(lblAsh, 0, 7);
        Label lblB = new Label("Boron");
        GridPane.setConstraints(lblB, 0, 8);
        Label lblBaseSaturationCa = new Label("Base Saturation Ca");
        GridPane.setConstraints(lblBaseSaturationCa, 0, 9);
        Label lblBaseSaturationH = new Label("Base Saturation H");
        GridPane.setConstraints(lblBaseSaturationH, 2, 0);
        Label lblBaseSaturationK = new Label("Base Saturation K");
        GridPane.setConstraints(lblBaseSaturationK, 2, 1);
        Label lblBaseSaturationMg = new Label("Base Saturation Mg");
        GridPane.setConstraints(lblBaseSaturationMg, 2, 2);
        Label lblBaseSaturationNa = new Label("Base Saturation Na");
        GridPane.setConstraints(lblBaseSaturationNa, 2, 3);
        Label lblBufferpH = new Label("Buffer pH");
        GridPane.setConstraints(lblBufferpH, 2, 4);
        Label lblCa = new Label("Calcium");
        GridPane.setConstraints(lblCa, 2, 5);
        Label lblCEC = new Label("CEC");
        GridPane.setConstraints(lblCEC, 2, 6);
        Label lblChloride = new Label("Chloride");
        GridPane.setConstraints(lblChloride, 2, 7);
        Label lblCu = new Label("Copper");
        GridPane.setConstraints(lblCu, 2, 8);
        Label lblEC = new Label("EC");
        GridPane.setConstraints(lblEC, 2, 9);
        Label lblESP = new Label("ESP");
        GridPane.setConstraints(lblESP, 4, 0);
        Label lblExtractableFe = new Label("Extractable Iron");
        GridPane.setConstraints(lblExtractableFe, 4, 1);
        Label lblFe = new Label("Iron");
        GridPane.setConstraints(lblFe, 4, 2);
        Label lblFizz = new Label("Fizz");
        GridPane.setConstraints(lblFizz, 4, 3);
        Label lblH = new Label("Hydrogen");
        GridPane.setConstraints(lblH, 4, 4);
        Label lblK = new Label("Potassium");
        GridPane.setConstraints(lblK, 4, 5);
        Label lblMg = new Label("Magnesium");
        GridPane.setConstraints(lblMg, 4, 6);
        Label lblMn = new Label("Manganese");
        GridPane.setConstraints(lblMn, 4, 7);
        Label lblMoistCa = new Label("Moist Calcium");
        GridPane.setConstraints(lblMoistCa, 4, 8);
        Label lblMoistK = new Label("Moist Potassium");
        GridPane.setConstraints(lblMoistK, 4, 9);
        Label lblMoistMg = new Label("Moist Magnesium");
        GridPane.setConstraints(lblMoistMg, 6, 0);
        Label lblMoistNa = new Label("Moist Sodium");
        GridPane.setConstraints(lblMoistNa, 6, 1);
        Label lblMoisture = new Label("Moisture");
        GridPane.setConstraints(lblMoisture, 6, 2);
        Label lblNa = new Label("Sodium");
        GridPane.setConstraints(lblNa, 6, 3);
        Label lblNitrateN = new Label("Nitrate");
        GridPane.setConstraints(lblNitrateN, 6, 4);
        Label lblOM = new Label("Organic Matter");
        GridPane.setConstraints(lblOM, 6, 5);
        Label lblPBrayStrong = new Label("P Bray Strong");
        GridPane.setConstraints(lblPBrayStrong, 6, 6);
        Label lblPBrayWeak = new Label("P Bray Weak");
        GridPane.setConstraints(lblPBrayWeak, 6, 7);
        Label lblPOlsen = new Label("P Olsen");
        GridPane.setConstraints(lblPOlsen, 6, 8);
        Label lblpH = new Label("pH");
        GridPane.setConstraints(lblpH, 6, 9);
        Label lblProtein = new Label("Protein");
        GridPane.setConstraints(lblProtein, 8, 0);
        Label lblS = new Label("Sulfur");
        GridPane.setConstraints(lblS, 8, 1);
        Label lblSulfateS = new Label("Sulfate");
        GridPane.setConstraints(lblSulfateS, 8, 2);
        Label lblTotalC = new Label("Total C");
        GridPane.setConstraints(lblTotalC, 8, 3);
        Label lblTotalN = new Label("Total N");
        GridPane.setConstraints(lblTotalN, 8, 4);
        Label lblTotalP = new Label("Total P");
        GridPane.setConstraints(lblTotalP, 8, 5);
        Label lblZn = new Label("Zinc");
        GridPane.setConstraints(lblZn, 8, 6);
        Label lblPctSilt = new Label("% Silt");
        GridPane.setConstraints(lblPctSilt, 8, 7);

        /*==============================
        Text Fields
        ==============================*/
        txtPctBaseSaturation = new TextField(props.getProperty("%_Base_Saturation"));
        GridPane.setConstraints(txtPctBaseSaturation, 1, 0);
        txtPctClay = new TextField(props.getProperty("%_Clay"));
        GridPane.setConstraints(txtPctClay, 1, 1);
        txtPctDryMatter = new TextField(props.getProperty("%_Dry_Matter"));
        GridPane.setConstraints(txtPctDryMatter, 1, 2);
        txtPctMoisture = new TextField(props.getProperty("%_Moisture"));
        GridPane.setConstraints(txtPctMoisture, 1, 3);
        txtPctSand = new TextField(props.getProperty("%_Sand"));
        GridPane.setConstraints(txtPctSand, 1, 4);
        txtAmmoniaN = new TextField(props.getProperty("Ammonia_N"));
        GridPane.setConstraints(txtAmmoniaN, 1, 5);
        txtAmmoniumN = new TextField(props.getProperty("Ammonium_N"));
        GridPane.setConstraints(txtAmmoniumN, 1, 6);
        txtAsh = new TextField(props.getProperty("Ash"));
        GridPane.setConstraints(txtAsh, 1, 7);
        txtB = new TextField(props.getProperty("B"));
        GridPane.setConstraints(txtB, 1, 8);
        txtBaseSaturationCa = new TextField(props.getProperty("Base_Saturation_Ca"));
        GridPane.setConstraints(txtBaseSaturationCa, 1, 9);
        txtBaseSaturationH = new TextField(props.getProperty("Base_Saturation_H"));
        GridPane.setConstraints(txtBaseSaturationH, 3, 0);
        txtBaseSaturationK = new TextField(props.getProperty("Base_Saturation_K"));
        GridPane.setConstraints(txtBaseSaturationK, 3, 1);
        txtBaseSaturationMg = new TextField(props.getProperty("Base_Saturation_Mg"));
        GridPane.setConstraints(txtBaseSaturationMg, 3, 2);
        txtBaseSaturationNa = new TextField(props.getProperty("Base_Saturation_Na"));
        GridPane.setConstraints(txtBaseSaturationNa, 3, 3);
        txtBufferpH = new TextField(props.getProperty("Buffer_pH"));
        GridPane.setConstraints(txtBufferpH, 3, 4);
        txtCa = new TextField(props.getProperty("Ca"));
        GridPane.setConstraints(txtCa, 3, 5);
        txtCEC = new TextField(props.getProperty("CEC_(sum)"));
        GridPane.setConstraints(txtCEC, 3, 6);
        txtChloride = new TextField(props.getProperty("Chloride"));
        GridPane.setConstraints(txtChloride, 3, 7);
        txtCu = new TextField(props.getProperty("Cu"));
        GridPane.setConstraints(txtCu, 3, 8);
        txtEC = new TextField(props.getProperty("EC"));
        GridPane.setConstraints(txtEC, 3, 9);
        txtESP = new TextField(props.getProperty("ESP"));
        GridPane.setConstraints(txtESP, 5, 0);
        txtExtractableFe = new TextField(props.getProperty("Extractable_Fe"));
        GridPane.setConstraints(txtExtractableFe, 5, 1);
        txtFe = new TextField(props.getProperty("Fe"));
        GridPane.setConstraints(txtFe, 5, 2);
        txtFizz = new TextField(props.getProperty("Fizz"));
        GridPane.setConstraints(txtFizz, 5, 3);
        txtH = new TextField(props.getProperty("H"));
        GridPane.setConstraints(txtH, 5, 4);
        txtK = new TextField(props.getProperty("K"));
        GridPane.setConstraints(txtK, 5, 5);
        txtMg = new TextField(props.getProperty("Mg"));
        GridPane.setConstraints(txtMg, 5, 6);
        txtMn = new TextField(props.getProperty("Mn"));
        GridPane.setConstraints(txtMn, 5, 7);
        txtMoistCa = new TextField(props.getProperty("Moist_Ca"));
        GridPane.setConstraints(txtMoistCa, 5, 8);
        txtMoistK = new TextField(props.getProperty("Moist_K"));
        GridPane.setConstraints(txtMoistK, 5, 9);
        txtMoistMg = new TextField(props.getProperty("Moist_Mg"));
        GridPane.setConstraints(txtMoistMg, 7, 0);
        txtMoistNa = new TextField(props.getProperty("Moist_Na"));
        GridPane.setConstraints(txtMoistNa, 7, 1);
        txtMoisture = new TextField(props.getProperty("Moisture"));
        GridPane.setConstraints(txtMoisture, 7, 2);
        txtNa = new TextField(props.getProperty("Na"));
        GridPane.setConstraints(txtNa, 7, 3);
        txtNitrateN = new TextField(props.getProperty("Nitrate_N"));
        GridPane.setConstraints(txtNitrateN, 7, 4);
        txtOM = new TextField(props.getProperty("OM"));
        GridPane.setConstraints(txtOM, 7, 5);
        txtPBrayStrong = new TextField(props.getProperty("P_Bray_strong"));
        GridPane.setConstraints(txtPBrayStrong, 7, 6);
        txtPBrayWeak = new TextField(props.getProperty("P_Bray_weak"));
        GridPane.setConstraints(txtPBrayWeak, 7, 7);
        txtPOlsen = new TextField(props.getProperty("P_Olsen"));
        GridPane.setConstraints(txtPOlsen, 7, 8);
        txtpH = new TextField(props.getProperty("pH"));
        GridPane.setConstraints(txtpH, 7, 9);
        txtProtein = new TextField(props.getProperty("Protein"));
        GridPane.setConstraints(txtProtein, 9, 0);
        txtS = new TextField(props.getProperty("S"));
        GridPane.setConstraints(txtS, 9, 1);
        txtSulfateS = new TextField(props.getProperty("Sulfate_S"));
        GridPane.setConstraints(txtSulfateS, 9, 2);
        txtTotalC = new TextField(props.getProperty("Total_C"));
        GridPane.setConstraints(txtTotalC, 9, 3);
        txtTotalN = new TextField(props.getProperty("Total_N"));
        GridPane.setConstraints(txtTotalN, 9, 4);
        txtTotalP = new TextField(props.getProperty("Total_P"));
        GridPane.setConstraints(txtTotalP, 9, 5);
        txtZn = new TextField(props.getProperty("Zn"));
        GridPane.setConstraints(txtZn, 9, 6);
        txtPctSilt = new TextField(props.getProperty("%_Silt"));
        GridPane.setConstraints(txtPctSilt, 9, 7);

        /*==============================
        Buttons
        ==============================*/
        Button btnSave = new Button("Save");
        btnSave.setOnAction(event -> {
            Props.saveProperties(getColumnMap());
            window.close();
        });
        GridPane.setConstraints(btnSave, 0, 10);

        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(event -> {
            window.close();
        });
        GridPane.setConstraints(btnCancel, 9, 10);

        /*==============================
        Add Items Controls to layout
        ==============================*/
        layout.getChildren().addAll(lblAmmoniaN, lblAmmoniumN, lblAsh, lblB,
                lblBaseSaturationCa, lblBaseSaturationH, lblBaseSaturationK,
                lblBaseSaturationMg, lblBaseSaturationNa, lblBufferpH, lblCEC,
                lblCa, lblChloride, lblCu, lblEC, lblESP, lblExtractableFe,
                lblFe, lblFizz, lblH, lblK, lblMg, lblMn, lblMoistCa,
                lblMoistK, lblMoistMg, lblMoistNa, lblMoisture, lblNa,
                lblNitrateN, lblOM, lblPBrayStrong, lblPBrayWeak, lblPOlsen,
                lblPctBaseSaturation, lblPctClay, lblPctDryMatter,
                lblPctMoisture, lblPctSand, lblProtein, lblS, lblSulfateS,
                lblTotalC, lblTotalN, lblTotalP, lblZn, lblpH, lblPctSilt,
                txtPctBaseSaturation,txtPctClay,txtPctDryMatter,txtPctMoisture,
                txtPctSand,txtAmmoniaN,txtAmmoniumN, txtAsh, txtB,
                txtBaseSaturationCa, txtBaseSaturationH, txtBaseSaturationK,
                txtBaseSaturationMg, txtBaseSaturationNa, txtBufferpH, txtCa, 
                txtCEC, txtChloride, txtCu, txtEC, txtESP, txtExtractableFe,
                txtFe, txtFizz, txtH, txtK, txtMg, txtMn, txtMoistCa,
                txtMoistK, txtMoistMg, txtMoistNa, txtMoisture, txtNa,
                txtNitrateN, txtOM, txtPBrayStrong, txtPBrayWeak, txtPOlsen,
                txtpH, txtProtein, txtS, txtSulfateS,
                txtTotalC, txtTotalN, txtTotalP, txtZn,  txtPctSilt,
                btnCancel, btnSave);

        /*==============================
        Add Layout to background
        ==============================*/
        background.getChildren().addAll(layout);

        /*==============================
        Create Scene
        ==============================*/
        Scene scene = new Scene(background);

        window.setScene(scene);
        window.show();
    }

    public Map<String, String> getColumnMap() {
        Map<String, String> columnMap = new HashMap();
        columnMap.put("Ammonia N", txtAmmoniaN.getText());
        columnMap.put("Ammonium N", txtAmmoniumN.getText());
        columnMap.put("Ash", txtAsh.getText());
        columnMap.put("B", txtB.getText());
        columnMap.put("Base Saturation Ca", txtBaseSaturationCa.getText());
        columnMap.put("Base Saturation H", txtBaseSaturationH.getText());
        columnMap.put("Base Saturation K", txtBaseSaturationK.getText());
        columnMap.put("Base Saturation Mg", txtBaseSaturationMg.getText());
        columnMap.put("Base Saturation Na", txtBaseSaturationNa.getText());
        columnMap.put("Buffer pH", txtBufferpH.getText());
        columnMap.put("CEC (sum)", txtCEC.getText());
        columnMap.put("Ca", txtCa.getText());
        columnMap.put("Chloride", txtChloride.getText());
        columnMap.put("Cu", txtCu.getText());
        columnMap.put("EC", txtEC.getText());
        columnMap.put("ESP", txtESP.getText());
        columnMap.put("Extractable Fe", txtExtractableFe.getText());
        columnMap.put("Fe", txtFe.getText());
        columnMap.put("Fizz", txtFizz.getText());
        columnMap.put("H", txtH.getText());
        columnMap.put("K", txtK.getText());
        columnMap.put("Mg", txtMg.getText());
        columnMap.put("Mn", txtMn.getText());
        columnMap.put("Moist Ca", txtMoistCa.getText());
        columnMap.put("Moist K", txtMoistK.getText());
        columnMap.put("Moist Mg", txtMoistMg.getText());
        columnMap.put("Moist Na", txtMoistNa.getText());
        columnMap.put("Moisture", txtMoisture.getText());
        columnMap.put("Na", txtNa.getText());
        columnMap.put("Nitrate N", txtNitrateN.getText());
        columnMap.put("OM", txtOM.getText());
        columnMap.put("P Bray strong", txtPBrayStrong.getText());
        columnMap.put("P Bray weak", txtPBrayWeak.getText());
        columnMap.put("P Olsen", txtPOlsen.getText());
        columnMap.put("% Base Saturation", txtPctBaseSaturation.getText());
        columnMap.put("% Clay", txtPctClay.getText());
        columnMap.put("% Dry Matter", txtPctDryMatter.getText());
        columnMap.put("% Moisture", txtPctMoisture.getText());
        columnMap.put("% Sand", txtPctSand.getText());
        columnMap.put("% Silt", txtPctSilt.getText());
        columnMap.put("Protein", txtProtein.getText());
        columnMap.put("S", txtS.getText());
        columnMap.put("Sulfate S", txtSulfateS.getText());
        columnMap.put("Total C", txtTotalC.getText());
        columnMap.put("Total N", txtTotalN.getText());
        columnMap.put("Total P", txtTotalP.getText());
        columnMap.put("Zn", txtZn.getText());
        columnMap.put("pH", txtpH.getText());
        return columnMap;
    }
}
