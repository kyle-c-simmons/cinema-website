package com.qa.QACinema;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.qa.QACinema.Entities.Role;
import com.qa.QACinema.Entities.User;
import com.qa.QACinema.Repositories.UserRepository;


@SpringBootApplication
public class QACinemaApp 
{
	public static void main(String[] args) {
		SpringApplication.run(QACinemaApp.class, args);
	}
	
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, final UserRepository repo) throws Exception  {
		if (repo.count() == 0)
			repo.save(new User("user", "password", Arrays.asList(new Role ("USER"), new Role ("ACTUATOR"))));
	
		builder.userDetailsService(new UserDetailsService() {
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				// TODO Auto-generated method stub
				return new CustomUserDetails( repo.findByUsername(username));
			}
		});
			
			}
		
	private UserDetailsService userDetailsService(final UserRepository repository) {
		return username -> new CustomUserDetails(repository.findByUsername(username));
	}
	
	
}
