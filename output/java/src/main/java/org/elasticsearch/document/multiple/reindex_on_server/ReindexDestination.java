
package org.elasticsearch.document.multiple.reindex_on_server;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common.*;
import org.elasticsearch.document.multiple.reindex_on_server.*;

public class ReindexDestination  {
  
  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public ReindexDestination setIndex(IndexName val) { this._index = val; return this; }


  private OpType _opType;
  public OpType getOpType() { return this._opType; }
  public ReindexDestination setOpType(OpType val) { this._opType = val; return this; }


  private ReindexRouting _routing;
  public ReindexRouting getRouting() { return this._routing; }
  public ReindexDestination setRouting(ReindexRouting val) { this._routing = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public ReindexDestination setVersionType(VersionType val) { this._versionType = val; return this; }

}
