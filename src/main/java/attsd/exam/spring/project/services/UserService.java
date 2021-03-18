package attsd.exam.spring.project.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import attsd.exam.spring.project.model.User;
import attsd.exam.spring.project.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {
	private UserRepository userRepository;
	private PasswordEncoder encoder;

	@Autowired
	public UserService(UserRepository userRepository, PasswordEncoder encoder) {
		super();
		this.userRepository = userRepository;
		this.encoder = encoder;
	}

	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User saveUser(User user){
			user.setPassword(encoder.encode(user.getPassword()));
			user.setEnabled(true);
			userRepository.save(user);
			return user;
	}

	@Override
	public UserDetails loadUserByUsername(String email) {
		User user = findUserByEmail(email);
		if (user != null) {
			return user;
		} else {
			throw new UsernameNotFoundException("user not found");
		}
	}
}