
package org.elasticsearch.cat.cat_allocation;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class CatAllocationRecord  implements XContentable<CatAllocationRecord> {
  
  static final ParseField DISK_AVAIL = new ParseField("diskAvail");
  private String _diskAvail;
  public String getDiskAvail() { return this._diskAvail; }
  public CatAllocationRecord setDiskAvail(String val) { this._diskAvail = val; return this; }


  static final ParseField DISK_RATIO = new ParseField("diskRatio");
  private String _diskRatio;
  public String getDiskRatio() { return this._diskRatio; }
  public CatAllocationRecord setDiskRatio(String val) { this._diskRatio = val; return this; }


  static final ParseField DISK_USED = new ParseField("diskUsed");
  private String _diskUsed;
  public String getDiskUsed() { return this._diskUsed; }
  public CatAllocationRecord setDiskUsed(String val) { this._diskUsed = val; return this; }


  static final ParseField IP = new ParseField("ip");
  private String _ip;
  public String getIp() { return this._ip; }
  public CatAllocationRecord setIp(String val) { this._ip = val; return this; }


  static final ParseField NODE = new ParseField("node");
  private String _node;
  public String getNode() { return this._node; }
  public CatAllocationRecord setNode(String val) { this._node = val; return this; }


  static final ParseField SHARDS = new ParseField("shards");
  private String _shards;
  public String getShards() { return this._shards; }
  public CatAllocationRecord setShards(String val) { this._shards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatAllocationRecord fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatAllocationRecord.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatAllocationRecord, Void> PARSER =
    new ConstructingObjectParser<>(CatAllocationRecord.class.getName(), false, args -> new CatAllocationRecord());

  static {
    PARSER.declareString(CatAllocationRecord::setDiskAvail, DISK_AVAIL);
    PARSER.declareString(CatAllocationRecord::setDiskRatio, DISK_RATIO);
    PARSER.declareString(CatAllocationRecord::setDiskUsed, DISK_USED);
    PARSER.declareString(CatAllocationRecord::setIp, IP);
    PARSER.declareString(CatAllocationRecord::setNode, NODE);
    PARSER.declareString(CatAllocationRecord::setShards, SHARDS);
  }

}
