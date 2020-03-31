
package org.elasticsearch.search.validate;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ValidationExplanation  {
  
  private String _error;
  public String getError() { return this._error; }
  public ValidationExplanation setError(String val) { this._error = val; return this; }


  private String _explanation;
  public String getExplanation() { return this._explanation; }
  public ValidationExplanation setExplanation(String val) { this._explanation = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public ValidationExplanation setIndex(String val) { this._index = val; return this; }


  private Boolean _valid;
  public Boolean getValid() { return this._valid; }
  public ValidationExplanation setValid(Boolean val) { this._valid = val; return this; }

}
