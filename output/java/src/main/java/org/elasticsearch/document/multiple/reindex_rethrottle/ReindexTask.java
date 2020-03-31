
package org.elasticsearch.document.multiple.reindex_rethrottle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.document.multiple.reindex_rethrottle.*;

public class ReindexTask  {
  
  private String _action;
  public String getAction() { return this._action; }
  public ReindexTask setAction(String val) { this._action = val; return this; }


  private Boolean _cancellable;
  public Boolean getCancellable() { return this._cancellable; }
  public ReindexTask setCancellable(Boolean val) { this._cancellable = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public ReindexTask setDescription(String val) { this._description = val; return this; }


  private Long _id;
  public Long getId() { return this._id; }
  public ReindexTask setId(Long val) { this._id = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public ReindexTask setNode(String val) { this._node = val; return this; }


  private Long _runningTimeInNanos;
  public Long getRunningTimeInNanos() { return this._runningTimeInNanos; }
  public ReindexTask setRunningTimeInNanos(Long val) { this._runningTimeInNanos = val; return this; }


  private Long _startTimeInMillis;
  public Long getStartTimeInMillis() { return this._startTimeInMillis; }
  public ReindexTask setStartTimeInMillis(Long val) { this._startTimeInMillis = val; return this; }


  private ReindexStatus _status;
  public ReindexStatus getStatus() { return this._status; }
  public ReindexTask setStatus(ReindexStatus val) { this._status = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public ReindexTask setType(String val) { this._type = val; return this; }

}
