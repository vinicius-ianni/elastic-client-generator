
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


public class SqlColumn  implements XContentable<SqlColumn> {
  
  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public SqlColumn setName(String val) { this._name = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public SqlColumn setType(String val) { this._type = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SqlColumn fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SqlColumn.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SqlColumn, Void> PARSER =
    new ConstructingObjectParser<>(SqlColumn.class.getName(), false, args -> new SqlColumn());

  static {
    PARSER.declareString(SqlColumn::setName, NAME);
    PARSER.declareString(SqlColumn::setType, TYPE);
  }

}
