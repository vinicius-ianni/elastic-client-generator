
package org.elasticsearch.common_abstractions.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ElasticsearchVersionInfo  {
  
  private String _luceneVersion;
  public String getLuceneVersion() { return this._luceneVersion; }
  public ElasticsearchVersionInfo setLuceneVersion(String val) { this._luceneVersion = val; return this; }


  private String _number;
  public String getNumber() { return this._number; }
  public ElasticsearchVersionInfo setNumber(String val) { this._number = val; return this; }


  private String _buildFlavor;
  public String getBuildFlavor() { return this._buildFlavor; }
  public ElasticsearchVersionInfo setBuildFlavor(String val) { this._buildFlavor = val; return this; }


  private String _buildType;
  public String getBuildType() { return this._buildType; }
  public ElasticsearchVersionInfo setBuildType(String val) { this._buildType = val; return this; }


  private String _buildHash;
  public String getBuildHash() { return this._buildHash; }
  public ElasticsearchVersionInfo setBuildHash(String val) { this._buildHash = val; return this; }


  private Date _buildDate;
  public Date getBuildDate() { return this._buildDate; }
  public ElasticsearchVersionInfo setBuildDate(Date val) { this._buildDate = val; return this; }


  private Boolean _buildSnapshot;
  public Boolean getBuildSnapshot() { return this._buildSnapshot; }
  public ElasticsearchVersionInfo setBuildSnapshot(Boolean val) { this._buildSnapshot = val; return this; }


  private String _minimumWireCompatibilityVersion;
  public String getMinimumWireCompatibilityVersion() { return this._minimumWireCompatibilityVersion; }
  public ElasticsearchVersionInfo setMinimumWireCompatibilityVersion(String val) { this._minimumWireCompatibilityVersion = val; return this; }


  private String _minimumIndexCompatibilityVersion;
  public String getMinimumIndexCompatibilityVersion() { return this._minimumIndexCompatibilityVersion; }
  public ElasticsearchVersionInfo setMinimumIndexCompatibilityVersion(String val) { this._minimumIndexCompatibilityVersion = val; return this; }

}
