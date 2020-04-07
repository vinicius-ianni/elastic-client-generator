
package org.elasticsearch.x_pack.slm.put_lifecycle;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.slm.*;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class PutSnapshotLifecycleRequest  implements XContentable<PutSnapshotLifecycleRequest> {
  
  static final ParseField CONFIG = new ParseField("config");
  private SnapshotLifecycleConfig _config;
  public SnapshotLifecycleConfig getConfig() { return this._config; }
  public PutSnapshotLifecycleRequest setConfig(SnapshotLifecycleConfig val) { this._config = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public PutSnapshotLifecycleRequest setName(String val) { this._name = val; return this; }


  static final ParseField REPOSITORY = new ParseField("repository");
  private String _repository;
  public String getRepository() { return this._repository; }
  public PutSnapshotLifecycleRequest setRepository(String val) { this._repository = val; return this; }


  static final ParseField SCHEDULE = new ParseField("schedule");
  private CronExpression _schedule;
  public CronExpression getSchedule() { return this._schedule; }
  public PutSnapshotLifecycleRequest setSchedule(CronExpression val) { this._schedule = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutSnapshotLifecycleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutSnapshotLifecycleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutSnapshotLifecycleRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutSnapshotLifecycleRequest.class.getName(), false, args -> new PutSnapshotLifecycleRequest());

  static {
    PARSER.declareObject(PutSnapshotLifecycleRequest::setConfig, (p, t) -> SnapshotLifecycleConfig.PARSER.apply(p, null), CONFIG);
    PARSER.declareString(PutSnapshotLifecycleRequest::setName, NAME);
    PARSER.declareString(PutSnapshotLifecycleRequest::setRepository, REPOSITORY);
    PARSER.declareObject(PutSnapshotLifecycleRequest::setSchedule, (p, t) -> CronExpression.PARSER.apply(p, null), SCHEDULE);
  }

}
