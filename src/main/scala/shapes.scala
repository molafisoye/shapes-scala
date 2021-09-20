package edu.luc.cs.laufer.cs371.shapes

/** data Shape = Rectangle(w, h) | Location(x, y, Shape) */
enum Shape {
  case Rectangle(width: Int, height: Int)
  case Ellipse(halfWidth: Int, halfHeight: Int)
  case Location(x: Int, y: Int, shape: Shape)
  case Group(shapes: Shape*)
  // DONE add missing cases (see test fixtures)
}
