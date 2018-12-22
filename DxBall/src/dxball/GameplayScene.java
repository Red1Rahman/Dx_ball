
package dxball;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class GameplayScene {
    Scene getScene()
    {
        Pane root = new Pane(); 
        Group group = new Group();
        root.getChildren().add(group);
        group.setId("group");
        Panel pShape = new Panel(300, 500);
        Rectangle panel = pShape.getPanel();
        Ball bShape = new Ball(360, 490);
        Circle ball = bShape.getBall();
        Bricks rShape = new Bricks(70, 90);
        ArrayList<Rectangle> bricks = rShape.getBricks();
        for(Rectangle r : bricks){
            group.getChildren().add(r);
        }
        Score score = new Score();
        group = score.setExtras(group);
        group.getChildren().addAll(panel, ball);
        Scene scene = new Scene(root, 720, 540);
        scene.getStylesheets().add(DxBall.class.getResource("Gameplay.css").toExternalForm());
        return scene;
    }
}
