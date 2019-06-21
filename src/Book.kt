constant val MAXBOOKS = 10

fun main(args: Array<String>) {
    val foundation = Book("Foundation", "Isaac Asimov", "1951")
    val (title, author, year) = foundation.getTitleAuthorYear()
    
    println("$author published the book $title in the year $year.")
    
    val allBooks = setOf("Romeo and Juliet", "Macbeth", "Taming of the Shrew", "Hamlet")
    
    val library = mapOf("Shakespeare" to allBooks)
    
    println(library.any {it.value.contains("Hamlet")})
    
    val moreBooks = mutableMapOf<String, String>("Great Expectations" to "Dickens")
    moreBooks.getOrPut("A Tale of Two Cities") {"Dickens"}
    
    val puppy = Puppy()
    
    while (foundation.pages > 0) {
        puppy.playWithBook(foundation)
    }
}

class Book(val title: String, val author: String, val year: String, var pages: Int = 200) {
    
    fun getTitleAuthor() = title to author
    
    fun getTitleAuthorYear() = Triple(title, author, year)
    
    fun canBorrow(val books: Int) = books < MAXBOOKS
    
    companion object Constants {
        constant val BASE_URL = "www.librarybooks.com/"
    }
    
    fun printUrl() {
        println(BASE_URL + title + ".html")
    }
}

fun Book.getWeight() = pages.toFloat() * 1.5

fun Book.tornPages(numTorn: Int) {
    pages = pages - numTorn
    if (pages < 0) pages = 0
}

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random.toNextInt(10))
    }
}
