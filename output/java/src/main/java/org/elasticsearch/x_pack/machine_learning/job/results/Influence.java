
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class Influence  {
  
  private String _influencerFieldName;
  public String getInfluencerFieldName() { return this._influencerFieldName; }
  public Influence setInfluencerFieldName(String val) { this._influencerFieldName = val; return this; }


  private String[] _influencerFieldValues;
  public String[] getInfluencerFieldValues() { return this._influencerFieldValues; }
  public Influence setInfluencerFieldValues(String[] val) { this._influencerFieldValues = val; return this; }

}
