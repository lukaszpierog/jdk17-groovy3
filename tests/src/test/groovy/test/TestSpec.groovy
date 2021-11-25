package test

import spock.lang.Specification

class TestSpec extends Specification {

    def 'test'() {
        given:
        def predicate = {true} as java.util.function.Predicate
        when:
        predicate.negate()
        then:
        noExceptionThrown()
    }
}
