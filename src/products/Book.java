package products;

public class Book extends Product {

		private String author;
		
		public Book(){
			
			super();
			author= "";
			count++;
			
		}//Book
		
		public void setAuthor(String author){
			this.author = author;
		}//setAuthor
		
		public String getAuthor(){
			return author;
		}//setAuthor
	
		@Override
		public String toString(){
			
			String message = super.toString() + "Author:		" + author + "\n";
			return message;
			
		}//toString
}//ClassBook
