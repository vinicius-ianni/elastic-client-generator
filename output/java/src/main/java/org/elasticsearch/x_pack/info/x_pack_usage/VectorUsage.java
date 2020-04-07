
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class VectorUsage  implements XContentable<VectorUsage> {
  
  static final ParseField DENSE_VECTOR_FIELDS_COUNT = new ParseField("dense_vector_fields_count");
  private Integer _denseVectorFieldsCount;
  public Integer getDenseVectorFieldsCount() { return this._denseVectorFieldsCount; }
  public VectorUsage setDenseVectorFieldsCount(Integer val) { this._denseVectorFieldsCount = val; return this; }


  static final ParseField SPARSE_VECTOR_FIELDS_COUNT = new ParseField("sparse_vector_fields_count");
  private Integer _sparseVectorFieldsCount;
  public Integer getSparseVectorFieldsCount() { return this._sparseVectorFieldsCount; }
  public VectorUsage setSparseVectorFieldsCount(Integer val) { this._sparseVectorFieldsCount = val; return this; }


  static final ParseField DENSE_VECTOR_DIMS_AVG_COUNT = new ParseField("dense_vector_dims_avg_count");
  private Integer _denseVectorDimsAvgCount;
  public Integer getDenseVectorDimsAvgCount() { return this._denseVectorDimsAvgCount; }
  public VectorUsage setDenseVectorDimsAvgCount(Integer val) { this._denseVectorDimsAvgCount = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public VectorUsage fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return VectorUsage.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<VectorUsage, Void> PARSER =
    new ConstructingObjectParser<>(VectorUsage.class.getName(), false, args -> new VectorUsage());

  static {
    PARSER.declareInteger(VectorUsage::setDenseVectorFieldsCount, DENSE_VECTOR_FIELDS_COUNT);
    PARSER.declareInteger(VectorUsage::setSparseVectorFieldsCount, SPARSE_VECTOR_FIELDS_COUNT);
    PARSER.declareInteger(VectorUsage::setDenseVectorDimsAvgCount, DENSE_VECTOR_DIMS_AVG_COUNT);
  }

}
