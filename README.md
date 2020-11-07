# conflicting-cross-version-suffixes

```
bash-3.2$ sbt compile
[info] welcome to sbt 1.4.2 (GraalVM Community Java 11.0.8)
[info] loading settings for project global-plugins from build.sbt,plugins.sbt ...
[info] loading global plugins from /Users/sho/.sbt/1.0/plugins
[info] loading settings for project conflicting-cross-version-suffixes-build from plugins.sbt ...
[info] loading project definition from /Users/sho/src/github.com/shokohara/conflicting-cross-version-suffixes/project
[info] loading settings for project conflicting-cross-version-suffixes from build.sbt ...
[info] set current project to conflicting-cross-version-suffixes (in build file:/Users/sho/src/github.com/shokohara/conflicting-cross-version-suffixes/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 1 Scala source to /Users/sho/src/github.com/shokohara/conflicting-cross-version-suffixes/core/target/jvm-2.13/classes ...
[info] compiling 1 Scala source to /Users/sho/src/github.com/shokohara/conflicting-cross-version-suffixes/core/target/jvm-0.27/classes ...
[error] Modules were resolved with conflicting cross-version suffixes in ProjectRef(uri("file:/Users/sho/src/github.com/shokohara/conflicting-cross-version-suffixes/"), "app"):
[error]    org.typelevel:cats-kernel _0.27, _2.13
[error] java.lang.RuntimeException: Conflicting cross-version suffixes in: org.typelevel:cats-kernel
[error] 	at scala.sys.package$.error(package.scala:30)
[error] 	at sbt.librarymanagement.ConflictWarning$.processCrossVersioned(ConflictWarning.scala:39)
[error] 	at sbt.librarymanagement.ConflictWarning$.apply(ConflictWarning.scala:19)
[error] 	at sbt.Classpaths$.$anonfun$ivyBaseSettings$70(Defaults.scala:3002)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error] 	at sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error] 	at sbt.Execute.work(Execute.scala:291)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] 	at java.base/java.lang.Thread.run(Thread.java:834)
[error] (app / update) Conflicting cross-version suffixes in: org.typelevel:cats-kernel
[error] Total time: 4 s, completed Nov 7, 2020, 9:52:01 PM
bash-3.2$
```
