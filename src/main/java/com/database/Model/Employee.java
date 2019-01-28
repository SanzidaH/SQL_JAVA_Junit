package com.database.Model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Employee {
	@NonNull
	int Employee_ID;
	@NonNull
	String Employee_Name;
	@NonNull
	int Employee_Salary;
	@NonNull
	String Employee_Country;
	@NonNull
	String Employee_City;
	@NonNull
	String Employee_ZipCode;

	

}
