package LGSamsung;

public class TVUser {

	public static void main(String[] args) {
		
		TV tv = new LGTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
//		BeanFactory fac = new BeanFactory();
//		TV tv = (TV)fac.getBean(args[0]);
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
	}

}
