
package org.elasticsearch.document.single.term_vectors;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;

public class FieldStatistics  implements XContentable<FieldStatistics> {
  
  static final ParseField DOC_COUNT = new ParseField("doc_count");
  private Integer _docCount;
  public Integer getDocCount() { return this._docCount; }
  public FieldStatistics setDocCount(Integer val) { this._docCount = val; return this; }


  static final ParseField SUM_DOC_FREQ = new ParseField("sum_doc_freq");
  private Integer _sumDocFreq;
  public Integer getSumDocFreq() { return this._sumDocFreq; }
  public FieldStatistics setSumDocFreq(Integer val) { this._sumDocFreq = val; return this; }


  static final ParseField SUM_TTF = new ParseField("sum_ttf");
  private Integer _sumTtf;
  public Integer getSumTtf() { return this._sumTtf; }
  public FieldStatistics setSumTtf(Integer val) { this._sumTtf = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_docCount != null) {
      builder.field(DOC_COUNT.getPreferredName(), _docCount);
    }
    if (_sumDocFreq != null) {
      builder.field(SUM_DOC_FREQ.getPreferredName(), _sumDocFreq);
    }
    if (_sumTtf != null) {
      builder.field(SUM_TTF.getPreferredName(), _sumTtf);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public FieldStatistics fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldStatistics.PARSER.apply(parser, null);
  }

  public static final ObjectParser<FieldStatistics, Void> PARSER =
    new ObjectParser<>(FieldStatistics.class.getName(), false, FieldStatistics::new);

  static {
    PARSER.declareInt(FieldStatistics::setDocCount, DOC_COUNT);
    PARSER.declareInt(FieldStatistics::setSumDocFreq, SUM_DOC_FREQ);
    PARSER.declareInt(FieldStatistics::setSumTtf, SUM_TTF);
  }

}
