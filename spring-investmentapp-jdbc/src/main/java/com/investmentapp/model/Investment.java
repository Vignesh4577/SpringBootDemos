package com.investmentapp.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Investment {

	@Size(min=2,max=20)
	private String planName;
	@Min(2)
	@Max(70)
	private Integer planId;
	private int entryAge;
	private String type; // mutual,ULIP,PPF,FD,RD
	@Min(1000)
	private double amount;
	private String purpose; // education,retirement,marriage
	private String risk; //high or low
	private String nominee; //father,mother,sister,brother
	@Min(5)
	@Max(20)
	private int term;
	
	
	
	public Investment(String planName, int entryAge, String type, double amount, String purpose, String risk,
			String nominee, int term) {
		super();
		this.planName = planName;
		this.entryAge = entryAge;
		this.type = type;
		this.amount = amount;
		this.purpose = purpose;
		this.risk = risk;
		this.nominee = nominee;
		this.term = term;
	}

	
	
	
	
	
}
