BukkitInterface
---
An interface between different versions of Craftbukkit. The problem is that if you use ```Bukkit.getOnlinePlayers()```
then your plugin will only work with either ```Bukkit v1.7.9 & older```, **OR** ```Bukkit v1.7.10 & newer```... But not both.

The solution is to use ```BukkitInterface.getOnlinePlayers()``` in order to make your plugin compatible with any version 
of Craftbukkit that the server might be running.

```java
Collection<Player> players = BukkitInterface.getOnlinePlayers(); // always works !!!
```

Maven Repository:
---

[http://rainbowcraft.sytes.net/maven/repository/] (http://rainbowcraft.sytes.net/maven/repository/ "Maven Repository")

If you use maven, put these declarations in your pom.xml:

~~**repositories section:**~~

Check to make sure this repository is still active. If not, you will have to install the project to your local ```~/.m2/repository```

```xml
<repository>
    <id>rainbowcraft-repo</id>
    <url>http://rainbowcraft.sytes.net/maven/repository/</url>
</repository>
```

**Installation to your local ~/.m2/repository**

***git latest version:***

* ```git clone https://github.com/Europia79/BukkitInterface.git```
* ```mvn clean install```

***git previous versions:***
* ```git clone https://github.com/Europia79/BukkitInterface.git```
* ```git log --format=oneline```
* ```git checkout <hash>```
* ```mvn clean install```
* ```git checkout master```

***file download & mvn install:***

* Or, you can download a jar and run the ```mvn install:install-file``` command.
* This is also helpful to install any dependencies that maven can't automatically download.
  * Arguments: 
    * ```-Dfile=``` : The name & location of the jar
    * ```-DgroupId=``` : Mine is ```mc.euro```
    * ```-DartifactId=``` : If you decompile or unzip the jar, then you can find this & other information inside the folder ```META-INF/maven/{groupId}.{artifactId}/pom.properties``` & ```pom.xml```
    * ```-Dversion``` : Also found in ```pom.properties``` & ```pom.xml```
    * ```Dpackaging=jar```
    * ```DcreateChecksum=true```
  * Example: ```mvn install:install-file -Dfile="C:\Users\Nikolai\Documents\lib\BukkitInterface\2.0.1\BukkitInterface.jar" -DgroupId=mc.euro -DartifactId=BukkitInterface -Dversion=2.0.1 -Dpackaging=jar -DcreateChecksum=true```

**dependencies section:**

```xml
<dependency>
    <groupId>mc.euro</groupId>
    <artifactId>BukkitInterface</artifactId>
    <version>2.0.1</version>
    <scope>compile</scope>
</dependency>
```

**build-plugins section:**

```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-shade-plugin</artifactId>
                <version>2.4.2</version>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>shade</goal>
                        </goals>
                        <configuration>
                            <relocations>
                                <relocation>
                                    <pattern>mc.euro.bukkit</pattern>
                                    <shadedPattern>${project.groupId}.${project.artifactId}.bukkit</shadedPattern>
                                </relocation>
                            </relocations>
                            <artifactSet>
                                <includes>
                                    <include>mc.euro:BukkitInterface</include>
                                </includes>
                            </artifactSet>
                            <minimizeJar>true</minimizeJar>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```

Dependencies:
---

- **Bukkit API**
  * https://github.com/Bukkit/Bukkit
  * http://dl.bukkit.org/downloads/bukkit/
  * 1.7.9 & 1.7.10 are required for compilation


Contact:
---

Nick at Nikolai.Kalashnikov@hotmail.com

Nicodemis79 on Skype
