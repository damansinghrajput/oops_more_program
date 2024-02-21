package test.com;

public interface ComplexAlogrithm {
	
	int complexAlogrthim(int num1,int num2); 
		
		
	}



 class  DummyAlogrithm implements  ComplexAlogrithm {

	@Override
	public int complexAlogrthim(int num1, int num2) {
		
		return num1+num2;
	}
	
	
 }
 
 class realAlogritm implements ComplexAlogrithm {

	@Override
	public int complexAlogrthim(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}
	 
	 
	 
	 
 }
 
 
 
 
