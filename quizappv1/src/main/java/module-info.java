module com.dtht.quizappv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dtht.quizappv1 to javafx.fxml;
    exports com.dtht.quizappv1;
}
