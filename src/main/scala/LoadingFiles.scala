object LoadingFiles {
  def main(args: Array[String]) = {
    import org.apache.spark.sql.SparkSession

    val path = if (args.length > 0) args(0)
    else "C:\\projects\\spark-docker"
    println(s"loading files from: $path")

    val spark = SparkSession
      .builder()
      .master("local[*]")
      .getOrCreate()

    val input = spark
      .read
      .text(path)
      .show
  }
}