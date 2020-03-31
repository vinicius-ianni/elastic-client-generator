
package org.elasticsearch.ingest.simulate_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.simulate_pipeline.*;
import org.elasticsearch.common_abstractions.lazy_document.*;

public class DocumentSimulation  {
  
  private String _id;
  public String getId() { return this._id; }
  public DocumentSimulation setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public DocumentSimulation setIndex(String val) { this._index = val; return this; }


  private Ingest _ingest;
  public Ingest getIngest() { return this._ingest; }
  public DocumentSimulation setIngest(Ingest val) { this._ingest = val; return this; }


  private String _parent;
  public String getParent() { return this._parent; }
  public DocumentSimulation setParent(String val) { this._parent = val; return this; }


  private String _routing;
  public String getRouting() { return this._routing; }
  public DocumentSimulation setRouting(String val) { this._routing = val; return this; }


  private LazyDocument _source;
  public LazyDocument getSource() { return this._source; }
  public DocumentSimulation setSource(LazyDocument val) { this._source = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public DocumentSimulation setType(String val) { this._type = val; return this; }

}
