fun main() {
    var initialWater = 400
    var initialMilk = 540
    var initialCoffeeBeans = 120
    var initialCups = 9
    var initialMoney = 550

    do {
        println("Write action (buy, fill, take, remaining, exit): ")

        var yourFirstChoice = readLine().toString()

        if (yourFirstChoice == "buy") {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
            var coffeeNumber = readln().toString()

            if (coffeeNumber == "back") {
                println("")
            }

            if ((coffeeNumber == "1") && (initialWater < 250)) {
                println("Sorry, not enough water!")
                println("")
            }
            if ((coffeeNumber == "1") && (initialWater - 250 >= 0 && initialCoffeeBeans - 16 >= 0 && initialCups - 1 >= 0)) {
                println("I have enough resources, making you a coffee!")
                println("")
                initialWater -= 250
                initialCoffeeBeans -= 16
                initialCups -= 1
                initialMoney += 4
            }
            if ((coffeeNumber == "2") && (initialWater < 350)) {
                println("Sorry, not enough water!")
                println("")
            }
            if ((coffeeNumber == "2") && (initialWater - 350 >= 0 && initialMilk - 75 >= 0 && initialCoffeeBeans - 20 >= 0 && initialCups - 1 >= 0)) {
                println("I have enough resources, making you a coffee!")
                println("")
                initialWater -= 350
                initialMilk -= 75
                initialCoffeeBeans -= 20
                initialCups -= 1
                initialMoney += 7

            }
            if ((coffeeNumber == "3") && (initialWater < 200)) {
                println("Sorry, not enough water!")
                println("")
            }
            if (coffeeNumber == "3") {
                initialWater -= 200
                initialMilk -= 100
                initialCoffeeBeans -= 12
                initialCups -= 1
                initialMoney += 6
                println("The coffee machine has:")

            }
        }

        if (yourFirstChoice == "fill") {
            println("Write how many ml of water you want to add:")
            var additionalWater = readln().toInt()
            println("Write how many ml of milk you want to add:")
            var additionalMilk = readln().toInt()
            println("Write how many grams of coffee beans you want to add:")
            var additionalCoffee = readln().toInt()
            println("Write how many disposable cups you want to add:")
            var additionalCups = readln().toInt()
            initialWater += additionalWater
            initialMilk += additionalMilk
            initialCoffeeBeans += additionalCoffee
            initialCups += additionalCups
        }

        if (yourFirstChoice == "take") {
            println("I gave you $$initialMoney")
            initialMoney = 0
            println("")
        }
        if (yourFirstChoice == "remaining") {
            println("")
            println("The coffee machine has:")
            println("$initialWater ml of water")
            println("$initialMilk ml of milk")
            println("$initialCoffeeBeans g of coffee beans")
            println("$initialCups disposable cups")
            println("$$initialMoney of money")
            println("")
        }
    } while (yourFirstChoice != "exit")
}