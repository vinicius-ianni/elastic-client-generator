
package org.elasticsearch.search.search.highlighting;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class HighlightField  {
  
  private String _boundaryChars;
  public String getBoundaryChars() { return this._boundaryChars; }
  public HighlightField setBoundaryChars(String val) { this._boundaryChars = val; return this; }


  private Integer _boundaryMaxScan;
  public Integer getBoundaryMaxScan() { return this._boundaryMaxScan; }
  public HighlightField setBoundaryMaxScan(Integer val) { this._boundaryMaxScan = val; return this; }


  private BoundaryScanner _boundaryScanner;
  public BoundaryScanner getBoundaryScanner() { return this._boundaryScanner; }
  public HighlightField setBoundaryScanner(BoundaryScanner val) { this._boundaryScanner = val; return this; }


  private String _boundaryScannerLocale;
  public String getBoundaryScannerLocale() { return this._boundaryScannerLocale; }
  public HighlightField setBoundaryScannerLocale(String val) { this._boundaryScannerLocale = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public HighlightField setField(Field val) { this._field = val; return this; }


  private Boolean _forceSource;
  public Boolean getForceSource() { return this._forceSource; }
  public HighlightField setForceSource(Boolean val) { this._forceSource = val; return this; }


  private HighlighterFragmenter _fragmenter;
  public HighlighterFragmenter getFragmenter() { return this._fragmenter; }
  public HighlightField setFragmenter(HighlighterFragmenter val) { this._fragmenter = val; return this; }


  private Integer _fragmentOffset;
  public Integer getFragmentOffset() { return this._fragmentOffset; }
  public HighlightField setFragmentOffset(Integer val) { this._fragmentOffset = val; return this; }


  private Integer _fragmentSize;
  public Integer getFragmentSize() { return this._fragmentSize; }
  public HighlightField setFragmentSize(Integer val) { this._fragmentSize = val; return this; }


  private QueryContainer _highlightQuery;
  public QueryContainer getHighlightQuery() { return this._highlightQuery; }
  public HighlightField setHighlightQuery(QueryContainer val) { this._highlightQuery = val; return this; }


  private Field[] _matchedFields;
  public Field[] getMatchedFields() { return this._matchedFields; }
  public HighlightField setMatchedFields(Field[] val) { this._matchedFields = val; return this; }


  private Integer _maxFragmentLength;
  public Integer getMaxFragmentLength() { return this._maxFragmentLength; }
  public HighlightField setMaxFragmentLength(Integer val) { this._maxFragmentLength = val; return this; }


  private Integer _noMatchSize;
  public Integer getNoMatchSize() { return this._noMatchSize; }
  public HighlightField setNoMatchSize(Integer val) { this._noMatchSize = val; return this; }


  private Integer _numberOfFragments;
  public Integer getNumberOfFragments() { return this._numberOfFragments; }
  public HighlightField setNumberOfFragments(Integer val) { this._numberOfFragments = val; return this; }


  private HighlighterOrder _order;
  public HighlighterOrder getOrder() { return this._order; }
  public HighlightField setOrder(HighlighterOrder val) { this._order = val; return this; }


  private Integer _phraseLimit;
  public Integer getPhraseLimit() { return this._phraseLimit; }
  public HighlightField setPhraseLimit(Integer val) { this._phraseLimit = val; return this; }


  private String[] _postTags;
  public String[] getPostTags() { return this._postTags; }
  public HighlightField setPostTags(String[] val) { this._postTags = val; return this; }


  private String[] _preTags;
  public String[] getPreTags() { return this._preTags; }
  public HighlightField setPreTags(String[] val) { this._preTags = val; return this; }


  private Boolean _requireFieldMatch;
  public Boolean getRequireFieldMatch() { return this._requireFieldMatch; }
  public HighlightField setRequireFieldMatch(Boolean val) { this._requireFieldMatch = val; return this; }


  private HighlighterTagsSchema _tagsSchema;
  public HighlighterTagsSchema getTagsSchema() { return this._tagsSchema; }
  public HighlightField setTagsSchema(HighlighterTagsSchema val) { this._tagsSchema = val; return this; }


  private Either<HighlighterType, String> _type;
  public Either<HighlighterType, String> getType() { return this._type; }
  public HighlightField setType(Either<HighlighterType, String> val) { this._type = val; return this; }

}
