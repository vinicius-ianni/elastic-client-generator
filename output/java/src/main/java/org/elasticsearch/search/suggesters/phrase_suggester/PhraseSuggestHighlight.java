
package org.elasticsearch.search.suggesters.phrase_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PhraseSuggestHighlight  {
  
  private String _postTag;
  public String getPostTag() { return this._postTag; }
  public PhraseSuggestHighlight setPostTag(String val) { this._postTag = val; return this; }


  private String _preTag;
  public String getPreTag() { return this._preTag; }
  public PhraseSuggestHighlight setPreTag(String val) { this._preTag = val; return this; }

}
