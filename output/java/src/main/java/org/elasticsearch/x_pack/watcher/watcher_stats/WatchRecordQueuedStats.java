
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class WatchRecordQueuedStats  {
  
  private Date _executionTime;
  public Date getExecutionTime() { return this._executionTime; }
  public WatchRecordQueuedStats setExecutionTime(Date val) { this._executionTime = val; return this; }


  private Date _triggeredTime;
  public Date getTriggeredTime() { return this._triggeredTime; }
  public WatchRecordQueuedStats setTriggeredTime(Date val) { this._triggeredTime = val; return this; }


  private String _watchId;
  public String getWatchId() { return this._watchId; }
  public WatchRecordQueuedStats setWatchId(String val) { this._watchId = val; return this; }


  private String _watchRecordId;
  public String getWatchRecordId() { return this._watchRecordId; }
  public WatchRecordQueuedStats setWatchRecordId(String val) { this._watchRecordId = val; return this; }

}
