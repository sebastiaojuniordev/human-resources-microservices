package br.com.sebastiaojunior.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.sebastiaojunior.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Sebastiao", 100.0, days);
	}
}
