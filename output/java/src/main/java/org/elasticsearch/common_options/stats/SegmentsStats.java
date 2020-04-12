
package org.elasticsearch.common_options.stats;

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
import org.elasticsearch.indices.monitoring.indices_stats.*;

public class SegmentsStats  implements XContentable<SegmentsStats> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public SegmentsStats setCount(Long val) { this._count = val; return this; }


  static final ParseField DOC_VALUES_MEMORY_IN_BYTES = new ParseField("doc_values_memory_in_bytes");
  private Long _docValuesMemoryInBytes;
  public Long getDocValuesMemoryInBytes() { return this._docValuesMemoryInBytes; }
  public SegmentsStats setDocValuesMemoryInBytes(Long val) { this._docValuesMemoryInBytes = val; return this; }


  static final ParseField FIXED_BIT_SET_MEMORY_IN_BYTES = new ParseField("fixed_bit_set_memory_in_bytes");
  private Long _fixedBitSetMemoryInBytes;
  public Long getFixedBitSetMemoryInBytes() { return this._fixedBitSetMemoryInBytes; }
  public SegmentsStats setFixedBitSetMemoryInBytes(Long val) { this._fixedBitSetMemoryInBytes = val; return this; }


  static final ParseField INDEX_WRITER_MAX_MEMORY_IN_BYTES = new ParseField("index_writer_max_memory_in_bytes");
  private Long _indexWriterMaxMemoryInBytes;
  public Long getIndexWriterMaxMemoryInBytes() { return this._indexWriterMaxMemoryInBytes; }
  public SegmentsStats setIndexWriterMaxMemoryInBytes(Long val) { this._indexWriterMaxMemoryInBytes = val; return this; }


  static final ParseField INDEX_WRITER_MEMORY_IN_BYTES = new ParseField("index_writer_memory_in_bytes");
  private Long _indexWriterMemoryInBytes;
  public Long getIndexWriterMemoryInBytes() { return this._indexWriterMemoryInBytes; }
  public SegmentsStats setIndexWriterMemoryInBytes(Long val) { this._indexWriterMemoryInBytes = val; return this; }


  static final ParseField MAX_UNSAFE_AUTO_ID_TIMESTAMP = new ParseField("max_unsafe_auto_id_timestamp");
  private Long _maxUnsafeAutoIdTimestamp;
  public Long getMaxUnsafeAutoIdTimestamp() { return this._maxUnsafeAutoIdTimestamp; }
  public SegmentsStats setMaxUnsafeAutoIdTimestamp(Long val) { this._maxUnsafeAutoIdTimestamp = val; return this; }


  static final ParseField MEMORY_IN_BYTES = new ParseField("memory_in_bytes");
  private Long _memoryInBytes;
  public Long getMemoryInBytes() { return this._memoryInBytes; }
  public SegmentsStats setMemoryInBytes(Long val) { this._memoryInBytes = val; return this; }


  static final ParseField NORMS_MEMORY_IN_BYTES = new ParseField("norms_memory_in_bytes");
  private Long _normsMemoryInBytes;
  public Long getNormsMemoryInBytes() { return this._normsMemoryInBytes; }
  public SegmentsStats setNormsMemoryInBytes(Long val) { this._normsMemoryInBytes = val; return this; }


  static final ParseField POINTS_MEMORY_IN_BYTES = new ParseField("points_memory_in_bytes");
  private Long _pointsMemoryInBytes;
  public Long getPointsMemoryInBytes() { return this._pointsMemoryInBytes; }
  public SegmentsStats setPointsMemoryInBytes(Long val) { this._pointsMemoryInBytes = val; return this; }


  static final ParseField STORED_FIELDS_MEMORY_IN_BYTES = new ParseField("stored_fields_memory_in_bytes");
  private Long _storedFieldsMemoryInBytes;
  public Long getStoredFieldsMemoryInBytes() { return this._storedFieldsMemoryInBytes; }
  public SegmentsStats setStoredFieldsMemoryInBytes(Long val) { this._storedFieldsMemoryInBytes = val; return this; }


  static final ParseField TERMS_MEMORY_IN_BYTES = new ParseField("terms_memory_in_bytes");
  private Long _termsMemoryInBytes;
  public Long getTermsMemoryInBytes() { return this._termsMemoryInBytes; }
  public SegmentsStats setTermsMemoryInBytes(Long val) { this._termsMemoryInBytes = val; return this; }


  static final ParseField TERM_VECTORS_MEMORY_IN_BYTES = new ParseField("term_vectors_memory_in_bytes");
  private Long _termVectorsMemoryInBytes;
  public Long getTermVectorsMemoryInBytes() { return this._termVectorsMemoryInBytes; }
  public SegmentsStats setTermVectorsMemoryInBytes(Long val) { this._termVectorsMemoryInBytes = val; return this; }


  static final ParseField VERSION_MAP_MEMORY_IN_BYTES = new ParseField("version_map_memory_in_bytes");
  private Long _versionMapMemoryInBytes;
  public Long getVersionMapMemoryInBytes() { return this._versionMapMemoryInBytes; }
  public SegmentsStats setVersionMapMemoryInBytes(Long val) { this._versionMapMemoryInBytes = val; return this; }


  static final ParseField FILE_SIZES = new ParseField("file_sizes");
  private NamedContainer<String, ShardFileSizeInfo> _fileSizes;
  public NamedContainer<String, ShardFileSizeInfo> getFileSizes() { return this._fileSizes; }
  public SegmentsStats setFileSizes(NamedContainer<String, ShardFileSizeInfo> val) { this._fileSizes = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(COUNT.getPreferredName(), _count);
    builder.field(DOC_VALUES_MEMORY_IN_BYTES.getPreferredName(), _docValuesMemoryInBytes);
    builder.field(FIXED_BIT_SET_MEMORY_IN_BYTES.getPreferredName(), _fixedBitSetMemoryInBytes);
    builder.field(INDEX_WRITER_MAX_MEMORY_IN_BYTES.getPreferredName(), _indexWriterMaxMemoryInBytes);
    builder.field(INDEX_WRITER_MEMORY_IN_BYTES.getPreferredName(), _indexWriterMemoryInBytes);
    builder.field(MAX_UNSAFE_AUTO_ID_TIMESTAMP.getPreferredName(), _maxUnsafeAutoIdTimestamp);
    builder.field(MEMORY_IN_BYTES.getPreferredName(), _memoryInBytes);
    builder.field(NORMS_MEMORY_IN_BYTES.getPreferredName(), _normsMemoryInBytes);
    builder.field(POINTS_MEMORY_IN_BYTES.getPreferredName(), _pointsMemoryInBytes);
    builder.field(STORED_FIELDS_MEMORY_IN_BYTES.getPreferredName(), _storedFieldsMemoryInBytes);
    builder.field(TERMS_MEMORY_IN_BYTES.getPreferredName(), _termsMemoryInBytes);
    builder.field(TERM_VECTORS_MEMORY_IN_BYTES.getPreferredName(), _termVectorsMemoryInBytes);
    builder.field(VERSION_MAP_MEMORY_IN_BYTES.getPreferredName(), _versionMapMemoryInBytes);
    if (_fileSizes != null) {
      builder.field(FILE_SIZES.getPreferredName());
      _fileSizes.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public SegmentsStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SegmentsStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SegmentsStats, Void> PARSER =
    new ConstructingObjectParser<>(SegmentsStats.class.getName(), false, args -> new SegmentsStats());

  static {
    PARSER.declareLong(SegmentsStats::setCount, COUNT);
    PARSER.declareLong(SegmentsStats::setDocValuesMemoryInBytes, DOC_VALUES_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setFixedBitSetMemoryInBytes, FIXED_BIT_SET_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setIndexWriterMaxMemoryInBytes, INDEX_WRITER_MAX_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setIndexWriterMemoryInBytes, INDEX_WRITER_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setMaxUnsafeAutoIdTimestamp, MAX_UNSAFE_AUTO_ID_TIMESTAMP);
    PARSER.declareLong(SegmentsStats::setMemoryInBytes, MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setNormsMemoryInBytes, NORMS_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setPointsMemoryInBytes, POINTS_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setStoredFieldsMemoryInBytes, STORED_FIELDS_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setTermsMemoryInBytes, TERMS_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setTermVectorsMemoryInBytes, TERM_VECTORS_MEMORY_IN_BYTES);
    PARSER.declareLong(SegmentsStats::setVersionMapMemoryInBytes, VERSION_MAP_MEMORY_IN_BYTES);
    PARSER.declareObject(SegmentsStats::setFileSizes, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> ShardFileSizeInfo.PARSER.apply(pp, null)), FILE_SIZES);
  }

}
