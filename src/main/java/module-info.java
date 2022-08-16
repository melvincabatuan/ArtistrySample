module ph.edu.dlsu.lbycpei.artistrysample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ph.edu.dlsu.lbycpei.artistrysample to javafx.fxml;
    exports ph.edu.dlsu.lbycpei.artistrysample;
}