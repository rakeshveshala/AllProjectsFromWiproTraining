package myspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation. ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.servlet.ModelAndView;

import dao.ProductRepository;


@Controller
public class ProductController {
	@Autowired
	ProductRepository productrep;
	@RequestMapping("/GetForm")
	public ModelAndView displayForm() {
		return new ModelAndView("ProductForm", "productdata", new Product());
	}
	@RequestMapping(value="/insertProduct", method=RequestMethod.POST) 
	public String insertData(@ModelAttribute("productdata") Product p1){
		int result=productrep.insertData(p1); 
		if(result>0){ 
			System.out.println("Data inserted successfully"); 
			return "success";
		}
		return "success";
	}
	@RequestMapping("/DeleteForm")
	public ModelAndView displayForm1() {
		return new ModelAndView("ProductDeleteForm", "productdata", new Product());
	}
	@RequestMapping(value="/deleteProduct", method=RequestMethod.POST) 
	public String deleteData(@ModelAttribute("productdata") Product p1){
		int result=productrep.deleteData(p1); 
		if(result>0){ 
			System.out.println("Data deleted successfully"); 
			return "success";
		}
		return "success";
	}
}
