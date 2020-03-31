
package org.elasticsearch.x_pack.machine_learning.datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;

public class ChunkingConfig  {
  
  private ChunkingMode _mode;
  public ChunkingMode getMode() { return this._mode; }
  public ChunkingConfig setMode(ChunkingMode val) { this._mode = val; return this; }


  private Time _timeSpan;
  public Time getTimeSpan() { return this._timeSpan; }
  public ChunkingConfig setTimeSpan(Time val) { this._timeSpan = val; return this; }

}
