
package org.elasticsearch.modules.indices.fielddata;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.indices.fielddata.*;

public class FielddataFilter  {
  
  private FielddataFrequencyFilter _frequency;
  public FielddataFrequencyFilter getFrequency() { return this._frequency; }
  public FielddataFilter setFrequency(FielddataFrequencyFilter val) { this._frequency = val; return this; }


  private FielddataRegexFilter _regex;
  public FielddataRegexFilter getRegex() { return this._regex; }
  public FielddataFilter setRegex(FielddataRegexFilter val) { this._regex = val; return this; }

}
