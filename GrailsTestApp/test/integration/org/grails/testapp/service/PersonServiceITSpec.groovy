package org.grails.testapp.service

import spock.lang.Specification
import static org.junit.Assert.*

/**
 * Tests PersonService
 */
class PersonServiceITSpec extends Specification {

    PersonService personService

    def setup() {
    }

    def cleanup() {
    }

    void "test createPerson happy path"() {
        given:
        final name = "name"

        when:
        final result = personService.createPerson(name)

        then:
        assertNotNull(result)
        assertEquals(name, result.name)
        assertNotNull(result.getId())
    }
}