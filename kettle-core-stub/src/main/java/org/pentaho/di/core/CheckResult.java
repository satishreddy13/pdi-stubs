package org.pentaho.di.core;
public class CheckResult implements CheckResultInterface {
    private int type;
    private String text;
    private Object stepMeta;
    public CheckResult(int type, String text, Object stepMeta) {
        this.type = type; this.text = text; this.stepMeta = stepMeta;
    }
    public int getType() { return type; }
    public String getText() { return text; }
}
