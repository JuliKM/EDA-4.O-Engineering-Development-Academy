# EDA-4.O-Engineering-Development-Academy
Postulacion para Eventbrite
Ejercicio 1:Shogi (entrega parcial)

El juego se ejecuta a partir de la main class llamada "New Class" desde donde se llama a otras clases:

Clase Tablero: Inicializa el tablero de Shogi como una matriz 9x9 con la siguiente distribucion:
Nomenclatura :
10 Casillero Vacío
11 Peon Jugador 1
12 Torre Jugador 1
13 Alfil Jugador 1
15 Lancero Jugador 1
16 Caballo Jugador 1
17 General Plateado Jugador 1
18 General de Oro Jugador 1
19 Rey Jugador 1
21 Peon Jugador 2
22 Torre Jugador 2
23 Alfil Jugador 2
25 Lancero Jugador 2
26 Caballo Jugador 2
27 General Plateado Jugador 2
28 General de Oro Jugador 2
29 Rey Jugador 2

Luego llama a la clase Interfaz desde donde se ejecutan los metodos turno() (para asignar los turnos a los diferentes jugadores) y el metodo jugar() donde se ingresa la posición inicial de la ficha y la final

Posteriormente se llama a la clase Movimientos que tiene los metodos aLugarVacio(), capturar(),   introducir() y promocionar de acuerdo a las diferentes opciones. 
Es necesario desarrollar un metodo para asignar las diferentes posibilidades de estos metodos arriba mencionados, de forma tal de llamar al metodo correspondiente a cada caso.
El metodo booleano validarMov() no escrito aun, valida si los movimientos son validos de hacer. 

El metodo booleano Jaque() no escrito aun, valida si el Rey del adversario se encuentra en situación de Jaque.

El metodo booleano JaqueMate() no escrito aun, valida si se ha producido el JaqueMate y al retornar True finaliza la partida

La clase Capturas crea dos ArrayList <Integer> para el jugador Sente y jugador Gote respectivamente donde se almacenaran las fichas capturadas que posteriormente podrán ser reingresadas.
  
De haber tenido mas tiempo para terminar el proyecto  hubiera organizado la clase Pieza con clases hijas de cada pieza y movimientos que cambiarian de acuerdo a la pieza seleccionada. 
Además también faltan unidades de Unittesting en el ejercicio, solo alcancé a hacer algunos tests a mano, pero no a escribir métodos que autotestearan los métodos.




