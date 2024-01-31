import com.encore.staticdemo.StaticDemo;

public class StaticMain {
	
	public static void main(String[] args) {
		
		
		// lombok annotaion 활용한 호출
		StaticDemo demo01 = new StaticDemo("jslim");
		System.out.println(demo01.getName());
		demo01.staticMsg = "demo01 msg" ; 
				
		StaticDemo demo02 = new StaticDemo("encore");
		System.out.println(demo02.getName());
		demo02.staticMsg = "demo02 msg" ;
		
		System.out.println(demo01.staticMsg); 
		
		// staticMethod() 인스턴스 소유가 아닌 클래스 소유이므로 클래스 이름으로 접근 가능 
		// StaticDemo.nonStatic(); - error 
		StaticDemo.staticMethod() ;  
		
		
		
	}
	
}


