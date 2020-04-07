
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

public class ProcessStats  implements XContentable<ProcessStats> {
  
  static final ParseField CPU = new ParseField("cpu");
  private CpuStats _cpu;
  public CpuStats getCpu() { return this._cpu; }
  public ProcessStats setCpu(CpuStats val) { this._cpu = val; return this; }


  static final ParseField MEM = new ParseField("mem");
  private MemoryStats _mem;
  public MemoryStats getMem() { return this._mem; }
  public ProcessStats setMem(MemoryStats val) { this._mem = val; return this; }


  static final ParseField OPEN_FILE_DESCRIPTORS = new ParseField("open_file_descriptors");
  private Integer _openFileDescriptors;
  public Integer getOpenFileDescriptors() { return this._openFileDescriptors; }
  public ProcessStats setOpenFileDescriptors(Integer val) { this._openFileDescriptors = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public ProcessStats setTimestamp(Long val) { this._timestamp = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ProcessStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ProcessStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ProcessStats, Void> PARSER =
    new ConstructingObjectParser<>(ProcessStats.class.getName(), false, args -> new ProcessStats());

  static {
    PARSER.declareObject(ProcessStats::setCpu, (p, t) -> CpuStats.PARSER.apply(p, null), CPU);
    PARSER.declareObject(ProcessStats::setMem, (p, t) -> MemoryStats.PARSER.apply(p, null), MEM);
    PARSER.declareInteger(ProcessStats::setOpenFileDescriptors, OPEN_FILE_DESCRIPTORS);
    PARSER.declareLong(ProcessStats::setTimestamp, TIMESTAMP);
  }

}
