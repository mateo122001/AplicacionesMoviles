package com.mateodevs.evaluacion

class Datasource {
    fun loadLaptops(): List<Laptop>{
    return listOf<Laptop>(
        Laptop(1,R.string.descripcionLaptop1,R.drawable.laptop1),
        Laptop(2,R.string.descripcionLaptop2, R.drawable.laptop2),
        Laptop(3,R.string.descripcionLaptop3, R.drawable.laptop3),
        Laptop(4,R.string.descripcionLaptop4, R.drawable.laptop4)
    )
    }
}
