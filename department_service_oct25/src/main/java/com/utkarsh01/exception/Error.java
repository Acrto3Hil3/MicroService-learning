package com.utkarsh01.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class Error {
	
	private String message;
	private String dateOfError;
	private String timeOfError;
}
