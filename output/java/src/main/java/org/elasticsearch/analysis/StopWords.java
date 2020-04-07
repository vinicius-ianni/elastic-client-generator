package org.elasticsearch.analysis;

import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.common_abstractions.union.*;

public class StopWords extends Either<String, List<String>> implements XContentable<StopWords> { }
