/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package presentacion;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import modelo.Empleado;
import presentacion.App;
/**
 * FXML Controller class
 *
 * @author Albert
 */
public class SecondaryController implements Initializable {

    @FXML
    private ListView<String> list_empleats;
    @FXML
    private Button btn_return;
    private String ofiCode;
    public ArrayList<Empleado> empleadosPre;
    
    ObservableList<String> empView = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void switchToPrimary(ActionEvent event) throws IOException {
        App.setRoot("primary");
    }
    
    public String getCode() {
        return this.ofiCode;
    }
    
    public void setCode(String code) {
        this.ofiCode = code;
    }
    
    public void setEmpleats() {
        try {
            Empleado empleado;
            this.empleadosPre = aplicacion.LogicaEmpleado.getEmpleado(this.ofiCode);
            
            for(int i=0; i<this.empleadosPre.size(); i++) {
                empleado = this.empleadosPre.get(i);
                this.empView.add(empleado.getListView());
                this.list_empleats.setItems(this.empView);
            }
        } catch(SQLException ex) {
            Logger.getLogger(SecondaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}