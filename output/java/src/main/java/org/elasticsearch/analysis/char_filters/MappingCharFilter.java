
package org.elasticsearch.analysis.char_filters;

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


public class MappingCharFilter  implements XContentable<MappingCharFilter> {
  
  static final ParseField MAPPINGS = new ParseField("mappings");
  private List<String> _mappings;
  public List<String> getMappings() { return this._mappings; }
  public MappingCharFilter setMappings(List<String> val) { this._mappings = val; return this; }


  static final ParseField MAPPINGS_PATH = new ParseField("mappings_path");
  private String _mappingsPath;
  public String getMappingsPath() { return this._mappingsPath; }
  public MappingCharFilter setMappingsPath(String val) { this._mappingsPath = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MappingCharFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MappingCharFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MappingCharFilter, Void> PARSER =
    new ConstructingObjectParser<>(MappingCharFilter.class.getName(), false, args -> new MappingCharFilter());

  static {
    PARSER.declareStringArray(MappingCharFilter::setMappings, MAPPINGS);
    PARSER.declareString(MappingCharFilter::setMappingsPath, MAPPINGS_PATH);
  }

}
