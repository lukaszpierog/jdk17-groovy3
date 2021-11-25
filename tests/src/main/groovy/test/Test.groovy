package test

class Test {
    static void main(String[] args) {
        def predicate = {true} as java.util.function.Predicate
        predicate.negate()
        println "i don't work!! :("
    }
}
