module ni.edu.uam.pvp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.pvp to javafx.fxml;
    exports ni.edu.uam.pvp;
}