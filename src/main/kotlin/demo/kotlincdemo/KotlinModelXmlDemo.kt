package demo.kotlincdemo

import org.jetbrains.kotlin.build.JvmSourceRoot
import org.jetbrains.kotlin.incremental.makeModuleFile
import org.jetbrains.kotlin.modules.KotlinModuleXmlBuilder
import java.io.File

/**
 * Created by dumh on 16/6/18.
 */

fun main(args: Array<String>) {
    val builder = KotlinModuleXmlBuilder()
    val outputDir = File("outputDir");
    val sourceToCompile = listOf(
            File("src/main/kotlin/demo/kotlincdemo/Demo.kt").absoluteFile,
            File("src/main/kotlin/demo/kotlincdemo/Demo2.kt").absoluteFile
    )
    val javaSourceRoots = listOf(
            File("src/main/java").absoluteFile
    )
    val classpath = listOf<File>(
            File("/Users/dumh/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.0.2-1/d82877d4faffe1f4acbc266b80b6d3a44cc6bddc/kotlin-stdlib-1.0.2-1.jar").absoluteFile
//            File("/Users/dumh/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-runtime/1.0.2-1/81d15d8f29d74d71c84f13975881fd16833ce933/kotlin-runtime-1.0.2-1.jar").absoluteFile
    )

    builder.addModule(
            "compileKotlin_without_java",
            outputDir.absolutePath,
            sourceToCompile,
            javaSourceRoots.map { JvmSourceRoot(it) },
            classpath,
            "java-production",
            false,
            setOf(outputDir),
            listOf())
    println(builder.asText())


//    val moduleFile = makeModuleFile("model_demo", false, outputDir, sourceToCompile, javaSourceRoots, classpath, listOf())
//    println(moduleFile.absolutePath)
}