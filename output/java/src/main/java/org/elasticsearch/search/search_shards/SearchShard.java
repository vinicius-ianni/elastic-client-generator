
package org.elasticsearch.search.search_shards;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class SearchShard  {
  
  private String _index;
  public String getIndex() { return this._index; }
  public SearchShard setIndex(String val) { this._index = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public SearchShard setNode(String val) { this._node = val; return this; }


  private Boolean _primary;
  public Boolean getPrimary() { return this._primary; }
  public SearchShard setPrimary(Boolean val) { this._primary = val; return this; }


  private String _relocatingNode;
  public String getRelocatingNode() { return this._relocatingNode; }
  public SearchShard setRelocatingNode(String val) { this._relocatingNode = val; return this; }


  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public SearchShard setShard(Integer val) { this._shard = val; return this; }


  private String _state;
  public String getState() { return this._state; }
  public SearchShard setState(String val) { this._state = val; return this; }

}
