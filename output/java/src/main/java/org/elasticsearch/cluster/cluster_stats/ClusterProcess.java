
package org.elasticsearch.cluster.cluster_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cluster.cluster_stats.*;

public class ClusterProcess  implements XContentable<ClusterProcess> {
  
  static final ParseField CPU = new ParseField("cpu");
  private ClusterProcessCpu _cpu;
  public ClusterProcessCpu getCpu() { return this._cpu; }
  public ClusterProcess setCpu(ClusterProcessCpu val) { this._cpu = val; return this; }


  static final ParseField OPEN_FILE_DESCRIPTORS = new ParseField("open_file_descriptors");
  private ClusterProcessOpenFileDescriptors _openFileDescriptors;
  public ClusterProcessOpenFileDescriptors getOpenFileDescriptors() { return this._openFileDescriptors; }
  public ClusterProcess setOpenFileDescriptors(ClusterProcessOpenFileDescriptors val) { this._openFileDescriptors = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterProcess fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterProcess.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterProcess, Void> PARSER =
    new ConstructingObjectParser<>(ClusterProcess.class.getName(), false, args -> new ClusterProcess());

  static {
    PARSER.declareObject(ClusterProcess::setCpu, (p, t) -> ClusterProcessCpu.PARSER.apply(p, null), CPU);
    PARSER.declareObject(ClusterProcess::setOpenFileDescriptors, (p, t) -> ClusterProcessOpenFileDescriptors.PARSER.apply(p, null), OPEN_FILE_DESCRIPTORS);
  }

}
