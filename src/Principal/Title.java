package Principal;

import javax.swing.*;
import java.awt.*;

public class Title extends JLabel {
    public Title(String title, Color backgroundcolor){
        this.setText(title);
        this.setBackground(backgroundcolor);
        this.setForeground(Color.white);
        this.setFont(new Font( "Calibre",Font.BOLD+Font.ITALIC,18));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setOpaque(true);
    }

}
