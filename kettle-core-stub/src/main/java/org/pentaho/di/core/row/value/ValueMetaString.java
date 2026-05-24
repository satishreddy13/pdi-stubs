package org.pentaho.di.core.row.value;
import org.pentaho.di.core.row.ValueMetaInterface;
public class ValueMetaString implements ValueMetaInterface {
    private String name;
    private int length;
    private String origin;
    public ValueMetaString(String name) { this.name = name; }
    public void setLength(int length) { this.length = length; }
    public void setOrigin(String origin) { this.origin = origin; }
    public String getName() { return name; }
    public int getLength() { return length; }
}
