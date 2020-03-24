package load

trait Load {
   def doLoad(outPutFile:String,content:Option[String]):Unit
}
