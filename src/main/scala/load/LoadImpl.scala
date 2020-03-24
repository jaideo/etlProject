package load

import scala.reflect.io.File

object LoadImpl extends Load {
    override def doLoad(outPutFile:String,content:Option[String])={
        content match {
            case Some(value) =>
                File(outPutFile).writeAll(value)
            case None =>
                 println("No Content found to write.")
        }
    }
}
