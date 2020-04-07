
package org.elasticsearch.cat.cat_indices;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class CatIndicesRequest  implements XContentable<CatIndicesRequest> {
  
  static final ParseField BYTES = new ParseField("bytes");
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatIndicesRequest setBytes(Bytes val) { this._bytes = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatIndicesRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatIndicesRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HEALTH = new ParseField("health");
  private Health _health;
  public Health getHealth() { return this._health; }
  public CatIndicesRequest setHealth(Health val) { this._health = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatIndicesRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField INCLUDE_UNLOADED_SEGMENTS = new ParseField("include_unloaded_segments");
  private Boolean _includeUnloadedSegments;
  public Boolean getIncludeUnloadedSegments() { return this._includeUnloadedSegments; }
  public CatIndicesRequest setIncludeUnloadedSegments(Boolean val) { this._includeUnloadedSegments = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatIndicesRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatIndicesRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField PRI = new ParseField("pri");
  private Boolean _pri;
  public Boolean getPri() { return this._pri; }
  public CatIndicesRequest setPri(Boolean val) { this._pri = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatIndicesRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatIndicesRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatIndicesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatIndicesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatIndicesRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatIndicesRequest.class.getName(), false, args -> new CatIndicesRequest());

  static {
    PARSER.declareObject(CatIndicesRequest::setBytes, (p, t) -> Bytes.PARSER.apply(p, null), BYTES);
    PARSER.declareString(CatIndicesRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatIndicesRequest::setHeaders, HEADERS);
    PARSER.declareObject(CatIndicesRequest::setHealth, (p, t) -> Health.PARSER.apply(p, null), HEALTH);
    PARSER.declareBoolean(CatIndicesRequest::setHelp, HELP);
    PARSER.declareBoolean(CatIndicesRequest::setIncludeUnloadedSegments, INCLUDE_UNLOADED_SEGMENTS);
    PARSER.declareBoolean(CatIndicesRequest::setLocal, LOCAL);
    PARSER.declareObject(CatIndicesRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareBoolean(CatIndicesRequest::setPri, PRI);
    PARSER.declareStringArray(CatIndicesRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatIndicesRequest::setVerbose, VERBOSE);
  }

}
