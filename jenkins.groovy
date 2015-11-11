@GrabResolver(name='oss', root='https://oss.sonatype.org/content/repositories/snapshots/')
@Grab('com.elevenware:the-baker:0.1-SNAPSHOT', changing=true)
@GrabExclude('org.jenkins-ci.main:jenkins-core')
@GrabExclude('org.jenkins-ci.plugins:job-dsl-core')

import static com.elevenware.baker.JenkinsEnvironment.configure

configure("./estate.json")

