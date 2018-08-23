package com.qa.QACinema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.qa.QACinema.Entities.Role;
import com.qa.QACinema.Entities.User;

public class CustomerUserDetails implements UserDetails {
	
	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;

	public CustomerUserDetails(User findByUsername) {
		this.username= findByUsername.getUsername();
		this.password = findByUsername.getPassword();
		
		List<GrantedAuthority> auths = new ArrayList<>();
		for(Role role : findByUsername.getRoles())
			auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));

		this.authorities = auths;
		// TODO Auto-generated constructor stub
		
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
