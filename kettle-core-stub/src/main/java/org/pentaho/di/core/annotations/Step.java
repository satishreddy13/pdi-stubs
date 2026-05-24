package org.pentaho.di.core.annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Step {
    String id() default "";
    String name() default "";
    String description() default "";
    String categoryDescription() default "";
    String image() default "";
    String i18nPackageName() default "";
    String documentationUrl() default "";
    String casesUrl() default "";
    String forumUrl() default "";
    String suggestion() default "";
    boolean isSeparateClassLoaderNeeded() default false;
    String classLoaderGroup() default "";
}
