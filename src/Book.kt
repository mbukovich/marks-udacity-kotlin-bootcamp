fun main(args: Array<String>) {
    val foundation = Book("Foundation", "Isaac Asimov", "1951")
    val (title, author, year) = foundation.getTitleAuthorYear()
    
    println("$author published the book $title in the year $year.")
}

class Book(val title: String, val author: String, val year: String) {
    
    fun getTitleAuthor() = title to author
    
    fun getTitleAuthorYear() = Triple(title, author, year)
    }
}
