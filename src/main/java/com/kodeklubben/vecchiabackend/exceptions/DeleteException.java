package com.kodeklubben.vecchiabackend.exceptions;

public class DeleteException extends RuntimeException{
  public DeleteException(Object object, String message) {
    super("Provided object could not be deleted: " + object + "\n" + message);
  }
}
