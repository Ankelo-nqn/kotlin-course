
fun main(){
    
}

fun listaCoPilot()
        val list = listOf(1,2,3,4,5,6,7,8,9,10)
        val list2 = list.filter { it % 2 == 0 }
        println(list2)

================== Ej 1 =================================


fun ejercicioUno(){
    var a = 34
    var b = 3
    var c = product(a,b)
    var d = sum(a,b)
    
    if ( c < 100 ) {
        println("El producto de los números es $c")
    } else {
        println("El producto de los números es $c \n y la suma es $d")
    }
          
}

   fun product(a: Int, b: Int): Int{
        return a * b
    }
    
    fun sum(a: Int, b: Int): Int{
        return a + b
    } 

================== Ej 2 =================================

    

fun listaCoPilot2(){
    
    // crear una lista de valores enteros y filtrar máximo y mínimo de la lista
    val list: Int  = listOf(1,2,3,4,5,6,7,8,9,10)
    val list2: Int = list.filter { it % 2 == 0 }
    println(list2)
    // de la lista list obtener valor máximo y filtrar máximo y mínimo de la lista
    val list3: Int = list.max()
    println(list3)
    val list4: Int = list.min()
    println(list4)
    
}



fun otraLista(){
    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    for (i in list){
            println(IndexOfi)
        }
    // de la lista list recorrer los elementos y crear otra lista con el resultado de sumar ese elemento con el anterior
    val list2 = list.map { it + 1 }
    println(list2)

    }


fun prueba(){

    val numeros = arrayOf(10,20,30,40)
    val numbers = arrayOf(1,2,3)
    var anterior = 0
    
    for ( (posicion, valor ) in numeros.withIndex()) {
            val actual = (valor+anterior)
            numbers.set(posicion, actual)
            anterior = anterior + actual
            println(numbers.get(posicion))
    }
    
}

fun mutables(){
    val origen: MutableList<Int> = mutableListOf(10,20,30,40)
    val destino: MutableList<Int> = mutableListOf()
    
	var value = 0
    
	for ( (posicion, valor) in origen.withIndex()){
//         println("Posición: $posicion Valor: $valor")
        if ( posicion == 0 ) {
//             destino.add(valor)
            println("Lista de origen $origen")
        } else {
            value = valor + origen.get(posicion-1)
            destino.add(value)
            println(destino)
        }
            
    }
    
} // mutables



fun main() {
    ejer5()
    
}

fun main() {
    ejer5()
    
}

fun ejer5(){ // Ejercicio 5
    
// Contar cuántos elementos de la lista cumple alguna de las siguientes
// condiciones: El elemento es un carácter en minúscula y es alfanumérico
// Es un número entero par
	
    val ej5 = arrayOf('a', 2, 5, 'B', 9, 'd', 4, 'o', 7, '%', 3.1, '&')
//     val ej5bis = listOf('a', 2, 5, 'B', 9, 'd', 4, 'o', 7, '%', 3.1, '&')
   	var minuscula = 0
    var alfanumerico = 0
    var par = 0
    var numero = 0
    fun hola(){
        println("hola")
    }
   
    for ( lugar in ej5)
         when (lugar){
             in 0..9 -> {println("$lugar: número entero");
                 numero++; alfanumerico++ } 
             in 'a'..'z' -> { println("$lugar: minúscula");
                 minuscula++; alfanumerico++ }
             in 'A'..'Z' -> {println("$lugar: mayúscula"); alfanumerico++}
             is Float -> { println("$lugar: número float"); alfanumerico++}
             is Double -> { println("$lugar: número double"); alfanumerico++}
             else -> println("$lugar: no es letra ni número entero")
         }
	println("numero entero: $numero \n letra minuscula: $minuscula \n alfanumerico: $alfanumerico")
    
    for ( caracter in ej5) {
        when (caracter) {
            is Int -> {if ( caracter % 2 == 0 ){ par++; println("$caracter par")}  else {println("$caracter impar")}} 
        }
    }
    println("par $par")
    
} // Ejercicio 5





fun ejer4(){  // Ejercicio 4
    val origen = listOf(1,2,7,10,21,14,33)

    for (numero in origen) {
        if (numero % 7 == 0 ) {
            println("$numero es múltiplo de 7")
        } else {
            println("$numero no es múltiplo de 7")
        }
    }
    
} // Ejercicio 4



fun ejer3(){ // Ejercicio 3
    
    val cadena = "esto es una cadena"
    for (c in cadena) {
		when(c) {
            'a' -> println("$c es una ${c.toUpperCase()}")
            'e' -> println("$c es una ${c.toUpperCase()}")
            'i' -> println("$c es una ${c.toUpperCase()}")
            'o' -> println("$c es una ${c.toUpperCase()}")
            'u' -> println("$c es una ${c.toUpperCase()}")
            else -> println("$c no es vocal")
        }     	
    }
} // ejer3

fun mutables(){ // Ejercicio 2
    val origen: MutableList<Int> = mutableListOf(10,20,30,40)
    val destino: MutableList<Int> = mutableListOf()
    
	var value = 0
    
	for ( (posicion, valor) in origen.withIndex()){
//         println("Posición: $posicion Valor: $valor")
        if ( posicion == 0 ) {
//             destino.add(valor)
            println("Lista de origen $origen")
        } else {
            value = valor + origen.get(posicion-1)
            destino.add(value)
            println(destino)
        }
            
    }
    
} // mutables

//     
//     origen.add(50)
//     destino.add(4)
    
//     println(origen.none())
//     println(origen.firstOrNull())
//     println(destino.none())
//     println(destino.firstOrNull())
//     println(origen.elementAtOrNull(3))
//     println(origen.lastOrNull())
//     

// fun lista(){
//     val list = listOf(1,2,3,4,5,6,7,8,9,10)
//     var list2 = listOf(0,0,0,0,0,0,0,0,0)
//     var anterior = 0
//     var actual2 = 0
    
//     for (i in list){
//         var y = i
//     	actual2 = list[i-1] + anterior
//         anterior = list[i-1]
// 		println("Actual $actual2 , anterior: $anterior indice: $i")
// //         list2.set(y, actual2)
//     	list2[i]= actual2    
//     }
// }

fun lista2(){

    val numeros = arrayOf(10,20,30,40)
    val numbers = arrayOf(1,2,3)
    val z = println(numeros.size)      
	var y = 0
    var anterior = 0
    
    for (x in numeros.indices) {
        if ( y > (numeros.size-1) ) {
            println("El índice no existe")
        } else {
            println(x)
            println(numeros.get(y))
            val actual = (numeros.get(y) +anterior)
            numbers.set(y, actual)
            println(numbers.get(y))
            println("Anterior $anterior")
            anterior = anterior + actual
  			y = y + 1        
            println("Actual $actual")
        }

    }
    
}

// 2022-05-16

//     
//     origen.add(50)
//     destino.add(4)
    
//     println(origen.none())
//     println(origen.firstOrNull())
//     println(destino.none())
//     println(destino.firstOrNull())
//     println(origen.elementAtOrNull(3))
//     println(origen.lastOrNull())
//     

// fun lista(){
//     val list = listOf(1,2,3,4,5,6,7,8,9,10)
//     var list2 = listOf(0,0,0,0,0,0,0,0,0)
//     var anterior = 0
//     var actual2 = 0
    
//     for (i in list){
//         var y = i
//     	actual2 = list[i-1] + anterior
//         anterior = list[i-1]
// 		println("Actual $actual2 , anterior: $anterior indice: $i")
// //         list2.set(y, actual2)
//     	list2[i]= actual2    
//     }
// }

fun lista2(){

    val numeros = arrayOf(10,20,30,40)
    val numbers = arrayOf(1,2,3)
    val z = println(numeros.size)      
	var y = 0
    var anterior = 0
    
    for (x in numeros.indices) {
        if ( y > (numeros.size-1) ) {
            println("El índice no existe")
        } else {
            println(x)
            println(numeros.get(y))
            val actual = (numeros.get(y) +anterior)
            numbers.set(y, actual)
            println(numbers.get(y))
            println("Anterior $anterior")
            anterior = anterior + actual
  			y = y + 1        
            println("Actual $actual")
        }

    }
    
}