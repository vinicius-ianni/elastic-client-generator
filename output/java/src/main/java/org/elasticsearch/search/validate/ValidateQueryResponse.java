
package org.elasticsearch.search.validate;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.validate.*;
import org.elasticsearch.common_options.hit.*;

public class ValidateQueryResponse  {
  
  private ValidationExplanation[] _explanations;
  public ValidationExplanation[] getExplanations() { return this._explanations; }
  public ValidateQueryResponse setExplanations(ValidationExplanation[] val) { this._explanations = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public ValidateQueryResponse setShards(ShardStatistics val) { this._shards = val; return this; }


  private Boolean _valid;
  public Boolean getValid() { return this._valid; }
  public ValidateQueryResponse setValid(Boolean val) { this._valid = val; return this; }

}
