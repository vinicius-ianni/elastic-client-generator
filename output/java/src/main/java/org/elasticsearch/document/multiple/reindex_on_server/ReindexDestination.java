
package org.elasticsearch.document.multiple.reindex_on_server;

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
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common.*;
import org.elasticsearch.document.multiple.reindex_on_server.*;

public class ReindexDestination  implements XContentable<ReindexDestination> {
  
  static final ParseField INDEX = new ParseField("index");
  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public ReindexDestination setIndex(IndexName val) { this._index = val; return this; }


  static final ParseField OP_TYPE = new ParseField("op_type");
  private OpType _opType;
  public OpType getOpType() { return this._opType; }
  public ReindexDestination setOpType(OpType val) { this._opType = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private ReindexRouting _routing;
  public ReindexRouting getRouting() { return this._routing; }
  public ReindexDestination setRouting(ReindexRouting val) { this._routing = val; return this; }


  static final ParseField VERSION_TYPE = new ParseField("version_type");
  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public ReindexDestination setVersionType(VersionType val) { this._versionType = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(INDEX.getPreferredName());
    _index.toXContent(builder, params);
    if (_opType != null) {
      builder.field(OP_TYPE.getPreferredName());
      _opType.toXContent(builder, params);
    }
    if (_routing != null) {
      builder.field(ROUTING.getPreferredName());
      _routing.toXContent(builder, params);
    }
    if (_versionType != null) {
      builder.field(VERSION_TYPE.getPreferredName());
      _versionType.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public ReindexDestination fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReindexDestination.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ReindexDestination, Void> PARSER =
    new ConstructingObjectParser<>(ReindexDestination.class.getName(), false, args -> new ReindexDestination());

  static {
    PARSER.declareObject(ReindexDestination::setIndex, (p, t) -> IndexName.createFrom(p), INDEX);
    PARSER.declareObject(ReindexDestination::setOpType, (p, t) -> OpType.PARSER.apply(p), OP_TYPE);
    PARSER.declareObject(ReindexDestination::setRouting, (p, t) -> ReindexRouting.PARSER.apply(p, t), ROUTING);
    PARSER.declareObject(ReindexDestination::setVersionType, (p, t) -> VersionType.PARSER.apply(p), VERSION_TYPE);
  }

}
