package com.juhnowski.robotwatch

object Storage {
    val TAG = "Storage"
    @JvmField
    val USERS:ArrayList<User> = ArrayList<User>()

    init {
        USERS.add(User(id = 0,name="Yukhnovskiy.I.Ale",addr = "4к2В.223"))
        USERS.add(User(id = 1,name="Prikazchikov.V.Vl",addr = "4к2В.213"))
        USERS.add(User(id = 3,name="Loparev.G.A",addr = "4к2В.215"))
        USERS.add(User(id = 3,name="Bazina.E.F",addr = "4к2В.219"))
        USERS.add(User(id = 3,name="Efimov.A.R",addr = "5к1"))
    }
}
