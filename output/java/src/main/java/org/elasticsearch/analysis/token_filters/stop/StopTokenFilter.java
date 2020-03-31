
package org.elasticsearch.analysis.token_filters.stop;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.*;

public class StopTokenFilter  {
  
  private Boolean _ignoreCase;
  public Boolean getIgnoreCase() { return this._ignoreCase; }
  public StopTokenFilter setIgnoreCase(Boolean val) { this._ignoreCase = val; return this; }


  private Boolean _removeTrailing;
  public Boolean getRemoveTrailing() { return this._removeTrailing; }
  public StopTokenFilter setRemoveTrailing(Boolean val) { this._removeTrailing = val; return this; }


  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public StopTokenFilter setStopwords(StopWords val) { this._stopwords = val; return this; }


  private String _stopwordsPath;
  public String getStopwordsPath() { return this._stopwordsPath; }
  public StopTokenFilter setStopwordsPath(String val) { this._stopwordsPath = val; return this; }

}
