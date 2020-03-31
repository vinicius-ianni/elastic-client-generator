
package org.elasticsearch.document.single.source;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SourceResponse<TDocument>  {
  
  private TDocument _body;
  public TDocument getBody() { return this._body; }
  public SourceResponse<TDocument> setBody(TDocument val) { this._body = val; return this; }

}
