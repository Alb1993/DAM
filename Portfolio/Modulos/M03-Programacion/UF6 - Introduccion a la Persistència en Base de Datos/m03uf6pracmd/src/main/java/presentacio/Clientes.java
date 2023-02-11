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
 * Pantalla clientes
 */

public class Clientes {

    @FXML
    private Button btn_add; // Añadir cliente

    @FXML
    private Button btn_atras; // Volver a la pantalla principal

    @FXML
    private Button btn_delete; // Borrar cliente

    @FXML
    private Button btn_edit; // Modificar cliente

    @FXML
    void onClickAdd(ActionEvent event) throws IOException {

    }

    @FXML
    void onClickAtras(ActionEvent event) throws IOException {
        App.setRoot("principal");
    }

    @FXML
    void onClickDelete(ActionEvent event) throws IOException {

    }

    @FXML
    void onClickEdit(ActionEvent event) throws IOException {

    }

}
