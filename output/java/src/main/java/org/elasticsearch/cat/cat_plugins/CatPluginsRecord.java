
package org.elasticsearch.cat.cat_plugins;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatPluginsRecord  {
  
  private String _component;
  public String getComponent() { return this._component; }
  public CatPluginsRecord setComponent(String val) { this._component = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public CatPluginsRecord setDescription(String val) { this._description = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public CatPluginsRecord setId(String val) { this._id = val; return this; }


  private String _isolation;
  public String getIsolation() { return this._isolation; }
  public CatPluginsRecord setIsolation(String val) { this._isolation = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CatPluginsRecord setName(String val) { this._name = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public CatPluginsRecord setType(String val) { this._type = val; return this; }


  private String _url;
  public String getUrl() { return this._url; }
  public CatPluginsRecord setUrl(String val) { this._url = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public CatPluginsRecord setVersion(String val) { this._version = val; return this; }

}
