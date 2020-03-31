
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardCommit  {
  
  private Integer _generation;
  public Integer getGeneration() { return this._generation; }
  public ShardCommit setGeneration(Integer val) { this._generation = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public ShardCommit setId(String val) { this._id = val; return this; }


  private Long _numDocs;
  public Long getNumDocs() { return this._numDocs; }
  public ShardCommit setNumDocs(Long val) { this._numDocs = val; return this; }


  private Map<String, String> _userData;
  public Map<String, String> getUserData() { return this._userData; }
  public ShardCommit setUserData(Map<String, String> val) { this._userData = val; return this; }

}
