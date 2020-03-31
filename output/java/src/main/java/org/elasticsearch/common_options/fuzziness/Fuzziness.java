
package org.elasticsearch.common_options.fuzziness;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class Fuzziness  {
  
  private Boolean _auto;
  public Boolean getAuto() { return this._auto; }
  public Fuzziness setAuto(Boolean val) { this._auto = val; return this; }


  private Integer _low;
  public Integer getLow() { return this._low; }
  public Fuzziness setLow(Integer val) { this._low = val; return this; }


  private Integer _high;
  public Integer getHigh() { return this._high; }
  public Fuzziness setHigh(Integer val) { this._high = val; return this; }


  private Integer _editDistance;
  public Integer getEditDistance() { return this._editDistance; }
  public Fuzziness setEditDistance(Integer val) { this._editDistance = val; return this; }


  private Double _ratio;
  public Double getRatio() { return this._ratio; }
  public Fuzziness setRatio(Double val) { this._ratio = val; return this; }

}
