
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class VectorUsage  {
  
  private Integer _denseVectorFieldsCount;
  public Integer getDenseVectorFieldsCount() { return this._denseVectorFieldsCount; }
  public VectorUsage setDenseVectorFieldsCount(Integer val) { this._denseVectorFieldsCount = val; return this; }


  private Integer _sparseVectorFieldsCount;
  public Integer getSparseVectorFieldsCount() { return this._sparseVectorFieldsCount; }
  public VectorUsage setSparseVectorFieldsCount(Integer val) { this._sparseVectorFieldsCount = val; return this; }


  private Integer _denseVectorDimsAvgCount;
  public Integer getDenseVectorDimsAvgCount() { return this._denseVectorDimsAvgCount; }
  public VectorUsage setDenseVectorDimsAvgCount(Integer val) { this._denseVectorDimsAvgCount = val; return this; }

}
