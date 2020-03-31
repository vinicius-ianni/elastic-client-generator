
package org.elasticsearch.analysis.plugins.kuromoji;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.plugins.kuromoji.*;

public class KuromojiAnalyzer  {
  
  private KuromojiTokenizationMode _mode;
  public KuromojiTokenizationMode getMode() { return this._mode; }
  public KuromojiAnalyzer setMode(KuromojiTokenizationMode val) { this._mode = val; return this; }


  private String _userDictionary;
  public String getUserDictionary() { return this._userDictionary; }
  public KuromojiAnalyzer setUserDictionary(String val) { this._userDictionary = val; return this; }

}
