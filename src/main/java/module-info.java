module fr.negosud.bacchus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens fr.negosud.bacchus to javafx.fxml;
    exports fr.negosud.bacchus;
}