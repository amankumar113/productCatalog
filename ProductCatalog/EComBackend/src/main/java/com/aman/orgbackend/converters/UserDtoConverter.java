package com.aman.orgbackend.converters;

import org.springframework.stereotype.Component;

import com.aman.orgbackend.dto.UserDto;
import com.aman.orgbackend.models.User;


@Component
public class UserDtoConverter {
	public UserDto convertEntityToDto(User user) {
		
		UserDto userDto = new UserDto();
		userDto.setUid(user.getUid());
		userDto.setUsername(user.getUsername());
		userDto.setUname(user.getUname());
		userDto.setPassword(user.getPassword());

		return userDto;
	}
	
	public User convertDtoToEntity(UserDto userDto){

		User user = new User();
		user.setUid(userDto.getUid());
		user.setUsername(userDto.getUsername());
		user.setUname(userDto.getUname());
		user.setPassword(userDto.getPassword());

		return user;
	}
}
