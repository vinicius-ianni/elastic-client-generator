
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
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class BulkIndexByScrollFailure  implements XContentable<BulkIndexByScrollFailure> {
  
  static final ParseField CAUSE = new ParseField("cause");
  private MainError _cause;
  public MainError getCause() { return this._cause; }
  public BulkIndexByScrollFailure setCause(MainError val) { this._cause = val; return this; }


  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public BulkIndexByScrollFailure setId(String val) { this._id = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private String _index;
  public String getIndex() { return this._index; }
  public BulkIndexByScrollFailure setIndex(String val) { this._index = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private Integer _status;
  public Integer getStatus() { return this._status; }
  public BulkIndexByScrollFailure setStatus(Integer val) { this._status = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public BulkIndexByScrollFailure setType(String val) { this._type = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_cause != null) {
      builder.field(CAUSE.getPreferredName());
      _cause.toXContent(builder, params);
    }
    builder.field(ID.getPreferredName(), _id);
    builder.field(INDEX.getPreferredName(), _index);
    builder.field(STATUS.getPreferredName(), _status);
    builder.field(TYPE.getPreferredName(), _type);
    builder.endObject();
    return builder;
  }

  @Override
  public BulkIndexByScrollFailure fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return BulkIndexByScrollFailure.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<BulkIndexByScrollFailure, Void> PARSER =
    new ConstructingObjectParser<>(BulkIndexByScrollFailure.class.getName(), false, args -> new BulkIndexByScrollFailure());

  static {
    PARSER.declareObject(BulkIndexByScrollFailure::setCause, (p, t) -> MainError.PARSER.apply(p, t), CAUSE);
    PARSER.declareString(BulkIndexByScrollFailure::setId, ID);
    PARSER.declareString(BulkIndexByScrollFailure::setIndex, INDEX);
    PARSER.declareInt(BulkIndexByScrollFailure::setStatus, STATUS);
    PARSER.declareString(BulkIndexByScrollFailure::setType, TYPE);
  }

}
