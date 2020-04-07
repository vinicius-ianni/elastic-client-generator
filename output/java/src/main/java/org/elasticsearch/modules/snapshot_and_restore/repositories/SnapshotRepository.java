
package org.elasticsearch.modules.snapshot_and_restore.repositories;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class SnapshotRepository  implements XContentable<SnapshotRepository> {
  
  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public SnapshotRepository setType(String val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SnapshotRepository fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SnapshotRepository.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SnapshotRepository, Void> PARSER =
    new ConstructingObjectParser<>(SnapshotRepository.class.getName(), false, args -> new SnapshotRepository());

  static {
    PARSER.declareString(SnapshotRepository::setType, TYPE);
  }

}
