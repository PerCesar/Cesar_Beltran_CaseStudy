package com.beltran.catch22.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beltran.catch22.entity.Payment;
import com.beltran.catch22.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public List<Payment> getAllPayment() {
		return paymentRepository.findAll();
	}

	@Override
	public void savePayment(Payment payment) {
		System.out.print(payment.getParticipantId());
		this.paymentRepository.save(payment);
		
	}

	@Override
	public Payment getPaymentByNumber(long number) {
		Optional<Payment> optional = paymentRepository.findById(number);
		Payment payment = null;
		if(optional.isPresent()) {
			payment = optional.get();
		}else {
			throw new RuntimeException("Payment not found ::"+ number);
		}
		return payment;
		}
	@Override
	public void deletePaymentByNumber(long number) {
		this.paymentRepository.deleteById(number);
		
	}

}
