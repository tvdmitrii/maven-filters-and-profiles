# Maven Filters and Profiles for Managing Build Environments
How to use Maven filters and profiles to simplify managing development and productions builds. Set it up once and forget about ever needing to manually replace database connection strings, REST API URLs, and credentials.

## Topics Covered
- Handling resources (e.g., hibernate.cfg.xml, log4j2.properties)
- Handling source code (spoiler -> make a configuration file)
- Creating configurations

## Key Ideas
- **Filtering**. Place variables into the configuration files and specify their values at build time.
- **Profiles**. Assign values to groups of variables and associate them with an easy to remember name.
- **IntelliJ Idea.** Select profiles manually or specify them in build configuration.

## Resources:
- [A Maven2 multi-environment filter setup](https://sujitpal.blogspot.com/2006/10/maven2-multi-environment-filter-setup.html)
- [Documentation on filters](https://maven.apache.org/plugins/maven-resources-plugin/examples/filter.html)
- [Documentation on profiles](https://maven.apache.org/guides/introduction/introduction-to-profiles.html)
- [Filtering properties files with non-ascii characters](https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html)