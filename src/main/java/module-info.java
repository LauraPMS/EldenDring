module sio.vfeldenring {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.vfeldenring to javafx.fxml;
    exports sio.vfeldenring;
}