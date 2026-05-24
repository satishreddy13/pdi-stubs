package org.pentaho.di.core.logging;
public class StubLogChannel implements LogChannelInterface {
    public boolean isBasic() { return true; }
    public boolean isDetailed() { return false; }
    public boolean isDebug() { return false; }
    public boolean isRowLevel() { return false; }
    public void logBasic(String message, Object... args) { System.out.println(message); }
    public void logDetailed(String message, Object... args) {}
    public void logDebug(String message, Object... args) {}
    public void logError(String message, Object... args) { System.err.println(message); }
    public void logError(String message, Throwable e) { System.err.println(message); e.printStackTrace(); }
    public void logMinimal(String message, Object... args) { System.out.println(message); }
}
