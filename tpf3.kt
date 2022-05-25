// Curso Android Telefonica
// Autor: Angel Cellillo
// Mayo 2022
// Neuquén - Argentina


fun main() {
    //     ejer1()
    //     ejer2()
    //     ejer3()
    //     ejer4()
    //     ejer5()
        ejer6()
    }
    
    fun ejer6(){
    
    // Obtener el módulo entre el máximo y el mínimo de la siguiente lista.
    // lista = [893, 755, 708, 746, 801, 581, 187, 688, 492, 579, 469, 195, 918,
    // 667, 7, 15, 212, 114, 635, 331]
    // resultado = 918%7 = 1
    // *** Importante: escribir el código para que funcione con cualquier list y no
    // solamente con la del ejercicio.    
    
        println("ejer6")
    //  val lista = arrayOf(893, 755, 708, 746, 801, 581, 187, 688, 492, 579, 469, 195, 918, 667, 7, 15, 212, 114, 635, 331)
        val lista = arrayOf(13, 15, 2, 888, 925, 16)
        val sorted = lista.sorted()
        val first = sorted.first()
        val last = sorted.last()
        val modulo = last % first
    
        println("Maximo: $last, Mínimo: $first Módulo: $modulo")
        
    } // Ejercicio 6
    
    
    
    fun ejer5(){ // Ejercicio 5
        
    // Contar cuántos elementos de la lista cumple alguna de las siguientes
    // condiciones: El elemento es un carácter en minúscula y es alfanumérico
    // Es un número entero par
        
        val ej5 = arrayOf('a', 2, 5, 'B', 9, 'd', 4, 'o', 7, '%', 3.1, '&')
           var minuscula = 0
        var alfanumerico = 0
        var par = 0
        var numero = 0
     
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
                is Int -> {if ( caracter % 2 == 0 ){ 
                    par++  // ; println("$caracter par")
                                } // else {println("$caracter impar")}
                              } 
            }
        }
        
        println("Cantidad de números pares: $par")
        
    } // Ejercicio 5
    
    
    
    
    fun ejer4(){  // Ejercicio 4
        
    // Dada una lista de números, mostrar por pantalla una lista con todos los
    // múltiplos de 7.
    
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
    
    // Dado un STRING, mostrar por pantalla únicamente las vocales en formato
    // mayúscula.
    // Por ejemplo, con el STRING "Este es un texto de prueba", obtendrá como
    // output ['E', 'E', 'E', 'U', 'I', 'E', 'U', 'E', 'A'].
        
        
        val cadena = "esto es una cadena"
        for (c in cadena) {
            when(c) {
                'a' -> println("$c mayúscula es: ${c.toUpperCase()}")
                'e' -> println("$c mayúscula es: ${c.toUpperCase()}")
                'i' -> println("$c mayúscula es: ${c.toUpperCase()}")
                'o' -> println("$c mayúscula es: ${c.toUpperCase()}")
                'u' -> println("$c mayúscula es: ${c.toUpperCase()}")
                else -> println("$c no es vocal")
            }     	
        }
    } // ejer3
    
    fun ejer2(){ // Ejercicio 2
        
    // Dada una lista o array de números, se pide recorrer los elementos de la
    // lista y almacenar en otra lista el resultado de sumar ese elemento con el
    // anterior.
    // Por ejemplo, dada la lista: [1, 2, 3, 4], se espera que la salida sea una lista
    // con los elementos [3, 5, 7]
        
        val origen: MutableList<Int> = mutableListOf(10,20,30,40)
        val destino: MutableList<Int> = mutableListOf()
        
        var value = 0
        
        for ( (posicion, valor) in origen.withIndex()){
            if ( posicion == 0 ) {
                println("Lista de origen $origen")
            } else {
                value = valor + origen.get(posicion-1)
                destino.add(value)
                println(destino)
            }
                
        }
        
    } // Ejercicio 2
    
    
    fun ejer1(){	// Ejercicio 1
        var a = 34
        var b = 3
        var c = product(a,b)
        var d = sum(a,b)
        
        if ( c < 100 ) {
            println("El producto de los números es $c")
        } else {
            println("El producto de los números es $c \n y la suma es $d")
        }
              
    } // Ejercicio 1
    
       fun product(a: Int, b: Int): Int{
            return a * b
        }
        
        fun sum(a: Int, b: Int): Int{
            return a + b
        } 
