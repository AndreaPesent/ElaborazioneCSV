module com.example.elaborazionecsv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.elaborazionecsv to javafx.fxml;
    exports com.example.elaborazionecsv;
}