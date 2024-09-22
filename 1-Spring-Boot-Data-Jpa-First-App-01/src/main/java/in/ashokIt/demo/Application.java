package in.ashokIt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokIt.demo.entities.Product;
import in.ashokIt.demo.entities.repository.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	
	      ProductRepo bean = ctxt.getBean(ProductRepo.class);
	       
	      Product p1=new Product();
	      
	      p1.setProductId(135);
	      p1.setProductName("Mobile");
	      p1.setProductPrice(435);
	      
	      bean.save(p1);
	      System.out.println("product saves to database successfully...!!!!...");
	    
	     ctxt.close(); 
	}

}
