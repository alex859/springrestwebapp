package org.alex859.springrestwebapp.model

import scala.beans.BeanProperty

case class Person(@BeanProperty var firstName: String,
                  @BeanProperty var lastName: String) {

}