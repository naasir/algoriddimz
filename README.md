```
         __                 _     __    ___
  ____ _/ /___ _____  _____(_)___/ /___/ (_)___ ___  ____
 / __ `/ / __ `/ __ \/ ___/ / __  / __  / / __ `__ \/_  /
/ /_/ / / /_/ / /_/ / /  / / /_/ / /_/ / / / / / / / / /_
\__,_/_/\__, /\____/_/  /_/\__,_/\__,_/_/_/ /_/ /_/ /___/
       /____/
```
_"In effect, we conjure the spirits of the computer with our spells."_ - SICP

---
## Summary

This repo simply contains various algorithms (implemented in Scala) either as practice or homework for the [Coursera x Stanford - Algorithms: Design & Analysis](https://www.coursera.org/course/algo) course.

## Quickstart

### Requirements

The following software components are required to be pre-installed in order to run the samples and tests. Here is one method of installing all the necessary dependencies on a Mac via [Homebrew](http://brew.sh/):

| Dependency                                   | Version   | Install                                   |
|----------------------------------------------|-----------|-------------------------------------------|
|[java](http://www.java.com/en/)               |`v1.7+`    |`brew cask install caskroom/versions/java7`|
|[scala](http://www.scala-lang.org/)           |`v2.11.7+` |`brew install scala`                       |
|[sbt](http://www.scala-sbt.org/)              |`v0.13.8+` |`brew install sbt`                         |

### Running the samples

Issue the following commands from a shell to run the samples:

    $ cd /path/to/algoriddimz
    $ sbt run

### Running the tests

Issue the following commands from a shell to run the test suite:

    $ cd /path/to/algoriddimz
    $ sbt test

## Technology Stack

* [Scala](http://www.scala-lang.org/): The primary development language of this project.
* [SBT](http://www.scala-sbt.org/): Build tool for Scala and Java projects similar to Maven and Ant.
* [ScalaTest](http://www.scalatest.org/): Unit-testing library for Scala.
