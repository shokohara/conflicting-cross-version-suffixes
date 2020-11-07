package com.github.shokohara

import cats.kernel.Eq

object Core {
  def checkMssage[T: Eq](arg1: T, arg2: T) = implicitly[Eq[T]].eqv(arg1, arg2)
}
