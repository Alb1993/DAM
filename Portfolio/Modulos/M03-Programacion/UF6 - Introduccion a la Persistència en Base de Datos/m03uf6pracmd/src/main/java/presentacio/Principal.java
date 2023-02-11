package presentacio;

import aplicacio.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * 
 * @author D
 * @version 1.0
 * 
 * Pantalla principal
 */

public class Principal {

    @FXML
    private Button btn_clientes; // Abrir pantalla clientes

    @FXML
    private Button btn_comandas; // Abrir pantalla comandas

    @FXML
    private Button btn_productos; // Abrir pantalla productos

    @FXML
    private Button btn_salir; // Cerrar aplicación

    @FXML
    void onClickClientes(ActionEvent event) throws IOException {
        
    }

    @FXML
    void onClickComandas(ActionEvent event) throws IOException {
        App.setRoot("comandas");
    }

    @FXML
    void onClickProductos(ActionEvent event) throws IOException {
        App.setRoot("productos");
    }

    @FXML
    void onClickSalir(ActionEvent event) {
        System.exit(0);
    }

}
