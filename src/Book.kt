fun main(args: Array<String>) {
    val foundation = Book("Foundation", "Isaac Asimov", "1951")
    val (title, author, year) = foundation.getTitleAuthorYear()
    
    println("$author published the book $title in the year $year.")
    
    val allBooks = setOf("Romeo and Juliet", "Macbeth", "Taming of the Shrew", "Hamlet")
    
    val library = mapOf("Shakespeare" to allBooks)
    
    println(library.any {it.value.contains("Hamlet")})
    
    val moreBooks = mutableMapOf<String, String>("Great Expectations" to "Dickens")
    moreBooks.getOrPut("A Tale of Two Cities") {"Dickens"}
}

class Book(val title: String, val author: String, val year: String) {
    
    fun getTitleAuthor() = title to author
    
    fun getTitleAuthorYear() = Triple(title, author, year)
    }
}
