package test.com;

public class BookRun {

	public static void main(String[] args) {
		BookJava run = new BookJava(123,"java","ranga");
		run.addreview(new Review(10 ," Great Book ",5));
		System.out.println(run);
	}

}
