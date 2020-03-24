package extract

trait Extract {
  def doExtract(inputFilePath:String):Option[String]
}