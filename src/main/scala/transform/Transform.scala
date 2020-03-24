package transform

trait Transform {
     def doTransform(content:Option[String]):Option[String]
}
