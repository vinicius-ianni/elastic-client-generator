
package org.elasticsearch.query_dsl.span.not;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.span.*;

public class SpanNotQuery  {
  
  private Integer _dist;
  public Integer getDist() { return this._dist; }
  public SpanNotQuery setDist(Integer val) { this._dist = val; return this; }


  private SpanQuery _exclude;
  public SpanQuery getExclude() { return this._exclude; }
  public SpanNotQuery setExclude(SpanQuery val) { this._exclude = val; return this; }


  private SpanQuery _include;
  public SpanQuery getInclude() { return this._include; }
  public SpanNotQuery setInclude(SpanQuery val) { this._include = val; return this; }


  private Integer _post;
  public Integer getPost() { return this._post; }
  public SpanNotQuery setPost(Integer val) { this._post = val; return this; }


  private Integer _pre;
  public Integer getPre() { return this._pre; }
  public SpanNotQuery setPre(Integer val) { this._pre = val; return this; }

}
