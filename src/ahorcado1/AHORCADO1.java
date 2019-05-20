package ahorcado1;

import javax.swing.JFrame;

/**
 *
 * @author Erik
 */
public class AHORCADO1 {

    
    public static void main(String[] args) {
        
        Ahorpanel par= new Ahorpanel();
        par.setBounds(0,0,620,620);
        par.setVisible(true);
        par.setResizable(false);
        par.setLocationRelativeTo(null);
        par.setTitle("Ahorcado");
        par.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
