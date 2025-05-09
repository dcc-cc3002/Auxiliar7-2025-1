package exceptions

import movements.Movement
import creatures.Creature

class NotLearntMovement(m: Movement, c: Creature) extends Exception(s"${m.name} can be use by ${c.name}") {

}