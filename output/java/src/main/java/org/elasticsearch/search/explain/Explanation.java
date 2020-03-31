
package org.elasticsearch.search.explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.explain.*;
import org.elasticsearch.internal.*;

public class Explanation  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public Explanation setDescription(String val) { this._description = val; return this; }


  private ExplanationDetail[] _details;
  public ExplanationDetail[] getDetails() { return this._details; }
  public Explanation setDetails(ExplanationDetail[] val) { this._details = val; return this; }


  private Float _value;
  public Float getValue() { return this._value; }
  public Explanation setValue(Float val) { this._value = val; return this; }

}
