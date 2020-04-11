
package org.elasticsearch.x_pack.license.get_license;

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
import org.elasticsearch.x_pack.license.get_license.*;

public class LicenseInformation  implements XContentable<LicenseInformation> {
  
  static final ParseField EXPIRY_DATE = new ParseField("expiry_date");
  private Date _expiryDate;
  public Date getExpiryDate() { return this._expiryDate; }
  public LicenseInformation setExpiryDate(Date val) { this._expiryDate = val; return this; }


  static final ParseField EXPIRY_DATE_IN_MILLIS = new ParseField("expiry_date_in_millis");
  private Long _expiryDateInMillis;
  public Long getExpiryDateInMillis() { return this._expiryDateInMillis; }
  public LicenseInformation setExpiryDateInMillis(Long val) { this._expiryDateInMillis = val; return this; }


  static final ParseField ISSUE_DATE = new ParseField("issue_date");
  private Date _issueDate;
  public Date getIssueDate() { return this._issueDate; }
  public LicenseInformation setIssueDate(Date val) { this._issueDate = val; return this; }


  static final ParseField ISSUE_DATE_IN_MILLIS = new ParseField("issue_date_in_millis");
  private Long _issueDateInMillis;
  public Long getIssueDateInMillis() { return this._issueDateInMillis; }
  public LicenseInformation setIssueDateInMillis(Long val) { this._issueDateInMillis = val; return this; }


  static final ParseField ISSUED_TO = new ParseField("issued_to");
  private String _issuedTo;
  public String getIssuedTo() { return this._issuedTo; }
  public LicenseInformation setIssuedTo(String val) { this._issuedTo = val; return this; }


  static final ParseField ISSUER = new ParseField("issuer");
  private String _issuer;
  public String getIssuer() { return this._issuer; }
  public LicenseInformation setIssuer(String val) { this._issuer = val; return this; }


  static final ParseField MAX_NODES = new ParseField("max_nodes");
  private Long _maxNodes;
  public Long getMaxNodes() { return this._maxNodes; }
  public LicenseInformation setMaxNodes(Long val) { this._maxNodes = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private LicenseStatus _status;
  public LicenseStatus getStatus() { return this._status; }
  public LicenseInformation setStatus(LicenseStatus val) { this._status = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private LicenseType _type;
  public LicenseType getType() { return this._type; }
  public LicenseInformation setType(LicenseType val) { this._type = val; return this; }


  static final ParseField UID = new ParseField("uid");
  private String _uid;
  public String getUid() { return this._uid; }
  public LicenseInformation setUid(String val) { this._uid = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LicenseInformation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LicenseInformation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LicenseInformation, Void> PARSER =
    new ConstructingObjectParser<>(LicenseInformation.class.getName(), false, args -> new LicenseInformation());

  static {
    PARSER.declareObject(LicenseInformation::setExpiryDate, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), EXPIRY_DATE);
    PARSER.declareLong(LicenseInformation::setExpiryDateInMillis, EXPIRY_DATE_IN_MILLIS);
    PARSER.declareObject(LicenseInformation::setIssueDate, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), ISSUE_DATE);
    PARSER.declareLong(LicenseInformation::setIssueDateInMillis, ISSUE_DATE_IN_MILLIS);
    PARSER.declareString(LicenseInformation::setIssuedTo, ISSUED_TO);
    PARSER.declareString(LicenseInformation::setIssuer, ISSUER);
    PARSER.declareLong(LicenseInformation::setMaxNodes, MAX_NODES);
    PARSER.declareObject(LicenseInformation::setStatus, (p, t) -> LicenseStatus.PARSER.apply(p), STATUS);
    PARSER.declareObject(LicenseInformation::setType, (p, t) -> LicenseType.PARSER.apply(p), TYPE);
    PARSER.declareString(LicenseInformation::setUid, UID);
  }

}
