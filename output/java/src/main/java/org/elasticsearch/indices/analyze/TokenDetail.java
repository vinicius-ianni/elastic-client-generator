
package org.elasticsearch.indices.analyze;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.analyze.*;

public class TokenDetail  {
  
  private String _name;
  public String getName() { return this._name; }
  public TokenDetail setName(String val) { this._name = val; return this; }


  private ExplainAnalyzeToken[] _tokens;
  public ExplainAnalyzeToken[] getTokens() { return this._tokens; }
  public TokenDetail setTokens(ExplainAnalyzeToken[] val) { this._tokens = val; return this; }

}
