
package org.elasticsearch.x_pack.sql.query_sql;

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


public class SqlValue  implements XContentable<SqlValue> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SqlValue fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SqlValue.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SqlValue, Void> PARSER =
    new ConstructingObjectParser<>(SqlValue.class.getName(), false, args -> new SqlValue());

  static {
    
  }

}
