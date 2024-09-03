package myspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.ProductRepository;
@Controller
public class WelcomeController {
	@Autowired
	ProductRepository productrep;
	@RequestMapping("/home")
	public String getHome()
	{
		return "Welcome";
		//it will search for Welcome.jsp in result folder
	}
	@RequestMapping("/data")
	public ModelAndView sendData() {
	return new ModelAndView("Information", "empdata", "Welcome to Spring APP");
	/*
	* 	First Parameter The name of jsp page which has to create
	*	Second parameter-The name by which information will be access by this name 
	*	Third parameter-What information u want to send
	*<h2>Values passed by controller are: ${productinfo.productname}&nbsp;${productinfo.price}
	*&nbsp;${productinfo.quantity}&nbsp;${productinfo.productid}</h2> --->Product.jsp first example
	*/
	}
	@RequestMapping("/productinfo")
	public ModelAndView productdata(){
		java.util.List<Product> productlist=productrep.findAll(); 
		return new ModelAndView("ProductData", "productinfo", productlist);
	}

}
