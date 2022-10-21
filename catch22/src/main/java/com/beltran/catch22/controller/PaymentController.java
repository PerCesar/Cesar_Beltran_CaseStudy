package com.beltran.catch22.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.beltran.catch22.entity.Payment;
import com.beltran.catch22.service.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	//display list of payment
	@GetMapping("/payment")
	public String viewHomePage(Model model) {
		model.addAttribute("listPayment", paymentService.getAllPayment());
		return "payment";
}
	@GetMapping("/sendPaymentForm")
	public String signUpPaymentForm(Model model) {
		Payment payment = new Payment();
		model.addAttribute("payment", payment);
		return "new_payment";
	}
	
	@PostMapping("/savePayment")
	public String savePayment(@ModelAttribute("payment") Payment payment) {
		//save new payment to database
		paymentService.savePayment(payment);
		return "redirect:/";
}
	@GetMapping("/showFormForUpdatePayment/{number}")
	public String showFormForUpdate(@PathVariable (value="number") long number, Model model) {
		
		//Get payment from the service package
		Payment payment = paymentService.getPaymentByNumber(number);
	
		//Set employee as a model attribute to pre-populate the table
		model.addAttribute("payment", payment);
		return "update_payment";
	}
		@GetMapping("/deletePayment/{number}")
		public String deletePayment(@PathVariable (value= "number") long number) {
		
			// call delete employee method
			
			this.paymentService.deletePaymentByNumber(number);
			return "redirect:/";
		}
}