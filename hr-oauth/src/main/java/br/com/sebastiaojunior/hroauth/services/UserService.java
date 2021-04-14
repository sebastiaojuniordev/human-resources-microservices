package br.com.sebastiaojunior.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sebastiaojunior.hroauth.entities.User;
import br.com.sebastiaojunior.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if (user == null) {
			logger.error("E-mail not found " + email);
			throw new IllegalArgumentException("E-mail not found");
		}
		logger.info("E-mail found " + email);
		return user;
	}
}
