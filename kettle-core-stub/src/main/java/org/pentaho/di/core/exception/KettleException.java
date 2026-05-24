package org.pentaho.di.core.exception;
public class KettleException extends Exception {
    public KettleException() { super(); }
    public KettleException(String message) { super(message); }
    public KettleException(String message, Throwable cause) { super(message, cause); }
    public KettleException(Throwable cause) { super(cause); }
}
