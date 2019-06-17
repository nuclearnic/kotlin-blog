## README

The 'ol classic article/author REST exercise.

### Tools and Libs

* Switched from JUnit 4 to JUnit 5
* Set `junit.jupiter.testinstance.lifecycle.default = per_class` in `src/test/resources/junit-platform.properties` to allow lifecycle hooks per test class.
* Persistence with JPA: Using `allopen` for persistence with JPA to make lazy fetching work as expected.

### Notes

---

#### Entities should have generated IDs 

While Spring Data JPA makes it possible to use natural IDs (it could have been the login property in User class) via [Persistable](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.entity-persistence.saving-entites), it is not a good fit with Kotlin due to [KT-6653](https://youtrack.jetbrains.com/issue/KT-6653), that’s why it is recommended to always use entities with generated IDs in Kotlin. 

#### Extensions vs Util Classes

Instead of using util classes with abstract methods like in Java, it is usual in Kotlin to provide such functionalities via Kotlin extensions. Here a format() function is added to the existing LocalDateTime type in order to generate text with the english date format.
