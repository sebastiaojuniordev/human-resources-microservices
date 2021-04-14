package br.com.sebastiaojunior.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sebastiaojunior.hruser.entities.User;
import br.com.sebastiaojunior.hruser.repositories.UserRepository;

@RefreshScope
@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") Long id) {
		User user = userRepository.findById(id).orElseThrow();
		return ResponseEntity.ok(user);
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam("email") String email) {
		User user = userRepository.findByEmail(email);
		return ResponseEntity.ok(user);
	}
}
