
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class DailySchedule  {
  
  private Either<String[], TimeOfDay> _at;
  public Either<String[], TimeOfDay> getAt() { return this._at; }
  public DailySchedule setAt(Either<String[], TimeOfDay> val) { this._at = val; return this; }

}
