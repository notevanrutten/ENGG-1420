package animationplayer;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class Effect {
    
    String effectType;
    Node node;
    
    int start;
    int x, y;
    Color color, borderColor;
    
    public Effect (Node node) {
        
        this.node = node;
        
    }
    
}
