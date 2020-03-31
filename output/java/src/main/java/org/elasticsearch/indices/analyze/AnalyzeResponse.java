
package org.elasticsearch.indices.analyze;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.analyze.*;

public class AnalyzeResponse  {
  
  private AnalyzeDetail _detail;
  public AnalyzeDetail getDetail() { return this._detail; }
  public AnalyzeResponse setDetail(AnalyzeDetail val) { this._detail = val; return this; }


  private AnalyzeToken[] _tokens;
  public AnalyzeToken[] getTokens() { return this._tokens; }
  public AnalyzeResponse setTokens(AnalyzeToken[] val) { this._tokens = val; return this; }

}
