package test;

//test push
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.HTMLEditor;


public class NoteTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        primaryStage.setTitle("Hello World");
        HTMLEditor htmlEditor = new HTMLEditor();
        String htmlText = "<b>Bold text</b>";
        htmlEditor.setHtmlText(htmlText);
        String htmlTextEdited = htmlEditor.getHtmlText();
        System.out.println(htmlTextEdited);
        primaryStage.setScene(new Scene(root, 1920, 1080));
        primaryStage.show();

    }
    /*
     * public static void main(String[] args) { launch(args); }
     */
}