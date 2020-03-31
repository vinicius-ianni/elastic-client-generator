
package org.elasticsearch.search.explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.explain.*;

public class ExplainResponse<TDocument>  {
  
  private ExplanationDetail _explanation;
  public ExplanationDetail getExplanation() { return this._explanation; }
  public ExplainResponse<TDocument> setExplanation(ExplanationDetail val) { this._explanation = val; return this; }


  private InlineGet<TDocument> _get;
  public InlineGet<TDocument> getGet() { return this._get; }
  public ExplainResponse<TDocument> setGet(InlineGet<TDocument> val) { this._get = val; return this; }


  private Boolean _matched;
  public Boolean getMatched() { return this._matched; }
  public ExplainResponse<TDocument> setMatched(Boolean val) { this._matched = val; return this; }

}
