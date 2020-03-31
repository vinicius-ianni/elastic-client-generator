
package org.elasticsearch.search.explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.explain.*;
import org.elasticsearch.internal.*;

public class ExplanationDetail  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public ExplanationDetail setDescription(String val) { this._description = val; return this; }


  private ExplanationDetail[] _details;
  public ExplanationDetail[] getDetails() { return this._details; }
  public ExplanationDetail setDetails(ExplanationDetail[] val) { this._details = val; return this; }


  private Float _value;
  public Float getValue() { return this._value; }
  public ExplanationDetail setValue(Float val) { this._value = val; return this; }

}
