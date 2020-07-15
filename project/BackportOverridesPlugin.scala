import interplay.PlayBuildBase
import sbt._
import sbt.Keys._

object BackportOverridesPlugin extends AutoPlugin {

  override def requires = PlayBuildBase

  override def trigger = allRequirements

  override def projectSettings: Seq[Def.Setting[_]] = {
    /**
     * Override [[PlayBuildBase.projectSettings]].
     *
     * Identify as our own play mad science.
     *
     * Artifacts have names like "sbt-plugin",
     * so org name has to be descriptive.
     */
    organization := "com.rallyhealth.play"
  }
}
