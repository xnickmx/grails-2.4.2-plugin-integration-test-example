package org.grails.testapp.service

import grails.transaction.Transactional
import org.grails.testapp.domain.Person

// @Transactional
class PersonService {

    static transactional = true

    Person createPerson(String name) {

        new Person(name: name).save()
    }
}
