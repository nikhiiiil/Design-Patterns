package com.designpatterns.creationalpattern.builderpattern;

public class Main {

	public static void main(String[] args) {
		
		User user1 = User.builder()
						 .setId(1L)
						 .setFirstName("nikhil")
						 .build();
		
		System.out.println(user1.toString());
		
		User user2 = User.builder()
						 .setId(2)
						 .setFirstName("xyz")
						 .setMaritalStatus(false)
						 .setPhoneNumber("976789876")
						 .build();
		
		System.out.println(user2.toString());
	}

}
