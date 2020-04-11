
package org.elasticsearch.cluster.nodes_stats;

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

public class JvmClassesStats  implements XContentable<JvmClassesStats> {
  
  static final ParseField CURRENT_LOADED_COUNT = new ParseField("current_loaded_count");
  private Long _currentLoadedCount;
  public Long getCurrentLoadedCount() { return this._currentLoadedCount; }
  public JvmClassesStats setCurrentLoadedCount(Long val) { this._currentLoadedCount = val; return this; }


  static final ParseField TOTAL_LOADED_COUNT = new ParseField("total_loaded_count");
  private Long _totalLoadedCount;
  public Long getTotalLoadedCount() { return this._totalLoadedCount; }
  public JvmClassesStats setTotalLoadedCount(Long val) { this._totalLoadedCount = val; return this; }


  static final ParseField TOTAL_UNLOADED_COUNT = new ParseField("total_unloaded_count");
  private Long _totalUnloadedCount;
  public Long getTotalUnloadedCount() { return this._totalUnloadedCount; }
  public JvmClassesStats setTotalUnloadedCount(Long val) { this._totalUnloadedCount = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public JvmClassesStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return JvmClassesStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<JvmClassesStats, Void> PARSER =
    new ConstructingObjectParser<>(JvmClassesStats.class.getName(), false, args -> new JvmClassesStats());

  static {
    PARSER.declareLong(JvmClassesStats::setCurrentLoadedCount, CURRENT_LOADED_COUNT);
    PARSER.declareLong(JvmClassesStats::setTotalLoadedCount, TOTAL_LOADED_COUNT);
    PARSER.declareLong(JvmClassesStats::setTotalUnloadedCount, TOTAL_UNLOADED_COUNT);
  }

}
