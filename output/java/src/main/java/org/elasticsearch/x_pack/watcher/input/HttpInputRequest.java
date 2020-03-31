
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class HttpInputRequest  {
  
  private HttpInputAuthentication _auth;
  public HttpInputAuthentication getAuth() { return this._auth; }
  public HttpInputRequest setAuth(HttpInputAuthentication val) { this._auth = val; return this; }


  private String _body;
  public String getBody() { return this._body; }
  public HttpInputRequest setBody(String val) { this._body = val; return this; }


  private Time _connectionTimeout;
  public Time getConnectionTimeout() { return this._connectionTimeout; }
  public HttpInputRequest setConnectionTimeout(Time val) { this._connectionTimeout = val; return this; }


  private Map<String, String> _headers;
  public Map<String, String> getHeaders() { return this._headers; }
  public HttpInputRequest setHeaders(Map<String, String> val) { this._headers = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public HttpInputRequest setHost(String val) { this._host = val; return this; }


  private HttpInputMethod _method;
  public HttpInputMethod getMethod() { return this._method; }
  public HttpInputRequest setMethod(HttpInputMethod val) { this._method = val; return this; }


  private Map<String, String> _params;
  public Map<String, String> getParams() { return this._params; }
  public HttpInputRequest setParams(Map<String, String> val) { this._params = val; return this; }


  private String _path;
  public String getPath() { return this._path; }
  public HttpInputRequest setPath(String val) { this._path = val; return this; }


  private Integer _port;
  public Integer getPort() { return this._port; }
  public HttpInputRequest setPort(Integer val) { this._port = val; return this; }


  private HttpInputProxy _proxy;
  public HttpInputProxy getProxy() { return this._proxy; }
  public HttpInputRequest setProxy(HttpInputProxy val) { this._proxy = val; return this; }


  private Time _readTimeout;
  public Time getReadTimeout() { return this._readTimeout; }
  public HttpInputRequest setReadTimeout(Time val) { this._readTimeout = val; return this; }


  private ConnectionScheme _scheme;
  public ConnectionScheme getScheme() { return this._scheme; }
  public HttpInputRequest setScheme(ConnectionScheme val) { this._scheme = val; return this; }


  private String _url;
  public String getUrl() { return this._url; }
  public HttpInputRequest setUrl(String val) { this._url = val; return this; }

}
