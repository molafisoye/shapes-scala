package edu.luc.cs.laufer.cs473.shapes

import org.scalatest.FunSuite

import BoundingBox._
import TestFixtures._

class TestBoundingBox extends FunSuite {

  def testBoundingBox(description: String, s: Shape, x: Int, y: Int, width: Int, height: Int) = {
    test(description) {
	  val b = boundingBox(s)
	  val r = b.shape.asInstanceOf[Rectangle]
	  assert(x === b.x)
	  assert(y === b.y)
	  assert(width === r.width)
	  assert(height === r.height)
    }
  }

// TODO comment these tests back in

//  testBoundingBox("simple circle", simpleCircle, -50, -50, 100, 100)
  testBoundingBox("simple rectangle", simpleRectangle, 0, 0, 80, 120)
  testBoundingBox("simple location", simpleLocation, 70, 30, 80, 120)
//  testBoundingBox("simple group", simpleGroup, 150, 50, 350, 300)
//  testBoundingBox("complex group", complexGroup, 30, 80, 470, 320)
}