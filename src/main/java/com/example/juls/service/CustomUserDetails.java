package com.example.juls.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.juls.model.Users;

import lombok.Data;

@Data
public class CustomUserDetails implements UserDetails{
	//UserDetails : Spring Security���� ������� ������ ��� �������̽�
	
	private static final long serialVersionUID = 1L;
	
	private Users users;
	
	@Override
	public Collection<? extends GrantedAuthority>getAuthorities(){
		return null;
	}
	
	@Override
	public String getPassword() {
		return users.getPassword();
	}
	
	@Override
	public String getUsername() {
		return users.getUsername(); 
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}
