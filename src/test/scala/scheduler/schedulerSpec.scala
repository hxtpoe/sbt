package scheduler

import org.specs2.mock.Mockito
import org.specs2.mutable.Specification
import org.mockito.Matchers._

object schedulerSpec extends Specification with Mockito {

  val m: scheduler = mock[scheduler]
  m.run() returns "running..."

  "run returns correct string" in {
    m.run() must be equalTo("running...")
  }
}