import org.gradle.api.tasks.*
import org.gradle.api.*

class DownloadNPM extends DefaultTask {
	@Input String npmVersion
	@Input File destinationDir
	@Input String gradleDownloadBase = "http://nodejs.org/dist/"

	@TaskAction doDownloadNPM() {
		destinationFile.bytes = new URL(downloadUrl).bytes
	}

	String getDownloadUrl() {
		//http://nodejs.org/dist/v0.8.20/node-v0.8.20-darwin-x64.tar.gz
		"$gradleDownloadBase/v$npmVersion/$downloadFileName"
	}

	String getDistributionNameBase() {
		"node-v$npmVersion"
	}

	String getDownloadFileName() {
		"$distributionNameBase-darwin-x64.tar.gz"
	}

	@OutputFile File getDestinationFile() {
		new File(destinationDir, downloadFileName)
	}
}