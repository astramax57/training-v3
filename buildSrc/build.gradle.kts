plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  google()
  jcenter()
}

dependencies {
  implementation("org.asciidoctor:asciidoctorj:2.2.0")
  implementation("com.amazonaws:aws-java-sdk-s3:1.11.714")
  implementation("com.squareup.okhttp3:okhttp:4.4.0")
  implementation("org.yaml:snakeyaml:1.25")
  implementation("com.beust:klaxon:5.0.1")
  implementation(gradleApi())
}

gradlePlugin {
  plugins {
    create("s3") {
      id = "com.neo4j.gradle.s3.S3Plugin"
      implementationClass = "com.neo4j.gradle.s3.S3Plugin"
    }
    create("asciidoctorModuleDescriptor") {
      id = "com.neo4j.gradle.asciidoctor.AsciidoctorModuleDescriptorPlugin"
      implementationClass = "com.neo4j.gradle.asciidoctor.AsciidoctorModuleDescriptorPlugin"
    }
    create("wordpress") {
      id = "com.neo4j.gradle.wordpress.WordPressPlugin"
      implementationClass = "com.neo4j.gradle.wordpress.WordPressPlugin"
    }
  }
}
