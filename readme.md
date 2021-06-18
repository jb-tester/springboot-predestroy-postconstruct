## Spring: test destroy and init methods

###problems with the standard annotations:
- @PostConstruct and @PreDestroy-annotated methods are shown as unused after undbundling EJB plugin
https://youtrack.jetbrains.com/issue/IDEA-270639

- init and destroy methods with default names (not specified explicitely) are not recognized
https://youtrack.jetbrains.com/issue/IDEA-270643

###problems with init/destroy methods defined in @Bean meta-annotations:
- https://youtrack.jetbrains.com/issue/IDEA-174569
- https://youtrack.jetbrains.com/issue/IDEA-174570


###problems with xml configurations:
-https://youtrack.jetbrains.com/issue/IDEA-174563