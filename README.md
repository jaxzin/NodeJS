NodeJS
======
This is some sample code to demonstrate how to use gradle to bootstrap and wrap Node.js packaging.

* Step one - run "./gradlew -b install.gradle uploadArchives" to stage a local Maven repo with Node packaged as a jar.
* Step two - run "./gradlew uploadArchives" to resolve node packages, prepare a zipa and upload it to a the local maven repo.