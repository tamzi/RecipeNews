
import com.recipenews.app.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project


class JvmLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
                apply("recipenews.android.lint")
            }
            configureKotlinJvm()
        }
    }
}

