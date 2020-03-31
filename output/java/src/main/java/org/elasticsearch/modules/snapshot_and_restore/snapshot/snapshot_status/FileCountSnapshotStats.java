
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class FileCountSnapshotStats  {
  
  private Integer _fileCount;
  public Integer getFileCount() { return this._fileCount; }
  public FileCountSnapshotStats setFileCount(Integer val) { this._fileCount = val; return this; }


  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public FileCountSnapshotStats setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }

}
