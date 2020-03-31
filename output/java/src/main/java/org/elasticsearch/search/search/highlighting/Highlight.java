
package org.elasticsearch.search.search.highlighting;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class Highlight  {
  
  private String _boundaryChars;
  public String getBoundaryChars() { return this._boundaryChars; }
  public Highlight setBoundaryChars(String val) { this._boundaryChars = val; return this; }


  private Integer _boundaryMaxScan;
  public Integer getBoundaryMaxScan() { return this._boundaryMaxScan; }
  public Highlight setBoundaryMaxScan(Integer val) { this._boundaryMaxScan = val; return this; }


  private BoundaryScanner _boundaryScanner;
  public BoundaryScanner getBoundaryScanner() { return this._boundaryScanner; }
  public Highlight setBoundaryScanner(BoundaryScanner val) { this._boundaryScanner = val; return this; }


  private String _boundaryScannerLocale;
  public String getBoundaryScannerLocale() { return this._boundaryScannerLocale; }
  public Highlight setBoundaryScannerLocale(String val) { this._boundaryScannerLocale = val; return this; }


  private HighlighterEncoder _encoder;
  public HighlighterEncoder getEncoder() { return this._encoder; }
  public Highlight setEncoder(HighlighterEncoder val) { this._encoder = val; return this; }


  private Map<Field, HighlightField> _fields;
  public Map<Field, HighlightField> getFields() { return this._fields; }
  public Highlight setFields(Map<Field, HighlightField> val) { this._fields = val; return this; }


  private HighlighterFragmenter _fragmenter;
  public HighlighterFragmenter getFragmenter() { return this._fragmenter; }
  public Highlight setFragmenter(HighlighterFragmenter val) { this._fragmenter = val; return this; }


  private Integer _fragmentOffset;
  public Integer getFragmentOffset() { return this._fragmentOffset; }
  public Highlight setFragmentOffset(Integer val) { this._fragmentOffset = val; return this; }


  private Integer _fragmentSize;
  public Integer getFragmentSize() { return this._fragmentSize; }
  public Highlight setFragmentSize(Integer val) { this._fragmentSize = val; return this; }


  private Integer _maxFragmentLength;
  public Integer getMaxFragmentLength() { return this._maxFragmentLength; }
  public Highlight setMaxFragmentLength(Integer val) { this._maxFragmentLength = val; return this; }


  private Integer _noMatchSize;
  public Integer getNoMatchSize() { return this._noMatchSize; }
  public Highlight setNoMatchSize(Integer val) { this._noMatchSize = val; return this; }


  private Integer _numberOfFragments;
  public Integer getNumberOfFragments() { return this._numberOfFragments; }
  public Highlight setNumberOfFragments(Integer val) { this._numberOfFragments = val; return this; }


  private HighlighterOrder _order;
  public HighlighterOrder getOrder() { return this._order; }
  public Highlight setOrder(HighlighterOrder val) { this._order = val; return this; }


  private String[] _postTags;
  public String[] getPostTags() { return this._postTags; }
  public Highlight setPostTags(String[] val) { this._postTags = val; return this; }


  private String[] _preTags;
  public String[] getPreTags() { return this._preTags; }
  public Highlight setPreTags(String[] val) { this._preTags = val; return this; }


  private Boolean _requireFieldMatch;
  public Boolean getRequireFieldMatch() { return this._requireFieldMatch; }
  public Highlight setRequireFieldMatch(Boolean val) { this._requireFieldMatch = val; return this; }


  private HighlighterTagsSchema _tagsSchema;
  public HighlighterTagsSchema getTagsSchema() { return this._tagsSchema; }
  public Highlight setTagsSchema(HighlighterTagsSchema val) { this._tagsSchema = val; return this; }

}
