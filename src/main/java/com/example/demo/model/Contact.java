package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Contact {
    public Contact(String firstName2, String lastName2, String address2, String city2, String state2, String zip2,
			String phoneNumber2, String email2) {
		// TODO Auto-generated constructor stub
	}
    
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
}



