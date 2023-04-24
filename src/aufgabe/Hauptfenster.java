package aufgabe;

import javax.swing.JFrame;

public class Hauptfenster {
	
	public static void main(String[] args) {
		
        JFrame frame = new JFrame("Meine Anwendung");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MainContent content = new MainContent();
        frame.setContentPane(content);
        
        frame.setVisible(true);
    }
}


