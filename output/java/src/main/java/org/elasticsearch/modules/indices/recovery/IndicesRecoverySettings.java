
package org.elasticsearch.modules.indices.recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class IndicesRecoverySettings  {
  
  private Boolean _compress;
  public Boolean getCompress() { return this._compress; }
  public IndicesRecoverySettings setCompress(Boolean val) { this._compress = val; return this; }


  private Integer _concurrentSmallFileStreams;
  public Integer getConcurrentSmallFileStreams() { return this._concurrentSmallFileStreams; }
  public IndicesRecoverySettings setConcurrentSmallFileStreams(Integer val) { this._concurrentSmallFileStreams = val; return this; }


  private Integer _concurrentStreams;
  public Integer getConcurrentStreams() { return this._concurrentStreams; }
  public IndicesRecoverySettings setConcurrentStreams(Integer val) { this._concurrentStreams = val; return this; }


  private String _fileChunkSize;
  public String getFileChunkSize() { return this._fileChunkSize; }
  public IndicesRecoverySettings setFileChunkSize(String val) { this._fileChunkSize = val; return this; }


  private String _maxBytesPerSecond;
  public String getMaxBytesPerSecond() { return this._maxBytesPerSecond; }
  public IndicesRecoverySettings setMaxBytesPerSecond(String val) { this._maxBytesPerSecond = val; return this; }


  private Integer _translogOperations;
  public Integer getTranslogOperations() { return this._translogOperations; }
  public IndicesRecoverySettings setTranslogOperations(Integer val) { this._translogOperations = val; return this; }


  private String _translogSize;
  public String getTranslogSize() { return this._translogSize; }
  public IndicesRecoverySettings setTranslogSize(String val) { this._translogSize = val; return this; }

}
