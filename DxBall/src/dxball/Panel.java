
package dxball;

import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;

public class Panel extends Shapes{
    int width = 120, height = 18;
    Panel(int x, int y)
    {
        super(x, y);
    }
    Rectangle getPanel()
    {
        Rectangle panel = new Rectangle(x, y, width, height);
        Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.DARKSLATEGRAY)};
        LinearGradient l = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops);
        panel.setStroke(Color.BLACK);
        panel.setArcHeight(10);
        panel.setArcWidth(10);
        panel.setFill(l);
        return panel;
    }
}
