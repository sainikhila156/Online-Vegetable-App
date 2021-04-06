package com.cpg.onlineVegetableApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpg.onlineVegetableApp.entities.Customer;
import com.cpg.onlineVegetableApp.exception.CustomerIdNotFoundException;
import com.cpg.onlineVegetableApp.exception.CustomerNotFoundInCityException;
import com.cpg.onlineVegetableApp.service.ICustomerService;

import io.swagger.annotations.Api;
@Api(value = "Swagger2DemoRestController")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService service;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
		
	}
	@DeleteMapping("/remove/{customerId}")
	public Customer removeCustomer(@PathVariable("customerId") Integer customerId)throws CustomerIdNotFoundException {
		return service.removeCustomer(customerId);
		
	}
	@GetMapping("/all/{Location}")
	public List<Customer> viewAllCustomerList(@PathVariable("Location") String Location)throws CustomerNotFoundInCityException {
		List<Customer> allcustomers=service.viewAllCustomerList(Location);
		return allcustomers;
	}
	
	@GetMapping("/get/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") Integer customerId) throws CustomerIdNotFoundException {
		return service.viewCustomer(customerId) ;
		
	}

}


