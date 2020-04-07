
package org.elasticsearch.x_pack.watcher.input;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class HttpInputRequest  implements XContentable<HttpInputRequest> {
  
  static final ParseField AUTH = new ParseField("auth");
  private HttpInputAuthentication _auth;
  public HttpInputAuthentication getAuth() { return this._auth; }
  public HttpInputRequest setAuth(HttpInputAuthentication val) { this._auth = val; return this; }


  static final ParseField BODY = new ParseField("body");
  private String _body;
  public String getBody() { return this._body; }
  public HttpInputRequest setBody(String val) { this._body = val; return this; }


  static final ParseField CONNECTION_TIMEOUT = new ParseField("connection_timeout");
  private Time _connectionTimeout;
  public Time getConnectionTimeout() { return this._connectionTimeout; }
  public HttpInputRequest setConnectionTimeout(Time val) { this._connectionTimeout = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private NamedContainer<String, String> _headers;
  public NamedContainer<String, String> getHeaders() { return this._headers; }
  public HttpInputRequest setHeaders(NamedContainer<String, String> val) { this._headers = val; return this; }


  static final ParseField HOST = new ParseField("host");
  private String _host;
  public String getHost() { return this._host; }
  public HttpInputRequest setHost(String val) { this._host = val; return this; }


  static final ParseField METHOD = new ParseField("method");
  private HttpInputMethod _method;
  public HttpInputMethod getMethod() { return this._method; }
  public HttpInputRequest setMethod(HttpInputMethod val) { this._method = val; return this; }


  static final ParseField PARAMS = new ParseField("params");
  private NamedContainer<String, String> _params;
  public NamedContainer<String, String> getParams() { return this._params; }
  public HttpInputRequest setParams(NamedContainer<String, String> val) { this._params = val; return this; }


  static final ParseField PATH = new ParseField("path");
  private String _path;
  public String getPath() { return this._path; }
  public HttpInputRequest setPath(String val) { this._path = val; return this; }


  static final ParseField PORT = new ParseField("port");
  private Integer _port;
  public Integer getPort() { return this._port; }
  public HttpInputRequest setPort(Integer val) { this._port = val; return this; }


  static final ParseField PROXY = new ParseField("proxy");
  private HttpInputProxy _proxy;
  public HttpInputProxy getProxy() { return this._proxy; }
  public HttpInputRequest setProxy(HttpInputProxy val) { this._proxy = val; return this; }


  static final ParseField READ_TIMEOUT = new ParseField("read_timeout");
  private Time _readTimeout;
  public Time getReadTimeout() { return this._readTimeout; }
  public HttpInputRequest setReadTimeout(Time val) { this._readTimeout = val; return this; }


  static final ParseField SCHEME = new ParseField("scheme");
  private ConnectionScheme _scheme;
  public ConnectionScheme getScheme() { return this._scheme; }
  public HttpInputRequest setScheme(ConnectionScheme val) { this._scheme = val; return this; }


  static final ParseField URL = new ParseField("url");
  private String _url;
  public String getUrl() { return this._url; }
  public HttpInputRequest setUrl(String val) { this._url = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HttpInputRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HttpInputRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HttpInputRequest, Void> PARSER =
    new ConstructingObjectParser<>(HttpInputRequest.class.getName(), false, args -> new HttpInputRequest());

  static {
    PARSER.declareObject(HttpInputRequest::setAuth, (p, t) -> HttpInputAuthentication.PARSER.apply(p, null), AUTH);
    PARSER.declareString(HttpInputRequest::setBody, BODY);
    PARSER.declareObject(HttpInputRequest::setConnectionTimeout, (p, t) -> Time.PARSER.apply(p, null), CONNECTION_TIMEOUT);
    PARSER.declareObject(HttpInputRequest::setHeaders, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> String.PARSER.apply(pp, null)), HEADERS);;
    PARSER.declareString(HttpInputRequest::setHost, HOST);
    PARSER.declareObject(HttpInputRequest::setMethod, (p, t) -> HttpInputMethod.PARSER.apply(p, null), METHOD);
    PARSER.declareObject(HttpInputRequest::setParams, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> String.PARSER.apply(pp, null)), PARAMS);;
    PARSER.declareString(HttpInputRequest::setPath, PATH);
    PARSER.declareInteger(HttpInputRequest::setPort, PORT);
    PARSER.declareObject(HttpInputRequest::setProxy, (p, t) -> HttpInputProxy.PARSER.apply(p, null), PROXY);
    PARSER.declareObject(HttpInputRequest::setReadTimeout, (p, t) -> Time.PARSER.apply(p, null), READ_TIMEOUT);
    PARSER.declareObject(HttpInputRequest::setScheme, (p, t) -> ConnectionScheme.PARSER.apply(p, null), SCHEME);
    PARSER.declareString(HttpInputRequest::setUrl, URL);
  }

}
