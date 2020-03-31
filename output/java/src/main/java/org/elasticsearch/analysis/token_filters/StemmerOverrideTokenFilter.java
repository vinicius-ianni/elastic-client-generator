
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StemmerOverrideTokenFilter  {
  
  private String[] _rules;
  public String[] getRules() { return this._rules; }
  public StemmerOverrideTokenFilter setRules(String[] val) { this._rules = val; return this; }


  private String _rulesPath;
  public String getRulesPath() { return this._rulesPath; }
  public StemmerOverrideTokenFilter setRulesPath(String val) { this._rulesPath = val; return this; }

}
