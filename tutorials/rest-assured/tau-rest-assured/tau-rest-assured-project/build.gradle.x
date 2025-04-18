plugins {
    id 'java'
}

group = 'examples'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'

    testImplementation 'io.rest-assured:rest-assured:5.5.1'
}

test {
    useJUnitPlatform()
}
