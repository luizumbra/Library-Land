package view;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RegisterBookView extends JFrame {
	// Labels
	private JLabel authorLabel;
	private JLabel bookTitleLabel;
	
	// Text Fields
	private JTextField authorTextField;
	private JTextField bookTitleTextField;
	
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
		
		// Author Components
		authorLabel = new JLabel("Autor: ", SwingConstants.RIGHT);
		authorTextField = new JTextField();
		
		// Book Title Components
		bookTitleLabel = new JLabel("Título: ");
		bookTitleTextField = new JTextField();
		
		// Register Button
		registerButton = new JButton("Cadastrar");
		registerButton.addActionListener(new RegisterAction());
		
		// Add on the grid
		add(authorLabel, new GBC(0, 0).setAnchor(GBC.EAST));
		add(authorTextField, new GBC(1, 0).setFill(GBC.HORIZONTAL).setWeight(100, 0).setInsets(1));
		add(bookTitleLabel, new GBC(0, 1).setAnchor(GBC.EAST));
		add(bookTitleTextField, new GBC(1, 1).setFill(GBC.HORIZONTAL).setWeight(100, 0).setInsets(1));
		add(registerButton, new GBC(0, 2, 2, 1).setAnchor(GBC.CENTER).setWeight(100, 100));
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
			
		}
		
	}
}
