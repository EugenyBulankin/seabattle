package SeaBattle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML TextField enterName;
    @FXML Text userName;
    @FXML Button btnOk;
    @FXML Button btnStart;
    @FXML Label testik;
    @FXML ImageView pc;

    //поле противника(PC)
    @FXML ImageView i00;@FXML ImageView i01;@FXML ImageView i02;@FXML ImageView i03;@FXML ImageView i04;@FXML ImageView i05;@FXML ImageView i06;@FXML ImageView i07;@FXML ImageView i08;@FXML ImageView i09;
    @FXML ImageView i10;@FXML ImageView i11;@FXML ImageView i12;@FXML ImageView i13;@FXML ImageView i14;@FXML ImageView i15;@FXML ImageView i16;@FXML ImageView i17;@FXML ImageView i18;@FXML ImageView i19;
    @FXML ImageView i20;@FXML ImageView i21;@FXML ImageView i22;@FXML ImageView i23;@FXML ImageView i24;@FXML ImageView i25;@FXML ImageView i26;@FXML ImageView i27;@FXML ImageView i28;@FXML ImageView i29;
    @FXML ImageView i30;@FXML ImageView i31;@FXML ImageView i32;@FXML ImageView i33;@FXML ImageView i34;@FXML ImageView i35;@FXML ImageView i36;@FXML ImageView i37;@FXML ImageView i38;@FXML ImageView i39;
    @FXML ImageView i40;@FXML ImageView i41;@FXML ImageView i42;@FXML ImageView i43;@FXML ImageView i44;@FXML ImageView i45;@FXML ImageView i46;@FXML ImageView i47;@FXML ImageView i48;@FXML ImageView i49;
    @FXML ImageView i50;@FXML ImageView i51;@FXML ImageView i52;@FXML ImageView i53;@FXML ImageView i54;@FXML ImageView i55;@FXML ImageView i56;@FXML ImageView i57;@FXML ImageView i58;@FXML ImageView i59;
    @FXML ImageView i60;@FXML ImageView i61;@FXML ImageView i62;@FXML ImageView i63;@FXML ImageView i64;@FXML ImageView i65;@FXML ImageView i66;@FXML ImageView i67;@FXML ImageView i68;@FXML ImageView i69;
    @FXML ImageView i70;@FXML ImageView i71;@FXML ImageView i72;@FXML ImageView i73;@FXML ImageView i74;@FXML ImageView i75;@FXML ImageView i76;@FXML ImageView i77;@FXML ImageView i78;@FXML ImageView i79;
    @FXML ImageView i80;@FXML ImageView i81;@FXML ImageView i82;@FXML ImageView i83;@FXML ImageView i84;@FXML ImageView i85;@FXML ImageView i86;@FXML ImageView i87;@FXML ImageView i88;@FXML ImageView i89;
    @FXML ImageView i90;@FXML ImageView i91;@FXML ImageView i92;@FXML ImageView i93;@FXML ImageView i94;@FXML ImageView i95;@FXML ImageView i96;@FXML ImageView i97;@FXML ImageView i98;@FXML ImageView i99;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //ImageView im = (ImageView) mainForm.lookup("#i00");
        //Image image = new Image(new File("human.jpg").toURI().toString());
        //im.setImage(image);

        //image = new Image("@../images/cellShip.jpg");
//        i00.setImage(image);
    }

    @FXML
    public void enterNameAction(){
        //userName.setText(enterName.getText());
        System.out.println("name = " + enterName.getText());
    }

    public void setShips(){
        SeaBattle sb = new SeaBattle();
        Byte[][] gameField = sb.main();
        setShipsOnBoard(gameField);
        btnStart.disableProperty().setValue(true);
    }


    private void setShipsOnBoard(Byte[][] gameField) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //-------------------0----------------------------
                if(i==0 && j == 0){
                    if(gameField[i][j] == 1)
                    {
                        i00.isVisible();
                    }
                }
                if(i==0 && j == 1){
                    if(gameField[i][j] == 1)
                        i01.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 2){
                    if(gameField[i][j] == 1)
                        i02.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 3){
                    if(gameField[i][j] == 1)
                        i03.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 4){
                    if(gameField[i][j] == 1)
                        i04.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 5){
                    if(gameField[i][j] == 1)
                        i05.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 6){
                    if(gameField[i][j] == 1)
                        i06.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 7){
                    if(gameField[i][j] == 1)
                        i07.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 8){
                    if(gameField[i][j] == 1)
                        i08.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==0 && j == 9){
                    if(gameField[i][j] == 1)
                        i09.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------1------------------
                if(i==1 && j == 0){
                    if(gameField[i][j] == 1)
                        i10.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 1){
                    if(gameField[i][j] == 1)
                        i11.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 2){
                    if(gameField[i][j] == 1)
                        i12.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 3){
                    if(gameField[i][j] == 1)
                        i13.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 4){
                    if(gameField[i][j] == 1)
                        i14.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 5){
                    if(gameField[i][j] == 1)
                        i15.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 6){
                    if(gameField[i][j] == 1)
                        i16.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 7){
                    if(gameField[i][j] == 1)
                        i17.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 8){
                    if(gameField[i][j] == 1)
                        i18.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==1 && j == 9){
                    if(gameField[i][j] == 1)
                        i19.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------2------------------
                if(i==2 && j == 0){
                    if(gameField[i][j] == 1)
                        i20.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 1){
                    if(gameField[i][j] == 1)
                        i21.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 2){
                    if(gameField[i][j] == 1)
                        i22.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 3){
                    if(gameField[i][j] == 1)
                        i23.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 4){
                    if(gameField[i][j] == 1)
                        i24.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 5){
                    if(gameField[i][j] == 1)
                        i25.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 6){
                    if(gameField[i][j] == 1)
                        i26.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 7){
                    if(gameField[i][j] == 1)
                        i27.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 8){
                    if(gameField[i][j] == 1)
                        i28.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==2 && j == 9){
                    if(gameField[i][j] == 1)
                        i29.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------3------------------
                if(i==3 && j == 0){
                    if(gameField[i][j] == 1)
                        i30.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 1){
                    if(gameField[i][j] == 1)
                        i31.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 2){
                    if(gameField[i][j] == 1)
                        i32.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 3){
                    if(gameField[i][j] == 1)
                        i33.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 4){
                    if(gameField[i][j] == 1)
                        i34.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 5){
                    if(gameField[i][j] == 1)
                        i35.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 6){
                    if(gameField[i][j] == 1)
                        i36.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 7){
                    if(gameField[i][j] == 1)
                        i37.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 8){
                    if(gameField[i][j] == 1)
                        i38.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==3 && j == 9){
                    if(gameField[i][j] == 1)
                        i39.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------4------------------
                if(i==4 && j == 0){
                    if(gameField[i][j] == 1)
                        i40.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 1){
                    if(gameField[i][j] == 1)
                        i41.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 2){
                    if(gameField[i][j] == 1)
                        i42.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 3){
                    if(gameField[i][j] == 1)
                        i43.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 4){
                    if(gameField[i][j] == 1)
                        i44.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 5){
                    if(gameField[i][j] == 1)
                        i45.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 6){
                    if(gameField[i][j] == 1)
                        i46.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 7){
                    if(gameField[i][j] == 1)
                        i47.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 8){
                    if(gameField[i][j] == 1)
                        i48.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==4 && j == 9){
                    if(gameField[i][j] == 1)
                        i49.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------5------------------
                if(i==5 && j == 0){
                    if(gameField[i][j] == 1)
                        i50.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 1){
                    if(gameField[i][j] == 1)
                        i51.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 2){
                    if(gameField[i][j] == 1)
                        i52.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 3){
                    if(gameField[i][j] == 1)
                        i53.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 4){
                    if(gameField[i][j] == 1)
                        i54.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 5){
                    if(gameField[i][j] == 1)
                        i55.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 6){
                    if(gameField[i][j] == 1)
                        i56.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 7){
                    if(gameField[i][j] == 1)
                        i57.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 8){
                    if(gameField[i][j] == 1)
                        i58.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==5 && j == 9){
                    if(gameField[i][j] == 1)
                        i59.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------6------------------
                if(i==6 && j == 0){
                    if(gameField[i][j] == 1)
                        i60.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 1){
                    if(gameField[i][j] == 1)
                        i61.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 2){
                    if(gameField[i][j] == 1)
                        i62.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 3){
                    if(gameField[i][j] == 1)
                        i63.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 4){
                    if(gameField[i][j] == 1)
                        i64.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 5){
                    if(gameField[i][j] == 1)
                        i65.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 6){
                    if(gameField[i][j] == 1)
                        i66.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 7){
                    if(gameField[i][j] == 1)
                        i67.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 8){
                    if(gameField[i][j] == 1)
                        i68.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==6 && j == 9){
                    if(gameField[i][j] == 1)
                        i69.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------7------------------
                if(i==7 && j == 0){
                    if(gameField[i][j] == 1)
                        i70.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 1){
                    if(gameField[i][j] == 1)
                        i71.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 2){
                    if(gameField[i][j] == 1)
                        i72.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 3){
                    if(gameField[i][j] == 1)
                        i73.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 4){
                    if(gameField[i][j] == 1)
                        i74.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 5){
                    if(gameField[i][j] == 1)
                        i75.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 6){
                    if(gameField[i][j] == 1)
                        i76.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 7){
                    if(gameField[i][j] == 1)
                        i77.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 8){
                    if(gameField[i][j] == 1)
                        i78.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==7 && j == 9){
                    if(gameField[i][j] == 1)
                        i79.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------8------------------
                if(i==8 && j == 0){
                    if(gameField[i][j] == 1)
                        i80.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 1){
                    if(gameField[i][j] == 1)
                        i81.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 2){
                    if(gameField[i][j] == 1)
                        i82.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 3){
                    if(gameField[i][j] == 1)
                        i83.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 4){
                    if(gameField[i][j] == 1)
                        i84.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 5){
                    if(gameField[i][j] == 1)
                        i85.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 6){
                    if(gameField[i][j] == 1)
                        i86.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 7){
                    if(gameField[i][j] == 1)
                        i87.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 8){
                    if(gameField[i][j] == 1)
                        i88.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==8 && j == 9){
                    if(gameField[i][j] == 1)
                        i89.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                //----------------9------------------
                if(i==9 && j == 0){
                    if(gameField[i][j] == 1)
                        i90.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 1){
                    if(gameField[i][j] == 1)
                        i91.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 2){
                    if(gameField[i][j] == 1)
                        i92.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 3){
                    if(gameField[i][j] == 1)
                        i93.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 4){
                    if(gameField[i][j] == 1)
                        i94.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 5){
                    if(gameField[i][j] == 1)
                        i95.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 6){
                    if(gameField[i][j] == 1)
                        i96.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 7){
                    if(gameField[i][j] == 1)
                        i97.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 8){
                    if(gameField[i][j] == 1)
                        i98.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
                if(i==9 && j == 9){
                    if(gameField[i][j] == 1)
                        i99.setStyle("-fx-background-image: url('images/cellShip.jpg');-fx-font-size:1;");
                }
            }
        }
    }
}

