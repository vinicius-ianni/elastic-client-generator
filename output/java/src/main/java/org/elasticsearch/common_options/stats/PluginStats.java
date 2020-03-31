
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PluginStats  {
  
  private String _classname;
  public String getClassname() { return this._classname; }
  public PluginStats setClassname(String val) { this._classname = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public PluginStats setDescription(String val) { this._description = val; return this; }


  private String _elasticsearchVersion;
  public String getElasticsearchVersion() { return this._elasticsearchVersion; }
  public PluginStats setElasticsearchVersion(String val) { this._elasticsearchVersion = val; return this; }


  private String[] _extendedPlugins;
  public String[] getExtendedPlugins() { return this._extendedPlugins; }
  public PluginStats setExtendedPlugins(String[] val) { this._extendedPlugins = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public PluginStats setName(String val) { this._name = val; return this; }


  private Boolean _hasNativeController;
  public Boolean getHasNativeController() { return this._hasNativeController; }
  public PluginStats setHasNativeController(Boolean val) { this._hasNativeController = val; return this; }


  private String _javaVersion;
  public String getJavaVersion() { return this._javaVersion; }
  public PluginStats setJavaVersion(String val) { this._javaVersion = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public PluginStats setVersion(String val) { this._version = val; return this; }

}
