
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TransportStats  {
  
  private Long _rxCount;
  public Long getRxCount() { return this._rxCount; }
  public TransportStats setRxCount(Long val) { this._rxCount = val; return this; }


  private String _rxSize;
  public String getRxSize() { return this._rxSize; }
  public TransportStats setRxSize(String val) { this._rxSize = val; return this; }


  private Long _rxSizeInBytes;
  public Long getRxSizeInBytes() { return this._rxSizeInBytes; }
  public TransportStats setRxSizeInBytes(Long val) { this._rxSizeInBytes = val; return this; }


  private Integer _serverOpen;
  public Integer getServerOpen() { return this._serverOpen; }
  public TransportStats setServerOpen(Integer val) { this._serverOpen = val; return this; }


  private Long _txCount;
  public Long getTxCount() { return this._txCount; }
  public TransportStats setTxCount(Long val) { this._txCount = val; return this; }


  private String _txSize;
  public String getTxSize() { return this._txSize; }
  public TransportStats setTxSize(String val) { this._txSize = val; return this; }


  private Long _txSizeInBytes;
  public Long getTxSizeInBytes() { return this._txSizeInBytes; }
  public TransportStats setTxSizeInBytes(Long val) { this._txSizeInBytes = val; return this; }

}
