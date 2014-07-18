grails-2.4.2-plugin-integration-test-example
============================================

Example Grails 2.4.2 Plugin project that has a service integration test

There are two projects:
1. GrailsPluginTest
2. GrailsTestApp

Both have identical code:
Person domain class
PersonService service class
PersonServiceITSpec class

The PersonServiceITSpec succeeds when run in the app and fails when run in the plugin.
The remedy is to update the plugin to depend on the Hibernate plugin. 
