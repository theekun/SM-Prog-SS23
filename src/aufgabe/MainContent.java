package aufgabe;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainContent extends JPanel {
	
	public MainContent() {
		
		// Hier können Sie den Inhalt Ihres Panels definieren
		
		// Menüleiste erstellen
        JMenuBar menuBar = new JMenuBar();
        this.add(menuBar);

        // Menüs erstellen
        JMenu testMenu = new JMenu("Test");
        menuBar.add(testMenu);

        JMenu dataMenu = new JMenu("Daten");
        menuBar.add(dataMenu);

        JMenu fileMenu = new JMenu("Datei");
        menuBar.add(fileMenu);

        // Menüelemente erstellen
        JMenuItem newTest = new JMenuItem("Neuer Test");
        testMenu.add(newTest);

        JMenuItem startTest = new JMenuItem("Test starten");
        testMenu.add(startTest);

        JMenuItem readData = new JMenuItem("Daten einlesen");
        dataMenu.add(readData);

        JMenuItem saveTests = new JMenuItem("Tests speichern");
        fileMenu.add(saveTests);

        JMenuItem loadTests = new JMenuItem("Tests laden");
        fileMenu.add(loadTests);

        JMenuItem changeName = new JMenuItem("Testnamen ändern");
        fileMenu.add(changeName);

        JMenuItem printTest = new JMenuItem("Test ausdrucken");
        fileMenu.add(printTest);

        JMenuItem exitApp = new JMenuItem("Anwendung beenden");
        fileMenu.add(exitApp);

        // Button-Leiste erstellen
        JPanel buttonPanel = new JPanel(new FlowLayout());
        this.add(buttonPanel, BorderLayout.SOUTH);

        JButton startButton = new JButton("Test starten");
        buttonPanel.add(startButton);

        JButton readButton = new JButton("Daten einlesen");
        buttonPanel.add(readButton);

        JButton exitButton = new JButton("Anwendung beenden");
        buttonPanel.add(exitButton);

        // Füge hier ComboBox ein
        JComboBox<String> testComboBox = new JComboBox<String>();
        this.add(testComboBox, BorderLayout.SOUTH);
		
        // Elemente der ComboBox hinzufuegen
        testComboBox.addItem("Test1");
        testComboBox.addItem("Test 2");
		
    }

}
