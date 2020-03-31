
package org.elasticsearch.x_pack.watcher.transform;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.transform.*;

public class ChainTransform  {
  
  private TransformContainer[] _transforms;
  public TransformContainer[] getTransforms() { return this._transforms; }
  public ChainTransform setTransforms(TransformContainer[] val) { this._transforms = val; return this; }

}
