
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CcrUsage  {
  
  private Integer _autoFollowPatternsCount;
  public Integer getAutoFollowPatternsCount() { return this._autoFollowPatternsCount; }
  public CcrUsage setAutoFollowPatternsCount(Integer val) { this._autoFollowPatternsCount = val; return this; }


  private Integer _followerIndicesCount;
  public Integer getFollowerIndicesCount() { return this._followerIndicesCount; }
  public CcrUsage setFollowerIndicesCount(Integer val) { this._followerIndicesCount = val; return this; }

}
