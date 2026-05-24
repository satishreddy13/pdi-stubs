package org.pentaho.di.core.logging;
public interface LogChannelInterface {
    boolean isBasic();
    boolean isDetailed();
    boolean isDebug();
    boolean isRowLevel();
    void logBasic(String message, Object... args);
    void logDetailed(String message, Object... args);
    void logDebug(String message, Object... args);
    void logError(String message, Object... args);
    void logError(String message, Throwable e);
    void logMinimal(String message, Object... args);
}
