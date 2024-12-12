package shoppingMallManagement.User;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
@Autowired
UserService userService;
	
	@GetMapping("/api/Users") // used to retrieve resource from server.
	
	public List<User> list() {
		return userService.getAllUsers();
	}

	// Retrieve Operation (retrieving user by id)
	
	@GetMapping("/api/Users/{id}")
	
	public ResponseEntity<User> get(@PathVariable Integer id) {
		try {
			User c1 = userService.getUserById(id);
			return new ResponseEntity<User>(c1, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

	}

	// Create Operation annotation ensures that HTTP POST requests to /Users are mapped to add() method.
	
	@PostMapping("/api/Users") 
			
	public void add(@RequestBody User user) {
		userService.save(user);
	}

	// Update Operation
	
	@PutMapping("/api/Users/{id}") // It maps the HTTP PUT requests
	
	public ResponseEntity<?> update(@RequestBody User emp, @PathVariable Integer id) {
		/*
		 * @RequestBody: it is used to bind HTTP request with an object in a method
		 * parameter
		 * 
		 * @PathVariable: it is used to extract the values from the Url.
		 */

		try {
			userService.save(emp);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	// Delete Operation It Maps the HTTP DELETE requests
	
	@DeleteMapping("/api/Users/{id}")
	
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}
}
