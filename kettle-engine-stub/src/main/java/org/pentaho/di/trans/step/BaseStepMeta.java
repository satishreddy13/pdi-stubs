package org.pentaho.di.trans.step;
public abstract class BaseStepMeta implements StepMetaInterface {
    private boolean changed = false;
    public boolean hasChanged() { return changed; }
    public void setChanged(boolean changed) { this.changed = changed; }
    public void setChanged() { this.changed = true; }
    @Override
    public Object clone() {
        try { return super.clone(); } catch (CloneNotSupportedException e) { throw new RuntimeException(e); }
    }
}
