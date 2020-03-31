
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.profile.*;
import org.elasticsearch.internal.*;

public class QueryProfile  {
  
  private QueryBreakdown _breakdown;
  public QueryBreakdown getBreakdown() { return this._breakdown; }
  public QueryProfile setBreakdown(QueryBreakdown val) { this._breakdown = val; return this; }


  private QueryProfile[] _children;
  public QueryProfile[] getChildren() { return this._children; }
  public QueryProfile setChildren(QueryProfile[] val) { this._children = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public QueryProfile setDescription(String val) { this._description = val; return this; }


  private Long _timeInNanos;
  public Long getTimeInNanos() { return this._timeInNanos; }
  public QueryProfile setTimeInNanos(Long val) { this._timeInNanos = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public QueryProfile setType(String val) { this._type = val; return this; }

}
