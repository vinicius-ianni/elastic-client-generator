
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class LimitTokenCountTokenFilter  {
  
  private Boolean _consumeAllTokens;
  public Boolean getConsumeAllTokens() { return this._consumeAllTokens; }
  public LimitTokenCountTokenFilter setConsumeAllTokens(Boolean val) { this._consumeAllTokens = val; return this; }


  private Integer _maxTokenCount;
  public Integer getMaxTokenCount() { return this._maxTokenCount; }
  public LimitTokenCountTokenFilter setMaxTokenCount(Integer val) { this._maxTokenCount = val; return this; }

}
