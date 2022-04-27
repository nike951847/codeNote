
/*
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class Html extends Application {
	private HTMLEditor htmlEditor;
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {

        HTMLEditor htmlEditor = new HTMLEditor();

        String htmlText = "<b>Bold text</b>";
        htmlEditor.setHtmlText(htmlText);

        String htmlTextEdited = htmlEditor.getHtmlText();
        System.out.println(htmlTextEdited);
		Stage newStage = new Stage();



        VBox vBox = new VBox(htmlEditor);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX App");

        primaryStage.show();
    }
}*/
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.event.ActionEvent;
public class Html extends Application {
   Button btnscene1, btnscene2;
   Label lblscene1, lblscene2;
   FlowPane pane1, pane2;
   Scene scene1, scene2;
   Stage thestage, newStage;
   HTMLEditor htmlEditor;
   @Override
   public void start(Stage primaryStage) {
     thestage=primaryStage;
	 htmlEditor = new HTMLEditor();
     btnscene1=new Button("Click to go to Other Scene");
     btnscene2=new Button("Click to go back to First Scene");
     btnscene1.setOnAction(e-> ButtonClicked(e));
     btnscene2.setOnAction(e-> ButtonClicked(e));
     lblscene1=new Label("Scene 1");
     lblscene2=new Label("Scene 2");
     pane1=new FlowPane();
     pane2=new FlowPane();
     pane1.setHgap(20);
     pane2.setVgap(10);
     pane1.setStyle("-fx-background-color:tan;-fx-padding:10px;");
     pane2.setStyle("-fx-background-color:red;-fx-padding:10px;");
     pane1.getChildren().addAll(lblscene1, btnscene1);
     pane2.getChildren().addAll(lblscene2, btnscene2,htmlEditor);
     scene1 = new Scene(pane1, 200, 100);
     scene2 = new Scene(pane2, 200, 100);
     newStage = new Stage();
     newStage.setScene(scene2);
     newStage.initModality(Modality.APPLICATION_MODAL);
     newStage.setTitle("Pop up window");
     
     primaryStage.setTitle("Hello World!");
     primaryStage.setScene(scene1);
     primaryStage.setMinWidth(300);
     primaryStage.show();
}
public void ButtonClicked(ActionEvent e)
 {
     if (e.getSource()==btnscene1)
         newStage.showAndWait();
     else{
		 newStage.close();
		 System.out.print(htmlEditor.getHtmlText());
	 }
 }
}