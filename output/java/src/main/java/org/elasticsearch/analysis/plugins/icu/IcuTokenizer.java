
package org.elasticsearch.analysis.plugins.icu;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class IcuTokenizer  {
  
  private String _ruleFiles;
  public String getRuleFiles() { return this._ruleFiles; }
  public IcuTokenizer setRuleFiles(String val) { this._ruleFiles = val; return this; }

}
