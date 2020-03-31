
package org.elasticsearch.analysis.plugins.icu;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class IcuFoldingTokenFilter  {
  
  private String _unicodeSetFilter;
  public String getUnicodeSetFilter() { return this._unicodeSetFilter; }
  public IcuFoldingTokenFilter setUnicodeSetFilter(String val) { this._unicodeSetFilter = val; return this; }

}
