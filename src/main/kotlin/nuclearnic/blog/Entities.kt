package nuclearnic.blog

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Article(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne var author: User,
    var slug: String = title.toSlug(),
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue var id: Long? = null) : WordCount {

    override var wordCount: Int = content.length
}

@Entity
class Book (
        var title: String,
        var introduction: String,
        var content: String,
        var releaseDate: Date,
        var edition: Int,
        @ManyToOne var author: User,
        @Id @GeneratedValue var id: Long? = null) : WordCount {

        override val wordCount: Int = content.length
}

@Entity
class Post(
        var content: String,
//        var inReplyTo: Post?,
        @ManyToOne var thread: Thread,
        @ManyToOne var author: User,
        @Id @GeneratedValue var id: Long? =null) : WordCount {

        override val wordCount: Int = content.length
}

@Entity
class Thread(
        var title: String,
        var openingPost: String,
        @ManyToOne var creator: User,
        @Id @GeneratedValue var id: Long? = null) : WordCount {

        override val wordCount: Int = 5
}

@Entity
class User(
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null)
