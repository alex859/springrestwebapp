package org.alex859.springrestwebapp

import java.util

import org.alex859.springrestwebapp.model.Person

import scala.collection.JavaConverters

class PersonService {
  def getAll: List[Person] = List(
    Person("John", "Teddy"),
    Person("Ted", "Lucas")
  )

  def getNames: util.Collection[String] = JavaConverters.asJavaCollection(getAll.map(_.firstName))
}
