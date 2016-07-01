package view;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.RegisterControl;

@SuppressWarnings("serial")
public class RegisterBookView extends JFrame {
	// Labels
	private JLabel isbnLabel;
	private JLabel authorLabel;
	private JLabel bookTitleLabel;
	private JLabel editorLabel;
	private JLabel publicationDateLabel;
	private JLabel categoryLabel;
	private JLabel pagesLabel;
	private JLabel abstractLabel;
	
	// Text Fields
	private JTextField isbnTextField;
	private JTextField authorTextField;
	private JTextField bookTitleTextField;
	private JTextField editorTextField;
	private JTextField publicationDateTextField;
	private JTextField pagesTextField;
	
	// Combo box
	private JComboBox<String> categoryComboBox;
	
	// Text Area
	private JTextArea abstractTextArea;
	
	// Buttons
	private JButton registerButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterBookView frame = new RegisterBookView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterBookView() {
		// Features Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("Cadastrar Livro");
		
		// Grid Bag Layout
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		
		// ISBN Components
		isbnLabel = new JLabel("ISBN: ");
		isbnTextField = new JTextField();
		
		// Author Components
		authorLabel = new JLabel("Autor: ");
		authorTextField = new JTextField();
		
		// Book Title Components
		bookTitleLabel = new JLabel("Título: ");
		bookTitleTextField = new JTextField();
		
		// Editor
		editorLabel = new JLabel("Editor: ");
		editorTextField = new JTextField();
		
		// Publication Date Component
		publicationDateLabel = new JLabel("Data: ");
		publicationDateTextField = new JTextField();
		
		// Category Component
		categoryLabel = new JLabel("Categoria: ");
		categoryComboBox = new JComboBox<String>(new String[] {"Romance", "Aventura"});
		
		// Pages Component
		pagesLabel = new JLabel("Nº Páginas: ");
		pagesTextField = new JTextField();
		
		// Abstract Component
		abstractLabel = new JLabel("Resumo: ");
		abstractTextArea = new JTextArea();
		abstractTextArea.setLineWrap(true);
		abstractTextArea.setBorder(BorderFactory.createEtchedBorder());
		
		
		// Register Button
		registerButton = new JButton("Cadastrar: ");
		registerButton.addActionListener(new RegisterAction());
				
		// Add on the grid
		add(isbnLabel, new GBC(0, 0).setAnchor(GBC.WEST));
		add(isbnTextField, new GBC(1, 0).setFill(GBC.HORIZONTAL));
		add(authorLabel, new GBC(0, 1).setAnchor(GBC.WEST));
		add(authorTextField, new GBC(1, 1).setFill(GBC.HORIZONTAL));
		add(bookTitleLabel, new GBC(0, 2).setAnchor(GBC.WEST));
		add(bookTitleTextField, new GBC(1, 2).setFill(GBC.HORIZONTAL));
		add(editorLabel, new GBC(0, 3).setAnchor(GBC.WEST));
		add(editorTextField, new GBC(1, 3).setFill(GBC.HORIZONTAL));
		add(publicationDateLabel, new GBC(0, 4).setAnchor(GBC.WEST));
		add(publicationDateTextField, new GBC(1, 4).setFill(GBC.HORIZONTAL));
		add(categoryLabel, new GBC(0, 5).setAnchor(GBC.WEST));
		add(categoryComboBox, new GBC(1, 5).setFill(GBC.HORIZONTAL));
		add(pagesLabel, new GBC(0, 6).setAnchor(GBC.WEST));
		add(pagesTextField, new GBC(1, 6).setFill(GBC.HORIZONTAL));
		add(abstractLabel, new GBC(2, 0).setAnchor(GBC.WEST));
		add(abstractTextArea, new GBC(2, 1, 10, 7).setFill(GBC.BOTH));
		add(registerButton, new GBC(0, 7, 2, 1).setAnchor(GBC.CENTER));
	}

	/**
	 * Private class to implement the register book action
	 * @author luiz
	 *
	 */
	private class RegisterAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Call the controller to Register
			RegisterControl.registerBook(author, title)
		}
		
	}
}
