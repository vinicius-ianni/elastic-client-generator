
package org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.get_auto_follow_pattern;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.get_auto_follow_pattern.*;

public class GetAutoFollowPatternResponse  {
  
  private Map<String, AutoFollowPattern> _patterns;
  public Map<String, AutoFollowPattern> getPatterns() { return this._patterns; }
  public GetAutoFollowPatternResponse setPatterns(Map<String, AutoFollowPattern> val) { this._patterns = val; return this; }

}
