package aufgabe;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainContent extends JPanel {

    private GenericTest[] tests; // Array fuer 10 Objekte des Typs GenericTest
    private int numTests; // zaehler
    private GenericTest currentTest; //referenz zum aktuellen test
	
	public MainContent() {
        tests = new GenericTest[10];
        numTests = 0;
        currentTest = null;
        addComponents();
    
    }	

    // methode um die inhalte dem panel hinzuzufuegen
    private void addComponents() {
        
        // Hier werden die Inhalte meines Panels definiert
		
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

        // Füge hier ComboBox ein
        JComboBox<String> testComboBox = new JComboBox<String>();
        add(testComboBox, BorderLayout.SOUTH);
        
		
        // Elemente der ComboBox hinzufuegen
        //testComboBox.addItem("Test1");
        //testComboBox.addItem("Test 2");

        // Menüelemente erstellen
        JMenuItem newTest = new JMenuItem("Neuer Test");
        testMenu.add(newTest);

        newTest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (numTests < tests.length) {
                    if (numTests % 2 == 0) {
                        tests[numTests] = new FitnessTest("Test " + (numTests + 1));
                    } else {
                        tests[numTests] = new SchellongTest("Test " + (numTests + 1));
                    }
                    currentTest = tests[numTests];
                    testComboBox.addItem(currentTest.getName());
                    numTests++;
                    repaint();
                    
                }
            }
        });

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

        exitApp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);

            }
        }); 

        // Button-Leiste erstellen
        JPanel buttonPanel = new JPanel(new FlowLayout());
        this.add(buttonPanel, BorderLayout.SOUTH);

        JButton startButton = new JButton("Test starten");
        buttonPanel.add(startButton);


        JButton readButton = new JButton("Daten einlesen");
        buttonPanel.add(readButton);

        JButton exitButton = new JButton("Anwendung beenden");
        buttonPanel.add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });	
    }
    // method to get reference to current test
    public GenericTest getCurrentTest() {
        return currentTest;
    }

}
