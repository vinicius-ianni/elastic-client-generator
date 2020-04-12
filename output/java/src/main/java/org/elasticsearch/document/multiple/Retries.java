
package org.elasticsearch.document.multiple;

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

public class Retries  implements XContentable<Retries> {
  
  static final ParseField BULK = new ParseField("bulk");
  private Long _bulk;
  public Long getBulk() { return this._bulk; }
  public Retries setBulk(Long val) { this._bulk = val; return this; }


  static final ParseField SEARCH = new ParseField("search");
  private Long _search;
  public Long getSearch() { return this._search; }
  public Retries setSearch(Long val) { this._search = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(BULK.getPreferredName(), _bulk);
    builder.field(SEARCH.getPreferredName(), _search);
    return builder;
  }

  @Override
  public Retries fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Retries.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Retries, Void> PARSER =
    new ConstructingObjectParser<>(Retries.class.getName(), false, args -> new Retries());

  static {
    PARSER.declareLong(Retries::setBulk, BULK);
    PARSER.declareLong(Retries::setSearch, SEARCH);
  }

}
