package com.github.shokohara

import cats.kernel.Eq

enum Cat {
  case Lion, Tiger, Cheetah
}

object Cat {
  implicit val eq: Eq[Cat] =  Eq.fromUniversalEquals[Cat]
}
