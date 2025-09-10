import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Color;

public class JListCardLayout extends JFrame{

    CardLayout cardLayout = new CardLayout();

    // Declaration of JPanel
    JPanel mainPanel = new JPanel(cardLayout);
    JPanel card1 = new JPanel();
    JPanel card2 = new JPanel();
    JPanel card3 = new JPanel();
    JButton btn1 = new JButton("Go to card2");
    JButton btn2 = new JButton("Go to card3");
    JButton btn3 = new JButton("Go to card1");

    // Creation of the JListCardLayout
    JListCardLayout() {
        addBtn();
        mainPanelAdd();
        background();
        actionListener();

        //Creation of the Background
        add(mainPanel);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // The creation of the addBtn method
    public void addBtn(){
        card1.add(btn1);
        card2.add(btn2);
        card3.add(btn3);
    }

    //The creation of the method mainPanelAdd
    public void mainPanelAdd(){
        mainPanel.add(card1, "card1");
        mainPanel.add(card2, "card2");
        mainPanel.add(card3, "card3");
    }

    //The creation of the method background
    public void background(){
        card1.setBackground(Color.blue);
        card2.setBackground(Color.red);
    }

    //The creation of the method actionListener
    public void actionListener(){

        btn1.addActionListener((e) ->{
            cardLayout.show(mainPanel, "card2");
        });

        btn2.addActionListener((e) ->{
            cardLayout.show(mainPanel, "card3");
        });

        btn3.addActionListener((e) ->{
            cardLayout.show(mainPanel, "card1");
        });
    }


    public static void main(String[] args){
        new JListCardLayout();
    }
}