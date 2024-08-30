//? what is JFrames = GUI window to add components in later on.
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JFrame; // * implements JFrame interface



//! WAY ONE OF MAKING FRAME IN JAVA : importing interface and making it available inside main and more........
public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //cerates a frame
        frame.setTitle("testing JFrames");
        frame.setSize(550,550);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //defaults setting is HIDE_ON_CLOSE, and application used to keep run in the background
        /*
        * Exit = EXIT_ON_CLOSE
        * Hide = HIDE_ON_CLOSE = close the frame but keep the application running
        * DISPOSE_ON_CLOSE = close the frame and also dispose of all its components
        * DO_NOTHING_ON_CLOSE = do nothing when close button is clicked, application still runs
         */

        frame.setResizable(false); //can't resize the frame
         //todo setting image as icon
        ImageIcon imageIcon = new ImageIcon("java.png");
        frame.setIconImage(imageIcon.getImage());
        //color
        frame.getContentPane().setBackground(Color.green); // by name
        frame.getContentPane().setBackground(new Color(21,  21 , 21 )); //by rgb color
        frame.getContentPane().setBackground(new Color(255,  0 , 21 )); //from range 0 to 255
        frame.getContentPane().setBackground(new Color(123,  50 , 250 ));  //random 
        frame.getContentPane().setBackground(new Color(0x123456)); //hexadecimal values //good color


         //todo visibility of frame
        frame.setVisible(true);
     
    }
    
}


//! WAY II OF MAKING FRAMES IS JAVA : extending JFrame class and making code reusable  *good method
// *NOTE: i commented out, you can use way I and way II of MAKING FRAMES separately
// public class Frame extends JFrame{
//         Frame(){
//                 this.setTitle("frame by extending JFrame interface");
//                 this.setVisible(true);
//                 this.getContentPane().setBackground(new Color(0x23456 ));
//                 this.setSize(550,550);
//                 this.setResizable(true);
//                 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                 ImageIcon image = new ImageIcon("java.png");
//                 this.setIconImage(image.getImage());
//         }
//         public static void main(String[] args) {
//                 Frame frame2 = new Frame();
//                 Frame frame3 = new Frame();
//                 new Frame();
//                // so many frames can make by this method

                
//         }
// }
