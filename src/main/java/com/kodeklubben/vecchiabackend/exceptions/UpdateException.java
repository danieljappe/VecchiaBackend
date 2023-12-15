package com.kodeklubben.vecchiabackend.exceptions;

public class UpdateException extends RuntimeException{
  public UpdateException(Object object, String message) {
    super("Provided object could not be updated: " + object + "\n" + message);
  }
}
