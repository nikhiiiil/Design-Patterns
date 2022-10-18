package com.designpatterns.creationalpattern.builderpattern;

import java.util.Date;

// Reference
// https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

public class User {
	
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private Boolean maritalStatus;
	private String phoneNumber;
	private Date dateOfBirth;
	
	public User(UserBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.maritalStatus = builder.maritalStatus;
		this.age = builder.age;
		this.dateOfBirth = builder.dateOfBirth;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}
	
	public static UserBuilder builder() {
		return new UserBuilder();
	}
	
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public Boolean getMaritalStatus() {
		return maritalStatus;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address="
				+ address + ", maritalStatus=" + maritalStatus + ", phoneNumber=" + phoneNumber + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

	public static final class UserBuilder {
		
		private long id;
		private String firstName;
		private String lastName;
		private int age;
		private String address;
		private Boolean maritalStatus;
		private String phoneNumber;
		private Date dateOfBirth;
		
		public UserBuilder setId(long id) {
			this.id = id;
			return this;
		}
		public UserBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public UserBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		public UserBuilder setMaritalStatus(Boolean maritalStatus) {
			this.maritalStatus = maritalStatus;
			return this;
		}
		public UserBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		public UserBuilder setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
		
}
