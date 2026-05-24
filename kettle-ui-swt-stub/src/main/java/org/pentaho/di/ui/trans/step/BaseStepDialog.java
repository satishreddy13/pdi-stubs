package org.pentaho.di.ui.trans.step;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStepMeta;
import org.pentaho.di.trans.step.StepDialogInterface;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.ui.core.PropsUI;
public abstract class BaseStepDialog implements StepDialogInterface {
    protected Shell shell;
    protected PropsUI props = PropsUI.getInstance();
    protected Label wlStepname;
    protected Text  wStepname;
    protected FormData fdlStepname;
    protected FormData fdStepname;
    protected Button wOK;
    protected Button wCancel;
    protected boolean changed;
    protected String stepname;
    private Shell parent;
    private BaseStepMeta baseStepMeta;
    protected BaseStepDialog(Shell parent, BaseStepMeta baseStepMeta, TransMeta transMeta, String stepname) {
        this.parent = parent;
        this.baseStepMeta = baseStepMeta;
        this.stepname = stepname;
    }
    protected Shell getParent() { return parent; }
    protected void setShellImage(Shell shell, StepMetaInterface meta) {}
    protected void setSize() { if (shell != null) shell.pack(); }
    @Override
    public void dispose() { if (shell != null && !shell.isDisposed()) shell.dispose(); }
    public static void positionBottomButtons(org.eclipse.swt.widgets.Composite composite, Button[] buttons, int margin, Control lastControl) {
        // Layout helper – real SWT layout is handled by FormLayout
    }
}
