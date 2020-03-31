
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ElisionTokenFilter  {
  
  private String[] _articles;
  public String[] getArticles() { return this._articles; }
  public ElisionTokenFilter setArticles(String[] val) { this._articles = val; return this; }


  private Boolean _articlesCase;
  public Boolean getArticlesCase() { return this._articlesCase; }
  public ElisionTokenFilter setArticlesCase(Boolean val) { this._articlesCase = val; return this; }

}
