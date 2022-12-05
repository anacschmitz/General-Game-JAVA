module br.com.general.generalgames {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.general.generalgames to javafx.fxml;
    exports br.com.general.generalgames;
}