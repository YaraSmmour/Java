import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.File;

		public class Yara0202841  extends Application {
			public  int x1=200;
			public int y1=165;
			public int x2=200;
			public int y2=180;

			public static void main(String[] args) { 
			launch(args);	
			}

			
			public void start(Stage ps) {
				ps.setTitle("JavaFx");
				Label l1 = new Label("Yara Sameer Abu Sammour");
				Label l2 = new Label("0202841");
				Button b = new Button ("Show my Photo");
				Button b1 = new Button ("  Up  ");
				Button b2= new Button ("Down");
				Button b3 = new Button ("Left");
				Button b4 = new Button ("Right");
				
			Pane p1 = new Pane ();
			p1.getChildren().add(l1);
			l1.setLayoutX(200);
			l1.setLayoutY(165);
			p1.getChildren().add(l2);
			l2.setLayoutX(200);
			l2.setLayoutY(180);
			p1.getChildren().add(b);
			b.setLayoutX(200);
			b.setLayoutY(200);
			p1.getChildren().add(b1);
			b1.setLayoutX(70);
			b1.setLayoutY(0);
			p1.getChildren().add(b2);
			b2.setLayoutX(70);
			b2.setLayoutY(50);
			p1.getChildren().add(b3);
			b3.setLayoutX(20);
			b3.setLayoutY(25);
			p1.getChildren().add(b4);
			b4.setLayoutX(125);
			b4.setLayoutY(25);
			Scene s1 = new  Scene(p1,500,500);
			ps.setScene(s1);
			ps.show();
			
				Image m = new Image(new File("mine.jpeg").toURI().toString());
				ImageView v = new ImageView (m);
				BorderPane p2 = new BorderPane (v);
				
				Scene s2 = new Scene(p2,700,700); 
				Stage a = new Stage ();
				a.setTitle("My photo");
				a.setScene(s2);
			
				
				b.setOnAction(e->a.show());
				b1.setOnAction(e-> { l1.setLayoutY(y1--); l2.setLayoutY(y2--) ; });
				b2.setOnAction(e-> { l1.setLayoutY(y1++); l2.setLayoutY(y2++) ;});
				b3.setOnAction(e-> { l1.setLayoutX(x1--); l2.setLayoutX(x2--) ;});
				b4.setOnAction(e-> {l1.setLayoutX(x1++); l2.setLayoutX(x2++) ;});
				
				
				
			
		}
	}

 
