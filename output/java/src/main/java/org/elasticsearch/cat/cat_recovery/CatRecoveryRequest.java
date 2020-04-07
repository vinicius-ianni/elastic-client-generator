
package org.elasticsearch.cat.cat_recovery;

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

public class CatRecoveryRequest  implements XContentable<CatRecoveryRequest> {
  
  static final ParseField BYTES = new ParseField("bytes");
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatRecoveryRequest setBytes(Bytes val) { this._bytes = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatRecoveryRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatRecoveryRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatRecoveryRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatRecoveryRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatRecoveryRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatRecoveryRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatRecoveryRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatRecoveryRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatRecoveryRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatRecoveryRequest.class.getName(), false, args -> new CatRecoveryRequest());

  static {
    PARSER.declareObject(CatRecoveryRequest::setBytes, (p, t) -> Bytes.PARSER.apply(p, null), BYTES);
    PARSER.declareString(CatRecoveryRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatRecoveryRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatRecoveryRequest::setHelp, HELP);
    PARSER.declareObject(CatRecoveryRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareStringArray(CatRecoveryRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatRecoveryRequest::setVerbose, VERBOSE);
  }

}
