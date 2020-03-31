
package org.elasticsearch.mapping.meta_fields.source;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SourceField  {
  
  private Boolean _compress;
  public Boolean getCompress() { return this._compress; }
  public SourceField setCompress(Boolean val) { this._compress = val; return this; }


  private String _compressThreshold;
  public String getCompressThreshold() { return this._compressThreshold; }
  public SourceField setCompressThreshold(String val) { this._compressThreshold = val; return this; }


  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public SourceField setEnabled(Boolean val) { this._enabled = val; return this; }


  private String[] _excludes;
  public String[] getExcludes() { return this._excludes; }
  public SourceField setExcludes(String[] val) { this._excludes = val; return this; }


  private String[] _includes;
  public String[] getIncludes() { return this._includes; }
  public SourceField setIncludes(String[] val) { this._includes = val; return this; }

}
