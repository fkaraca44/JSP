package listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletRequestAttributeListenerExample implements ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Attribute eklendi");
	}

	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Attribute silindi");

	}

	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Attribute Degistirildi");

	}
	
}
