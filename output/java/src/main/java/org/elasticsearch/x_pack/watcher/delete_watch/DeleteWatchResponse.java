
package org.elasticsearch.x_pack.watcher.delete_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class DeleteWatchResponse  {
  
  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public DeleteWatchResponse setFound(Boolean val) { this._found = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public DeleteWatchResponse setId(String val) { this._id = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public DeleteWatchResponse setVersion(Integer val) { this._version = val; return this; }

}
