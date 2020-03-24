package transform

object TransformImpl extends Transform{
      override def doTransform(content :Option[String]):Option[String]={
            content match {
                  case Some(value)=> Option(value.split(' ').map(_.capitalize).mkString(" "))
                  case None => None
            }

      }
}
