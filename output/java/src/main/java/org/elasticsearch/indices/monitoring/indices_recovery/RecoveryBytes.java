
package org.elasticsearch.indices.monitoring.indices_recovery;

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

public class RecoveryBytes  implements XContentable<RecoveryBytes> {
  
  static final ParseField PERCENT = new ParseField("percent");
  private String _percent;
  public String getPercent() { return this._percent; }
  public RecoveryBytes setPercent(String val) { this._percent = val; return this; }


  static final ParseField RECOVERED = new ParseField("recovered");
  private Long _recovered;
  public Long getRecovered() { return this._recovered; }
  public RecoveryBytes setRecovered(Long val) { this._recovered = val; return this; }


  static final ParseField REUSED = new ParseField("reused");
  private Long _reused;
  public Long getReused() { return this._reused; }
  public RecoveryBytes setReused(Long val) { this._reused = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Long _total;
  public Long getTotal() { return this._total; }
  public RecoveryBytes setTotal(Long val) { this._total = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(PERCENT.getPreferredName(), _percent);
    builder.field(RECOVERED.getPreferredName(), _recovered);
    builder.field(REUSED.getPreferredName(), _reused);
    builder.field(TOTAL.getPreferredName(), _total);
    builder.endObject();
    return builder;
  }

  @Override
  public RecoveryBytes fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryBytes.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RecoveryBytes, Void> PARSER =
    new ConstructingObjectParser<>(RecoveryBytes.class.getName(), false, args -> new RecoveryBytes());

  static {
    PARSER.declareString(RecoveryBytes::setPercent, PERCENT);
    PARSER.declareLong(RecoveryBytes::setRecovered, RECOVERED);
    PARSER.declareLong(RecoveryBytes::setReused, REUSED);
    PARSER.declareLong(RecoveryBytes::setTotal, TOTAL);
  }

}
