package org.pentaho.di.trans.step;
public class BaseStepData implements StepDataInterface {
    public enum StepExecutionStatus {
        STATUS_EMPTY, STATUS_INIT, STATUS_RUNNING, STATUS_OUTPUT,
        STATUS_FINISHED, STATUS_HALTED, STATUS_STOPPED, STATUS_HALTING, STATUS_PAUSED
    }
    public StepExecutionStatus status = StepExecutionStatus.STATUS_EMPTY;
}
