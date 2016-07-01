package model;

/**
 * Class to access the database.
 * Here will be implemented the action to insert on all the tables of the database
 * @author luiz
 *
 */
public class InsertionModel {
	private static int b;
	
	/**
	 * Here will access the database to insert a book.
	 * @param author, the author of the book.
	 * @param title, the title of the book.
	 */
	public boolean insertBook(String author, String title) {
		
		b = 10;
		
		// Before to insert we have to select the id of the author inside the database
		@SuppressWarnings("unused")
		int idAuthor = SelectionModel.selectIdAuthor(author);
		
		// TODO the CRUD of insert book with idAuthor and title.
		
		return true;
	}
}