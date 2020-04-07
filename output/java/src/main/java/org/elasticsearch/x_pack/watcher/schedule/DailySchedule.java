
package org.elasticsearch.x_pack.watcher.schedule;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.schedule.*;

public class DailySchedule  implements XContentable<DailySchedule> {
  
  static final ParseField AT = new ParseField("at");
  private Either<List<String>, TimeOfDay> _at;
  public Either<List<String>, TimeOfDay> getAt() { return this._at; }
  public DailySchedule setAt(Either<List<String>, TimeOfDay> val) { this._at = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DailySchedule fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DailySchedule.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DailySchedule, Void> PARSER =
    new ConstructingObjectParser<>(DailySchedule.class.getName(), false, args -> new DailySchedule());

  static {
    PARSER.declareObject(DailySchedule::setAt, (p, t) -> null, AT);
  }

}
