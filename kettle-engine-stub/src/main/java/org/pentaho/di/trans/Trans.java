package org.pentaho.di.trans;
import org.pentaho.di.core.logging.LogChannelInterface;
public class Trans {
    private String containerObjectId = java.util.UUID.randomUUID().toString();
    public String getContainerObjectId() { return containerObjectId; }
    public void setContainerObjectId(String id) { this.containerObjectId = id; }
    public LogChannelInterface getLogChannel() { return null; }
    public String getName() { return ""; }
}
