public class ClassB {
	public ClassB(){
	}
	public int add_number_to_hundred(){
		int result=0;
		ClassA A = new ClassA();
		for( int i = 0; i<100; i++){
			result+= A.secret_number();
		}
		return result;
	}
	
	public boolean calculate_true_or_false(String name){
		String fruit="orange";
		ClassA A = new ClasA();
		if(fruit.equals(name)){
			return A.return_true();
		}
		else{
			return !A.return_true();
		}
	}
}
