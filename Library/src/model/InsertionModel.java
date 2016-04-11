package model;

/**
 * Class to access the database.
 * Here will be implemented the action to insert on all the tables of the database
 * @author luiz
 *
 */
public class InsertionModel {
	/**
	 * Here will access the database to insert a book.
	 * @param author, the author of the book.
	 * @param title, the title of the book.
	 */
	public static boolean insertBook(String author, String title) {
		
		// Before to insert we have to select the id of the author inside the database
		int idAuthor = SelectionModel.selectIdAuthor(author);
		
		// TODO the CRUD of insert book with idAuthor and title.
		
		return true;
	}
}