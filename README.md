## README

Tutorial:

https://spring.io/guides/tutorials/spring-boot-kotlin/

### Notes

* While Spring Data JPA makes it possible to use natural IDs (it could have been the login property in User class) via [Persistable](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.entity-persistence.saving-entites), it is not a good fit with Kotlin due to [KT-6653](https://youtrack.jetbrains.com/issue/KT-6653), that’s why it is recommended to always use entities with generated IDs in Kotlin. 


