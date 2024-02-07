
public class ExceptionMain {

	public static void main(String[] args) {
		/* 예외처리 기본정리(try ~ catch ~finally
		String [] strAry = {"SW", "java", "python"};
		try {
			System.out.println("예외 발생 코드 시작");
			for (int idx = 0; idx < strAry.length; idx++) {
				System.out.println(strAry[idx]);
			}
			System.out.println("예외 발생 코드 종료");
		} catch(Exception e) { // 예외 발생시 수행되는 영역
			// System.out.println("예외 발생시 호출되는 영역");
			e.printStackTrace();
		} finally { // 예외 발생 여부와 상관없이 항상 수행
			System.out.println("예외 발생 여부와 상관없이 항상 수행");
		}
		System.out.println(">>> main method end <<<");
		*/
		try {
			int result = userException();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>> main method end <<<");
		
	}

	public static int userException() throws ArithmeticException { // throws 는 예외를 던짐.
		int result = 10 / 0;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
}
