package com.example.placementmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  //used for handling exception globally
public class PlacementExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<PlacementErrorResponse> handleException(JobApplicantIdNotFoundException exc)
	{
		//create a studentErrorResponse
		PlacementErrorResponse error= new PlacementErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
		}
	
	
	@ExceptionHandler
	public ResponseEntity<PlacementErrorResponse> handleException(JobIdNotFoundException exc)
	{
		//create a studentErrorResponse
		PlacementErrorResponse error= new PlacementErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
		}
	@ExceptionHandler
	public ResponseEntity<PlacementErrorResponse> handleException(RecruiterIdNotFoundException exc)
	{
		//create a studentErrorResponse
		PlacementErrorResponse error= new PlacementErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
		}
	
	@ExceptionHandler
	public ResponseEntity<PlacementErrorResponse> handleException(StudentIdNotFoundException exc)
	{
		//create a studentErrorResponse
		PlacementErrorResponse error= new PlacementErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		//freturn ResponseEntity
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
		}
	
	@ExceptionHandler
	public ResponseEntity<PlacementErrorResponse> handleException(StudentEmailNotFoundException exc)
	{
		//create a studentErrorResponse
		PlacementErrorResponse error= new PlacementErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		//freturn ResponseEntity
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
		}
	
	
	
	//ADD another exception handler -to catch any type of exception(catch all)
	
		@ExceptionHandler
		public ResponseEntity<PlacementErrorResponse> handleException(Exception exc)
		{
			//create a StudentErrorResponse
			PlacementErrorResponse error=new PlacementErrorResponse();
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setMessage(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			//return ResponseEntity
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		}
	
	
}
