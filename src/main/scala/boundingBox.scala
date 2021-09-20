package edu.luc.cs.laufer.cs371.shapes

// DONE: implement this behavior

import Shape.*

object boundingBox {
  def apply(s: Shape): Location = s match
    case Rectangle(w,h) => Location(0,0, Rectangle(w,h))
    case _ => Location(0, 0, Rectangle(0, 0)) // implemented
}
// Group is the hardest (try not to reinvent the algorith for group use existing algorithm)
