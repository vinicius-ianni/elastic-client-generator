
package org.elasticsearch.x_pack.watcher.get_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;
import org.elasticsearch.x_pack.watcher.*;

public class GetWatchResponse  {
  
  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public GetWatchResponse setFound(Boolean val) { this._found = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public GetWatchResponse setId(String val) { this._id = val; return this; }


  private WatchStatus _status;
  public WatchStatus getStatus() { return this._status; }
  public GetWatchResponse setStatus(WatchStatus val) { this._status = val; return this; }


  private Watch _watch;
  public Watch getWatch() { return this._watch; }
  public GetWatchResponse setWatch(Watch val) { this._watch = val; return this; }

}
