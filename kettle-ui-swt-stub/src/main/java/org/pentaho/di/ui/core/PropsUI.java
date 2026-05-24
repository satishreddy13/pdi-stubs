package org.pentaho.di.ui.core;
import org.eclipse.swt.widgets.Control;
public class PropsUI {
    private static final PropsUI INSTANCE = new PropsUI();
    private int middlePct = 40;
    private PropsUI() {}
    public static PropsUI getInstance() { return INSTANCE; }
    public void setLook(Control control) {}
    public int getMiddlePct() { return middlePct; }
}
