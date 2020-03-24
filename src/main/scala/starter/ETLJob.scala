package starter

import extract.ExtractImpl
import load.LoadImpl
import transform.TransformImpl

object ETLJob extends App{
    val inputFileName="input.text"
    val content = ExtractImpl.doExtract(inputFileName)
    println(content)
    val transformedContent =TransformImpl.doTransform(content)
    println(transformedContent)
    val outputFileName="output.text"
    LoadImpl.doLoad(outputFileName,transformedContent)
}
