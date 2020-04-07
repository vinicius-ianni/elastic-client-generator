
package org.elasticsearch.common_options.fuzziness;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class Fuzziness  implements XContentable<Fuzziness> {
  
  static final ParseField AUTO = new ParseField("auto");
  private Boolean _auto;
  public Boolean getAuto() { return this._auto; }
  public Fuzziness setAuto(Boolean val) { this._auto = val; return this; }


  static final ParseField LOW = new ParseField("low");
  private Integer _low;
  public Integer getLow() { return this._low; }
  public Fuzziness setLow(Integer val) { this._low = val; return this; }


  static final ParseField HIGH = new ParseField("high");
  private Integer _high;
  public Integer getHigh() { return this._high; }
  public Fuzziness setHigh(Integer val) { this._high = val; return this; }


  static final ParseField EDIT_DISTANCE = new ParseField("edit_distance");
  private Integer _editDistance;
  public Integer getEditDistance() { return this._editDistance; }
  public Fuzziness setEditDistance(Integer val) { this._editDistance = val; return this; }


  static final ParseField RATIO = new ParseField("ratio");
  private Double _ratio;
  public Double getRatio() { return this._ratio; }
  public Fuzziness setRatio(Double val) { this._ratio = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Fuzziness fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Fuzziness.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Fuzziness, Void> PARSER =
    new ConstructingObjectParser<>(Fuzziness.class.getName(), false, args -> new Fuzziness());

  static {
    PARSER.declareBoolean(Fuzziness::setAuto, AUTO);
    PARSER.declareInteger(Fuzziness::setLow, LOW);
    PARSER.declareInteger(Fuzziness::setHigh, HIGH);
    PARSER.declareInteger(Fuzziness::setEditDistance, EDIT_DISTANCE);
    PARSER.declareDouble(Fuzziness::setRatio, RATIO);
  }

}
