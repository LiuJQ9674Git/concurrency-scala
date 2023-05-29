package org.learningconcurrency.exercises.ch2

import org.learningconcurrency.ch2.thread
import org.learningconcurrency.log

object Ex1 extends App {

  def parallel[A, B](a: =>A, b: =>B): (A, B) = {
    var aVal: A = null.asInstanceOf[A]
    var bVal: B = null.asInstanceOf[B] 
    
    val t1 = thread {
      aVal = a
      log(aVal.toString())
    }

    val t2 = thread {
      bVal = b
      log(bVal.toString())
    }

    t1.join()
    t2.join()

    (aVal, bVal)
  }

}
