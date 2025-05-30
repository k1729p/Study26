@echo off
set JAVA_HOME=C:\PROGRA~1\JAVA\JDK-24
set M2_HOME=c:\\tools\\apache-maven-3.9.9
pushd %cd%
cd ..
call %M2_HOME%\bin\mvn versions:display-plugin-updates
call %M2_HOME%\bin\mvn versions:display-dependency-updates

call %M2_HOME%\bin\mvn dependency:tree
call %M2_HOME%\bin\mvn dependency:resolve -Dclassifier=javadoc
call %M2_HOME%\bin\mvn dependency:resolve -Dclassifier=sources

:: Ignore these javadoc warnings: use of default constructor, which does not provide a comment
call %M2_HOME%\bin\mvn javadoc:javadoc
pause
popd