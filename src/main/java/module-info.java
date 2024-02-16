module com.example.documentcreator {
    requires javafx.controls;
    requires javafx.fxml;
    requires docx4j.search.and.replace.util;
    requires org.docx4j.core;

    opens com.example.documentcreator to javafx.fxml;
    exports com.example.documentcreator;
}