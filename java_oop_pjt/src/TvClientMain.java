import java.awt.image.SampleModel;

import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.factory.TvBeanFactory;
import com.encore.tv.util.TV;

public class TvClientMain {

	public static void main(String[] args) {
		/*
		 * SamsungTV tv = new SamsungTV(); 
		 * tv.powerOn();
		 */
		
		/*
		 * LgTV tv = new LgTV(); 
		 * tv.turnOn();
		 */
		
		/*
		 * TV tv = new LgTV(); tv.turnOn();
		 */
		
		TvBeanFactory factory01 = TvBeanFactory.getInstance();
		System.out.println(factory01);
		
		TV tv = factory01.getBean("lg");
		tv.turnOn();
		
	}

}
