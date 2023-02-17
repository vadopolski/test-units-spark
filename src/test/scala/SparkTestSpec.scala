import org.apache.spark.sql.QueryTest.checkAnswer
import org.apache.spark.sql.Row
import org.apache.spark.sql.test.SharedSparkSession

class SparkTestSpec extends SharedSparkSession  {
  import testImplicits._
  test("join - join using") {
    val df = Seq(1, 2, 3).toDF("int")

    checkAnswer(df, Row(1) :: Row(2) :: Row(3) :: Nil)
  }
}