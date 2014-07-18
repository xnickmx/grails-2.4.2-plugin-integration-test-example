package org.grails.testplugin.service

import grails.transaction.Transactional
import org.grails.testplugin.domain.Person

// @Transactional
class PersonService {

    static transactional = true

    Person createPerson(String name) {

        new Person(name: name).save()
    }
}
