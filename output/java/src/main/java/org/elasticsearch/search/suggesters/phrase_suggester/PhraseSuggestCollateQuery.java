
package org.elasticsearch.search.suggesters.phrase_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;

public class PhraseSuggestCollateQuery  {
  
  private Id _id;
  public Id getId() { return this._id; }
  public PhraseSuggestCollateQuery setId(Id val) { this._id = val; return this; }


  private String _source;
  public String getSource() { return this._source; }
  public PhraseSuggestCollateQuery setSource(String val) { this._source = val; return this; }

}
