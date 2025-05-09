package movements

import types.Fire

class Ember extends AMovement("Ember", 40, new Fire()) {

  override def equals(other: Any): Boolean = other match {
    case e: Ember => true
    case _ => false
  }
}