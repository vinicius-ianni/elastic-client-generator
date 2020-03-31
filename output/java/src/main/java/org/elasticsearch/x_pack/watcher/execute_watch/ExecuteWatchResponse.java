
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execute_watch.*;

public class ExecuteWatchResponse  {
  
  private String _id;
  public String getId() { return this._id; }
  public ExecuteWatchResponse setId(String val) { this._id = val; return this; }


  private WatchRecord _watchRecord;
  public WatchRecord getWatchRecord() { return this._watchRecord; }
  public ExecuteWatchResponse setWatchRecord(WatchRecord val) { this._watchRecord = val; return this; }

}
