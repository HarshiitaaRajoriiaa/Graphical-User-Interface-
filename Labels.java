import java.awt.*; //for color handling
import javax.swing.*; //for frame handling

public class Labels {
    public static void main(String[] args) {
        //frame for displaying labels:
        JFrame frame = new JFrame("Labels Example"); //can give title here too
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500); //can give size here too
        frame.getContentPane().setBackground(Color.lightGray);

        //*Label
        JLabel label = new JLabel("bro do you even code?");
        //setting image in label:
        ImageIcon image = new ImageIcon("java.png");
        label.setIcon( image);
        label.setHorizontalTextPosition(JLabel.LEFT); //left  side of the respected image
        label.setVerticalTextPosition(JLabel.BOTTOM); // bottom side of the  respected  image 










        frame.add(label); //added label to frame
        frame.setVisible(true);

    }
}


