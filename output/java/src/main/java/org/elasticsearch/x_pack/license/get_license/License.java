
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

public class License  implements XContentable<License> {
  
  static final ParseField EXPIRY_DATE_IN_MILLIS = new ParseField("expiry_date_in_millis");
  private Long _expiryDateInMillis;
  public Long getExpiryDateInMillis() { return this._expiryDateInMillis; }
  public License setExpiryDateInMillis(Long val) { this._expiryDateInMillis = val; return this; }


  static final ParseField ISSUE_DATE_IN_MILLIS = new ParseField("issue_date_in_millis");
  private Long _issueDateInMillis;
  public Long getIssueDateInMillis() { return this._issueDateInMillis; }
  public License setIssueDateInMillis(Long val) { this._issueDateInMillis = val; return this; }


  static final ParseField ISSUED_TO = new ParseField("issued_to");
  private String _issuedTo;
  public String getIssuedTo() { return this._issuedTo; }
  public License setIssuedTo(String val) { this._issuedTo = val; return this; }


  static final ParseField ISSUER = new ParseField("issuer");
  private String _issuer;
  public String getIssuer() { return this._issuer; }
  public License setIssuer(String val) { this._issuer = val; return this; }


  static final ParseField MAX_NODES = new ParseField("max_nodes");
  private Long _maxNodes;
  public Long getMaxNodes() { return this._maxNodes; }
  public License setMaxNodes(Long val) { this._maxNodes = val; return this; }


  static final ParseField SIGNATURE = new ParseField("signature");
  private String _signature;
  public String getSignature() { return this._signature; }
  public License setSignature(String val) { this._signature = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private LicenseType _type;
  public LicenseType getType() { return this._type; }
  public License setType(LicenseType val) { this._type = val; return this; }


  static final ParseField UID = new ParseField("uid");
  private String _uid;
  public String getUid() { return this._uid; }
  public License setUid(String val) { this._uid = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public License fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return License.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<License, Void> PARSER =
    new ConstructingObjectParser<>(License.class.getName(), false, args -> new License());

  static {
    PARSER.declareLong(License::setExpiryDateInMillis, EXPIRY_DATE_IN_MILLIS);
    PARSER.declareLong(License::setIssueDateInMillis, ISSUE_DATE_IN_MILLIS);
    PARSER.declareString(License::setIssuedTo, ISSUED_TO);
    PARSER.declareString(License::setIssuer, ISSUER);
    PARSER.declareLong(License::setMaxNodes, MAX_NODES);
    PARSER.declareString(License::setSignature, SIGNATURE);
    PARSER.declareObject(License::setType, (p, t) -> LicenseType.PARSER.apply(p), TYPE);
    PARSER.declareString(License::setUid, UID);
  }

}
