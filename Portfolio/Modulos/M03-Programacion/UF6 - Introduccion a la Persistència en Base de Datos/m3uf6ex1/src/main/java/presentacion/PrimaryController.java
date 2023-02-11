/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package presentacion;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import modelo.Oficina;
import presentacion.App;
import presentacion.SecondaryController;

/**
 * FXML Controller class
 *
 * @author Albert
 */
public class PrimaryController implements Initializable,OfficeData {

    //static String texto="";
    
    @FXML
    private ListView<String> list_sql;
    @FXML
    private Button btn_change;
    @FXML
    public TextField txtCodi;
    
    public URL url;
    
    public ResourceBundle rb;
    
    public ArrayList<Oficina> oficinasPre;
    
    ObservableList<String> ofiView = FXCollections.observableArrayList();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            oficinasPre=aplicacion.LogicaOficina.getOficina();
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0; i<oficinasPre.size();i++){
            Oficina oficina = new Oficina();
            oficina = oficinasPre.get(i);
            ofiView.add(oficina.getListView());
            list_sql.setItems(ofiView);
        }    
    }    

    @FXML
    public void switchToSecundary(ActionEvent event) throws IOException {
       /* 
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/presentacion/secondary.fxml"));
       Parent root= loader.load();
       SecondaryController controller = loader.getController();
       Scene scene = new Scene(root);
       Stage stage = new Stage();
       stage.setScene(scene);
       controller.getCode(txtCodi.getText());
       controller.initialize(url, rb);
       stage.show();
       stage.close();
        
            int num = Integer.parseInt(txtCodi.textProperty().toString());
            Oficina office = oficinasPre.get(num);
 */
       //getCode();
       //App.setRoot("secondary");
       System.out.print(txtCodi.getText());
       FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
       
       Stage stage = new Stage();
       stage.setScene(new Scene(loader.load()));
       
       SecondaryController controller = loader.getController();
       controller.setCode(txtCodi.getText());
       
       controller.setEmpleats();
       
       stage.show();
    }
    public String actualizaValor(){
        //return OfficeData.code = txtCodi.getText();
        return null;
    }

    @Override
    public String getCode() {
        //return OfficeData.code = txtCodi.getText();
        return null;
    }

    @Override
    public void setCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
