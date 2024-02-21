package test.com;

public class Review {
	
	private String description;
	private int id;
	private int rating;

	 Review(int id , String description , int rating){
		 
		 this.description=description;
		 this.rating=rating;
		 this.id=id;
	 }

	 public String toString() {
		 return id+""+description+""+rating;
		 
		 
	 }
	 
	 
}
