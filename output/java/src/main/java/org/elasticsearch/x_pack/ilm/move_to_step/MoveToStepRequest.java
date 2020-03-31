
package org.elasticsearch.x_pack.ilm.move_to_step;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.move_to_step.*;

public class MoveToStepRequest  {
  
  private StepKey _currentStep;
  public StepKey getCurrentStep() { return this._currentStep; }
  public MoveToStepRequest setCurrentStep(StepKey val) { this._currentStep = val; return this; }


  private StepKey _nextStep;
  public StepKey getNextStep() { return this._nextStep; }
  public MoveToStepRequest setNextStep(StepKey val) { this._nextStep = val; return this; }

}
