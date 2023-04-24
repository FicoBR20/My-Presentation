package Principal;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class GUIPresentation extends JFrame {
    private Escucha escucha;
    private JButton myPhoto, myHobby, myExpectations;
    private Title title;// Clase creada en el contenerdor, extiende JLabel
    private JPanel containerButtons, containerImage;
   // private Listener listener;

    //  private JLabel imageLabel;

    private JLabel imageLabel;

    private JTextArea expecativesText;

    //CONSTRUCTOR ; Frame general setup; include initGUI function (attributes initials values.
    // layout, listeners )

    public GUIPresentation() {// Jframe general setup; include initGUI function (initials values
        initGUI();
        this.setTitle("My Presentatioin");
        this.setSize(688, 488);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // fUNCTION INITGUI -> ASSIGN INITIALS VALUES TO ALL ATTRIBUTES, RUN INTO CONSTRUCTOR
    private void initGUI() {
        escucha = new Escucha();
        title = new Title("Hi, my name is federico, click at the buttoms to know me a little.", Color.BLUE);
        myPhoto = new JButton("My Photo");
        myHobby = new JButton("My hobbies");
        myExpectations = new JButton("My expectations ");
        containerButtons = new JPanel();
        containerImage = new JPanel();
        //listener = new Listener();
        imageLabel = new JLabel();
        expecativesText = new JTextArea(10, 12);

        containerImage.setBorder(BorderFactory.createTitledBorder(null, "..some about me...",
                TitledBorder.CENTER, TitledBorder.DEFAULT_JUSTIFICATION,
                new Font(Font.MONOSPACED, Font.PLAIN, 20), Color.BLACK));
        containerImage.add(imageLabel);


        containerButtons.add(myPhoto);
        containerButtons.add(myHobby);
        containerButtons.add(myExpectations);

        myPhoto.addMouseListener(escucha);
        myHobby.addMouseListener(escucha);
        myExpectations.addKeyListener(escucha);

       // myPhoto.addActionListener(listener);
        //myHobby.addActionListener(listener);
        //myExpectations.addActionListener(listener);

        //this refers a JFrame setup
        this.add(title, BorderLayout.NORTH);
        this.add(containerButtons, BorderLayout.SOUTH);
        this.add(containerImage, BorderLayout.CENTER);


    }

    // MAIN --> FUNCTION TO LAUNCH THE APP.


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUIPresentation myGUI = new GUIPresentation();
            }
        });
    }

    /*
        private class Listener implements ActionListener{
            private ImageIcon image;

            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Button pressed");

                // Para limpiar las imageenes del frame se adocopmam estas dps lineas.
                imageLabel.setIcon(null);
                containerImage.remove(expecativesText);

                if (e.getSource()==myPhoto){
                    System.out.println("Photo Button Pressed");
                    this.image = new ImageIcon(getClass().getResource("/Images/meeandaugther.png"));
                    imageLabel.setIcon(image);
                } else if (e.getSource() == myHobby) {
                    this.image= new ImageIcon(getClass().getResource("/Images/MyHobbies.png"));
                    imageLabel.setIcon(image);
                } else {
                    expecativesText.setText("\n" +
                            "Espero aprovechar el curso al maximo a fin de entender\n" +
                            " a profundidad el manejo de los eventos en la programacion.\n\n\n"+ " Mi contacto " +
                            "es federico.barbetti@correounivalle.edu.co");
                    expecativesText.setBackground(null);
                    expecativesText.setForeground(Color.BLACK);
                    containerImage.add(expecativesText);
                }
                revalidate();
                repaint();
            }

        }
    */
    private class Escucha implements MouseListener, KeyListener, ActionListener {

        private ImageIcon image;

        @Override
        public void keyTyped(KeyEvent e) {


        }

        @Override
        public void keyPressed(KeyEvent e) {


        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            imageLabel.setIcon(null);
            this.image = new ImageIcon(getClass().getResource("/Images/meeandaugther.png"));
            imageLabel.setIcon(image);
            repaint();
            if (e.getSource()==myHobby & e.getClickCount()>1){
                this.image = new ImageIcon(getClass().getResource("/Images/MyHobbies.png"));
                imageLabel.setIcon(image);
                repaint();

            }

            // mensaje.append("mouseClick fue detectado\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // panelMouse.setBackground(Color.blue);

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // panelMouse.setBackground(Color.red);

        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}

