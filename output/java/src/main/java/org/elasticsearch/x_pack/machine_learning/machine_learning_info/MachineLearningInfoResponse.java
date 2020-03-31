
package org.elasticsearch.x_pack.machine_learning.machine_learning_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.machine_learning_info.*;

public class MachineLearningInfoResponse  {
  
  private Defaults _defaults;
  public Defaults getDefaults() { return this._defaults; }
  public MachineLearningInfoResponse setDefaults(Defaults val) { this._defaults = val; return this; }


  private Limits _limits;
  public Limits getLimits() { return this._limits; }
  public MachineLearningInfoResponse setLimits(Limits val) { this._limits = val; return this; }


  private Boolean _upgradeMode;
  public Boolean getUpgradeMode() { return this._upgradeMode; }
  public MachineLearningInfoResponse setUpgradeMode(Boolean val) { this._upgradeMode = val; return this; }

}
