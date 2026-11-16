import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.Date;
 
public class GUI extends JFrame { 
    public GUI(String title) { 
        super(title); 
        setSize(500, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        JPanel content = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Font f = new Font("Times New Roman", Font.BOLD, 20); 
                g.setColor(Color.cyan); 
                g.fillRect(0, 0, 800, 600); 
                g.setFont(f); 
                g.setColor(Color.yellow); 
                g.fillRect(10, 10, 440, 60); 
                g.setColor(Color.pink); 
                g.fillRect(10, 90, 440, 60); 
                g.setColor(Color.blue); 
                g.drawString("Welcome to Java Graphics", 20, 40); 
                g.drawString("Today is " + new Date(), 20, 120); 
            }
        };

        content.setBackground(Color.white); 
        content.setLayout(new FlowLayout()); 
        content.add(new JLabel("Hello world!"));
        content.add(new JLabel("This is my first GUI application"));
        setContentPane(content);
    }
    
    public static void main(String args[]) { 
        JFrame nframe = new GUI("This is a GUI application"); 
        nframe.setVisible(true);  
    }
}