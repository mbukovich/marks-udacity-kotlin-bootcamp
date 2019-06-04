fun main(args : Array<String>) {
     for (i in 1..10) {
          var yourFortune = getFortuneCookie()
          println("Your fortune is: " + yourFortune)
          if (yourFortune == "Take it easy and enjoy life!") {
               break
          }
     }
}

fun getFortuneCookie() : String {
     val fortunes = listOf("You will have a great day!",
                          "Things will go well for you today.",
                          "Enjoy a wonderful day of success."
                          "Be humble and all will be well."
                          "Today is a good day for exercising restraint."
                          "Take it easy and enjoy life!"
                          "Treasure your friends because they are your greatest fortune.")
     print("Enter your Birthday.")
     var birthday = readLine()?.toIntOrNull() ?: 1
     return fortunes[birthday.rem(fortunes.size)]
}
