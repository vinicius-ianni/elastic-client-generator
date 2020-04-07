
package org.elasticsearch.cluster.nodes_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.internal.*;

public class OperatingSystemStats  implements XContentable<OperatingSystemStats> {
  
  static final ParseField CPU = new ParseField("cpu");
  private CpuStats _cpu;
  public CpuStats getCpu() { return this._cpu; }
  public OperatingSystemStats setCpu(CpuStats val) { this._cpu = val; return this; }


  static final ParseField MEM = new ParseField("mem");
  private ExtendedMemoryStats _mem;
  public ExtendedMemoryStats getMem() { return this._mem; }
  public OperatingSystemStats setMem(ExtendedMemoryStats val) { this._mem = val; return this; }


  static final ParseField SWAP = new ParseField("swap");
  private MemoryStats _swap;
  public MemoryStats getSwap() { return this._swap; }
  public OperatingSystemStats setSwap(MemoryStats val) { this._swap = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public OperatingSystemStats setTimestamp(Long val) { this._timestamp = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public OperatingSystemStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return OperatingSystemStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<OperatingSystemStats, Void> PARSER =
    new ConstructingObjectParser<>(OperatingSystemStats.class.getName(), false, args -> new OperatingSystemStats());

  static {
    PARSER.declareObject(OperatingSystemStats::setCpu, (p, t) -> CpuStats.PARSER.apply(p, null), CPU);
    PARSER.declareObject(OperatingSystemStats::setMem, (p, t) -> ExtendedMemoryStats.PARSER.apply(p, null), MEM);
    PARSER.declareObject(OperatingSystemStats::setSwap, (p, t) -> MemoryStats.PARSER.apply(p, null), SWAP);
    PARSER.declareLong(OperatingSystemStats::setTimestamp, TIMESTAMP);
  }

}
