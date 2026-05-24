package org.pentaho.di.core.row;
public interface ValueMetaInterface {
    int TYPE_NONE   = 0;
    int TYPE_NUMBER = 1;
    int TYPE_STRING = 2;
    void setLength(int length);
    void setOrigin(String origin);
    String getName();
}
