package demo.except;

public class UserDefinedDemo {

	public static void main(String[] args) throws SessionElevenCustomException {
		
		throw new SessionElevenCustomException("Throwing for the first time.");

	}

}
