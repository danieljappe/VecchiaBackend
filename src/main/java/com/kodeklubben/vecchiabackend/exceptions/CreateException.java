package com.kodeklubben.vecchiabackend.exceptions;

public class CreateException extends RuntimeException{
  public CreateException(Object object, String message) {
    super("Provided object with id=" + object + "\n could not be deleted. \n" + message);
  }
}
