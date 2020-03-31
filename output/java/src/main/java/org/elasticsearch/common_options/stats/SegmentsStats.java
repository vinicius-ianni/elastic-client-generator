
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.indices.monitoring.indices_stats.*;

public class SegmentsStats  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public SegmentsStats setCount(Long val) { this._count = val; return this; }


  private Long _docValuesMemoryInBytes;
  public Long getDocValuesMemoryInBytes() { return this._docValuesMemoryInBytes; }
  public SegmentsStats setDocValuesMemoryInBytes(Long val) { this._docValuesMemoryInBytes = val; return this; }


  private Long _fixedBitSetMemoryInBytes;
  public Long getFixedBitSetMemoryInBytes() { return this._fixedBitSetMemoryInBytes; }
  public SegmentsStats setFixedBitSetMemoryInBytes(Long val) { this._fixedBitSetMemoryInBytes = val; return this; }


  private Long _indexWriterMaxMemoryInBytes;
  public Long getIndexWriterMaxMemoryInBytes() { return this._indexWriterMaxMemoryInBytes; }
  public SegmentsStats setIndexWriterMaxMemoryInBytes(Long val) { this._indexWriterMaxMemoryInBytes = val; return this; }


  private Long _indexWriterMemoryInBytes;
  public Long getIndexWriterMemoryInBytes() { return this._indexWriterMemoryInBytes; }
  public SegmentsStats setIndexWriterMemoryInBytes(Long val) { this._indexWriterMemoryInBytes = val; return this; }


  private Long _maxUnsafeAutoIdTimestamp;
  public Long getMaxUnsafeAutoIdTimestamp() { return this._maxUnsafeAutoIdTimestamp; }
  public SegmentsStats setMaxUnsafeAutoIdTimestamp(Long val) { this._maxUnsafeAutoIdTimestamp = val; return this; }


  private Long _memoryInBytes;
  public Long getMemoryInBytes() { return this._memoryInBytes; }
  public SegmentsStats setMemoryInBytes(Long val) { this._memoryInBytes = val; return this; }


  private Long _normsMemoryInBytes;
  public Long getNormsMemoryInBytes() { return this._normsMemoryInBytes; }
  public SegmentsStats setNormsMemoryInBytes(Long val) { this._normsMemoryInBytes = val; return this; }


  private Long _pointsMemoryInBytes;
  public Long getPointsMemoryInBytes() { return this._pointsMemoryInBytes; }
  public SegmentsStats setPointsMemoryInBytes(Long val) { this._pointsMemoryInBytes = val; return this; }


  private Long _storedFieldsMemoryInBytes;
  public Long getStoredFieldsMemoryInBytes() { return this._storedFieldsMemoryInBytes; }
  public SegmentsStats setStoredFieldsMemoryInBytes(Long val) { this._storedFieldsMemoryInBytes = val; return this; }


  private Long _termsMemoryInBytes;
  public Long getTermsMemoryInBytes() { return this._termsMemoryInBytes; }
  public SegmentsStats setTermsMemoryInBytes(Long val) { this._termsMemoryInBytes = val; return this; }


  private Long _termVectorsMemoryInBytes;
  public Long getTermVectorsMemoryInBytes() { return this._termVectorsMemoryInBytes; }
  public SegmentsStats setTermVectorsMemoryInBytes(Long val) { this._termVectorsMemoryInBytes = val; return this; }


  private Long _versionMapMemoryInBytes;
  public Long getVersionMapMemoryInBytes() { return this._versionMapMemoryInBytes; }
  public SegmentsStats setVersionMapMemoryInBytes(Long val) { this._versionMapMemoryInBytes = val; return this; }


  private Map<String, ShardFileSizeInfo> _fileSizes;
  public Map<String, ShardFileSizeInfo> getFileSizes() { return this._fileSizes; }
  public SegmentsStats setFileSizes(Map<String, ShardFileSizeInfo> val) { this._fileSizes = val; return this; }

}
