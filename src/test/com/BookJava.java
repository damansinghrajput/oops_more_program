package test.com;

import java.util.ArrayList;

public class BookJava {
	
	private String name;
	private int id;
	private String author;
	private ArrayList<Review>reviews= new ArrayList<>();
	
	 BookJava(int id , String name, String author){
		 this.name = name;
		 this.id = id;
		 this.author= author;
		 
		 
	 }
	 
	 void addreview(Review review) {
		 
		 
		 this.reviews.add(review);
	 }

	 public String toString() {
		 return  String.format("id: %d, name: %s , author: %s, reviews=[%s]",id ,name ,author,reviews);
	 }
	 
	 
}
