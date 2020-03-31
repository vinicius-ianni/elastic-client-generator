
package org.elasticsearch.indices.index_management.create_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CreateIndexResponse  {
  
  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public CreateIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public CreateIndexResponse setIndex(String val) { this._index = val; return this; }

}
