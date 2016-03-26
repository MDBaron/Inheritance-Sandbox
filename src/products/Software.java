package products;

public class Software extends Product{
	private String version;
	
	public Software(){
		
		super();
		version= "";
		count++;
		
	}//Book
	
	public String getVersion(){
		return version;
	}//setversion
	
	public void setVersion(String version){
		this.version = version;
	}//setversion

	@Override
	public String toString(){
		
		String message = super.toString() + "Version:	" + version + "\n";
		return message;
		
	}//toString
}
