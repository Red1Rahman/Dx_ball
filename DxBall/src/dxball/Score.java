
package dxball;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Score {
    int lives=3;
    Text tLife = new Text(550, 30, "Life:");
    Text score = new Text(20, 30, "Score:");
    ArrayList<Circle> balls = new ArrayList<Circle>();
    Score()
    {
        tLife.setId("life");
        score.setId("score");
        for(int i = 0; i<lives; i++)
        {
            Ball bShape = new Ball(620+i*22, 23);
            Circle ball = bShape.getBall();
            balls.add(ball);
        }
    }
    Group setExtras(Group g)
    {
        for(Circle c : balls){
            g.getChildren().add(c);
        }
        g.getChildren().addAll(tLife, score);
        return g;
    }
}
