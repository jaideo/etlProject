package extract

import java.io.FileNotFoundException

import scala.io.{BufferedSource, Source}
import scala.util._

object ExtractImpl extends Extract {

  override def doExtract(inputFileName:String) :Option[String] ={
    case class FileMissedExc (message:String="File not in path provided.") extends FileNotFoundException
    try{
      val content:BufferedSource = Source.fromFile(inputFileName)

      def readTextFromFile(content:BufferedSource):Try[String]={
        Try(content.mkString)
      }

      readTextFromFile(content) match {
        case Success(value) => Option(value)
        case Failure(f) =>{
          println(f.getMessage)
          None
        }
      }
    }catch {
      case e:FileNotFoundException => throw new FileMissedExc
    }
    }
}