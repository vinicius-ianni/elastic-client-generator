
package org.elasticsearch.mapping.dynamic_template;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.mapping.types.*;
import org.elasticsearch.mapping.dynamic_template.*;

public class DynamicTemplate  implements XContentable<DynamicTemplate> {
  
  static final ParseField MAPPING = new ParseField("mapping");
  private IProperty _mapping;
  public IProperty getMapping() { return this._mapping; }
  public DynamicTemplate setMapping(IProperty val) { this._mapping = val; return this; }


  static final ParseField MATCH = new ParseField("match");
  private String _match;
  public String getMatch() { return this._match; }
  public DynamicTemplate setMatch(String val) { this._match = val; return this; }


  static final ParseField MATCH_MAPPING_TYPE = new ParseField("match_mapping_type");
  private String _matchMappingType;
  public String getMatchMappingType() { return this._matchMappingType; }
  public DynamicTemplate setMatchMappingType(String val) { this._matchMappingType = val; return this; }


  static final ParseField MATCH_PATTERN = new ParseField("match_pattern");
  private MatchType _matchPattern;
  public MatchType getMatchPattern() { return this._matchPattern; }
  public DynamicTemplate setMatchPattern(MatchType val) { this._matchPattern = val; return this; }


  static final ParseField PATH_MATCH = new ParseField("path_match");
  private String _pathMatch;
  public String getPathMatch() { return this._pathMatch; }
  public DynamicTemplate setPathMatch(String val) { this._pathMatch = val; return this; }


  static final ParseField PATH_UNMATCH = new ParseField("path_unmatch");
  private String _pathUnmatch;
  public String getPathUnmatch() { return this._pathUnmatch; }
  public DynamicTemplate setPathUnmatch(String val) { this._pathUnmatch = val; return this; }


  static final ParseField UNMATCH = new ParseField("unmatch");
  private String _unmatch;
  public String getUnmatch() { return this._unmatch; }
  public DynamicTemplate setUnmatch(String val) { this._unmatch = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DynamicTemplate fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DynamicTemplate.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DynamicTemplate, Void> PARSER =
    new ConstructingObjectParser<>(DynamicTemplate.class.getName(), false, args -> new DynamicTemplate());

  static {
    PARSER.declareObject(DynamicTemplate::setMapping, (p, t) -> IProperty.PARSER.apply(p, null), MAPPING);
    PARSER.declareString(DynamicTemplate::setMatch, MATCH);
    PARSER.declareString(DynamicTemplate::setMatchMappingType, MATCH_MAPPING_TYPE);
    PARSER.declareObject(DynamicTemplate::setMatchPattern, (p, t) -> MatchType.PARSER.apply(p, null), MATCH_PATTERN);
    PARSER.declareString(DynamicTemplate::setPathMatch, PATH_MATCH);
    PARSER.declareString(DynamicTemplate::setPathUnmatch, PATH_UNMATCH);
    PARSER.declareString(DynamicTemplate::setUnmatch, UNMATCH);
  }

}
