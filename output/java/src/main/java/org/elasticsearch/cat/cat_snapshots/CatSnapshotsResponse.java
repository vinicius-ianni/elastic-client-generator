
package org.elasticsearch.cat.cat_snapshots;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_snapshots.*;

public class CatSnapshotsResponse  {
  
  private CatSnapshotsRecord[] _records;
  public CatSnapshotsRecord[] getRecords() { return this._records; }
  public CatSnapshotsResponse setRecords(CatSnapshotsRecord[] val) { this._records = val; return this; }

}
