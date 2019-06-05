fun main(args : Array<String>) {
     for (i in 1..10) {
          var yourFortune = getFortuneCookie(getBirthday())
          println("Your fortune is: $yourFortune")
          if (yourFortune.contains("Take it easy")) break
     }
}

fun getFortuneCookie(birthday : Int) : String {
     val fortunes = listOf("You will have a great day!",
                          "Things will go well for you today.",
                          "Enjoy a wonderful day of success."
                          "Be humble and all will be well."
                          "Today is a good day for exercising restraint."
                          "Take it easy and enjoy life!"
                          "Treasure your friends because they are your greatest fortune.")
     return when (birthday) {
          28 || 31 -> fortunes[4]
          0..7 -> fortunes[3]
          else -> fortunes[birthday.rem(fortunes.size)]
     }
}

fun getBirthday () : Int {
     print("Enter your Birthday.")
     return birthday = readLine()?.toIntOrNull() ?: 1
}
