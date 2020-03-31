
package org.elasticsearch.aggregations.bucket.terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.terms.*;
import org.elasticsearch.search.search.sort.*;

public class TermsOrder  {
  
  private TermsOrder _countAscending;
  public TermsOrder getCountAscending() { return this._countAscending; }
  public TermsOrder setCountAscending(TermsOrder val) { this._countAscending = val; return this; }


  private TermsOrder _countDescending;
  public TermsOrder getCountDescending() { return this._countDescending; }
  public TermsOrder setCountDescending(TermsOrder val) { this._countDescending = val; return this; }


  private String _key;
  public String getKey() { return this._key; }
  public TermsOrder setKey(String val) { this._key = val; return this; }


  private TermsOrder _keyAscending;
  public TermsOrder getKeyAscending() { return this._keyAscending; }
  public TermsOrder setKeyAscending(TermsOrder val) { this._keyAscending = val; return this; }


  private TermsOrder _keyDescending;
  public TermsOrder getKeyDescending() { return this._keyDescending; }
  public TermsOrder setKeyDescending(TermsOrder val) { this._keyDescending = val; return this; }


  private SortOrder _order;
  public SortOrder getOrder() { return this._order; }
  public TermsOrder setOrder(SortOrder val) { this._order = val; return this; }

}
