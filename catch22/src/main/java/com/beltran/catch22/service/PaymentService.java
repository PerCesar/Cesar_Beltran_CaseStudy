package com.beltran.catch22.service;

	import java.util.List;

import com.beltran.catch22.entity.Payment;


	public interface PaymentService {
		List<Payment> getAllPayment();
		void savePayment(Payment payment);
		Payment getPaymentByNumber(long number);
		void deletePaymentByNumber(long number);
		
		
	}
