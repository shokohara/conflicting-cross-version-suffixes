package com.github.shokohara

import cats.kernel.Eq

object Core {
  def checkEq[T: Eq](arg1: T, arg2: T): Boolean = implicitly[Eq[T]].eqv(arg1, arg2)
}
