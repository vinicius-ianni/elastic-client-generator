package org.elasticsearch;

import org.elasticsearch.common.xcontent.ConstructingObjectParser;
import org.elasticsearch.mapping.meta_fields.source.SourceField;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Optional;
import java.util.function.Function;

public abstract class Either<A, B> {
  protected Either() {}

  public <C> C map(Function<? super A, ? extends C> left,
                      Function<? super B, ? extends C> right) {
    throw new NotImplementedException();
  }

  public static <A, B> Either<A,B> left(A value) {
    return new Either<A,B>() {
      @Override
      public <C> C map(
        Function<? super A, ? extends C> left,
        Function<? super B, ? extends C> right) {
        return left.apply(value);
      }
    };
  }

  public static <A, B> Either<A,B> right(B value) {
    return new Either<A,B>() {
      @Override
      public <C> C map(
        Function<? super A, ? extends C> left,
        Function<? super B, ? extends C> right) {
        return right.apply(value);
      }
    };
  }

  public static final <A, B> ConstructingObjectParser<SourceField, Void> PARSER() {
    return new ConstructingObjectParser<Either<A, B>>(Either.class.getName(), false, args -> new Either<A,B>());
  }

  static {
    PARSER.declareBoolean(SourceField::setCompress, COMPRESS);
    PARSER.declareString(SourceField::setCompressThreshold, COMPRESS_THRESHOLD);
    PARSER.declareBoolean(SourceField::setEnabled, ENABLED);
    PARSER.declareObject(SourceField::setExcludes, (p, t) -> String[].PARSER.apply(p, null), EXCLUDES);
    PARSER.declareObject(SourceField::setIncludes, (p, t) -> String[].PARSER.apply(p, null), INCLUDES);
  }
}
