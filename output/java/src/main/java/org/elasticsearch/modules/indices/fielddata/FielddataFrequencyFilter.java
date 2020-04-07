
package org.elasticsearch.modules.indices.fielddata;

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

public class FielddataFrequencyFilter  implements XContentable<FielddataFrequencyFilter> {
  
  static final ParseField MAX = new ParseField("max");
  private Double _max;
  public Double getMax() { return this._max; }
  public FielddataFrequencyFilter setMax(Double val) { this._max = val; return this; }


  static final ParseField MIN = new ParseField("min");
  private Double _min;
  public Double getMin() { return this._min; }
  public FielddataFrequencyFilter setMin(Double val) { this._min = val; return this; }


  static final ParseField MIN_SEGMENT_SIZE = new ParseField("min_segment_size");
  private Integer _minSegmentSize;
  public Integer getMinSegmentSize() { return this._minSegmentSize; }
  public FielddataFrequencyFilter setMinSegmentSize(Integer val) { this._minSegmentSize = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FielddataFrequencyFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FielddataFrequencyFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FielddataFrequencyFilter, Void> PARSER =
    new ConstructingObjectParser<>(FielddataFrequencyFilter.class.getName(), false, args -> new FielddataFrequencyFilter());

  static {
    PARSER.declareDouble(FielddataFrequencyFilter::setMax, MAX);
    PARSER.declareDouble(FielddataFrequencyFilter::setMin, MIN);
    PARSER.declareInteger(FielddataFrequencyFilter::setMinSegmentSize, MIN_SEGMENT_SIZE);
  }

}
