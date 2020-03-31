
package org.elasticsearch.query_dsl.term_level.ids;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;

public class IdsQuery  {
  
  private Id[] _values;
  public Id[] getValues() { return this._values; }
  public IdsQuery setValues(Id[] val) { this._values = val; return this; }

}
