package com.ig;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ig.controller.CustController;
import com.ig.model.CustVO;

/**
 * Hello world!
 *
 */
public class Client {
	public static void main(String[] args) {

		System.out.println("hello");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // create and activate container
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		
		
		CustController controller = factory.getBean(CustController.class);
		// lets take input from command line
		
		if(args!=null && args.length == 3) {
			CustVO vo = new CustVO();
			vo.setCustAddr(args[0]);
			vo.setCustName(args[1]);
			vo.setMoblieNo(args[2]);

			boolean result = controller.registerCustomer(vo);
			
			System.out.println("is customer added --"+result);
		}
		
	}
}
