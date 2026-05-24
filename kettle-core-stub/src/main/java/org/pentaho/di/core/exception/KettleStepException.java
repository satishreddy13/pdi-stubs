package org.pentaho.di.core.exception;
public class KettleStepException extends KettleException {
    public KettleStepException() { super(); }
    public KettleStepException(String message) { super(message); }
    public KettleStepException(String message, Throwable cause) { super(message, cause); }
}
